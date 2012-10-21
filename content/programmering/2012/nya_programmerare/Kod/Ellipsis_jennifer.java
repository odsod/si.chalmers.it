public class Ellipsis {

	private int x;
	private int y;
	private double xradius;
	private double yradius;

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