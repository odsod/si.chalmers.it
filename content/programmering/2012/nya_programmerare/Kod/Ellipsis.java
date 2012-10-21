public class Ellipsis {

	private int x;
	private int y;
	private double xradius;
	private double yradius;

	public static void main(String[] args) {
		Ellipsis e1 = new Ellipsis();
		Ellipsis e2 = new Ellipsis(10, 10);
		Ellipsis e3 = new Ellipsis(1.0, 1.0);
		Ellipsis e4 = new Ellipsis(10, 20, 3.0);
		
		e1.setRadius(2.0);
		e3.setPosition(1, 1);
		e2.setRadius(3.0, 1.0);
	}

	public Ellipsis() {
		this(0, 0, 0.0);
		System.out.println("Created a new ellipsis");
	}

	public Ellipsis(int x, int y) {
		this.x = x;
		this.y = y;

		System.out.println("Created a new ellipsis with coordinates");
	}

	public Ellipsis(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.xradius = radius;
		this.yradius = radius;

		System.out.println("Created a new ellipsis with coordinates and a radius");
	}

	public Ellipsis(double radius) {
		this.x = 0;
		this.y = 0;
		this.xradius = radius;
		this.yradius = radius;

		System.out.println("Created a new ellipsis with a radius");
	}

	public Ellipsis(double xradius, double yradius) {
		this.x = 0;
		this.y = 0;
		this.xradius = xradius;
		this.yradius = yradius;

		System.out.println("Created a new ellipsis with an x and y radius");
	}

	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;

		System.out.println("Set position to " + this.x + ", " + this.y);
	}

	public void setRadius(double radius) {
		this.setRadius(radius, radius);
		System.out.println("Set new radius to " + radius);
	}

	public void setRadius(double xradius, double yradius) {
		this.xradius = xradius;
		this.yradius = yradius;

		System.out.println("Set new x and y radius to " + this.xradius + ", " + this.yradius);
	}
}