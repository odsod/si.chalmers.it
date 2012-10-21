import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
*	Pass 5
*/
public class Swing  {
	
	public static void main(String[] args) {
		new GridFrame();
	}
	
}

class GridFrame extends JFrame implements ActionListener {
	
	public GridFrame() {
		setTitle("Apple piskar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocation(600, 300);
		
		// eller
		// setBounds(600, 300, 300, 300);
		
		setLayout(new GridLayout(3, 3));
		Container panel = getContentPane();
		
		for(int i = 1; i <= 9; i++) {
			JButton button = this.createButton("Button "+i, new Color(i*10, i*15, i*20));
			panel.add(button);
		}
		
		pack();
		setVisible(true);
	}
	
	private JButton createButton(String title, Color bg) {
		JButton button = new JButton(title);

		button.setOpaque(true);
		button.setBorderPainted(false);
		
		button.setForeground(Color.WHITE);
		button.setBackground(bg);
		
		button.addActionListener(this);
		
		return button;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton src = (JButton) e.getSource();
			Color bg = src.getBackground();
			JOptionPane.showMessageDialog(this, "The background color is " + bg);
		}
	}
}