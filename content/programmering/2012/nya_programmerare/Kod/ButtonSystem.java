public class ButtonSystem {
	public static void main(String[] args) {
		new ButtonSystem();
	}
	
	// Main program
	
	public ButtonSystem() {
		
		Button addButton = new Button("Add", 30, 20);
		Button deleteButton = new Button("Delete", 30, 20);
		
		deleteButton.setListener(new DeleteListener());
		addButton.setListener(new AddListener());
		
		// Simulate clicks
		
		deleteButton.click();
		System.out.println("********");
		addButton.click();
		System.out.println("********");
		
		System.out.println("Are the buttons equal?\n" + addButton.equals(deleteButton));
	}
	
	private class AddListener implements Listener {
		public void fire(Event evt) {
			System.out.println("Added thing to system with event " + evt);
			System.out.println("The event came from " + evt.getSource());
		}
	}
	
	private class DeleteListener implements Listener {
		public void fire(Event evt) {
			System.out.println("Delete thing from system with event " + evt);
			System.out.println("The event came from " + evt.getSource());
		}
	}
}

abstract class AbstractButton {
	
	private Listener listener = null;
	private String label;
	private int width;
	private int height;
	
	private static int CLICKS = 0;
	
	public AbstractButton(String label) {
		this(label, 20, 10);
	}
	
	public AbstractButton(String label, int width, int height) {
		this.label = label;
		this.width = width;
		this.height = height;
	}
	
	public void setListener(Listener l) {
		this.listener = l;
	}
	
	public String toString() {
		// ****************
		// Implement this!
		
		return "<RETURN NICE STRING HERE YES>";
	}
	
	public void click() {
		if(this.listener != null) {
			int newID = ++CLICKS;
			Event event = new Event(newID, this);
			
			this.listener.fire(event);
		}
	}
	
	public boolean equals(Object obj) {
		// ***************
		// Implement this!
		
		return true;
	}
}

class Button extends AbstractButton {
	
	public Button(String label) {
		super(label);
	}
	
	public Button(String label, int width, int height) {
		super(label, width, height);
	}
}

class Event {
	private Object source;
	private int id;
	
	public Event(int id, Object source) {
		this.id = id;
		this.source = source;
	}
	
	public Object getSource() {
		return this.source;
	}
	
	public String toString() {
		// ****************
		// Implement this!
		
		return "<RETURN NICE STRING HERE YES>";
	}
}

interface Listener {
	public void fire(Event evt);
}