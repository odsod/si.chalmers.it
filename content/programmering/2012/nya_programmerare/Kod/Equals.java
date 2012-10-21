class Equals {
	
	public static void main(String[] args) {
		
		String a = "Johan gillar hästar";
		String b = "Johan gillar hästar";
		String c = a;
		String d = new String("Johan gillar hästar");
		
		int e = 1;
		double f = 1;
		double g = 1.00000000;
		Integer h = 1;
		Integer i = new Integer(1);
		
		if (a == b) {
			System.out.println("Sant 1");
		}
		
		if (a == c) {
			System.out.println("Sant 2");
		}
		
		if (a == d) {
			System.out.println("Sant 3");
		}
		
		if (e == f) {
			System.out.println("Sant 4");
		}
		
		if (f == g) {
			System.out.println("Sant 5");
		}
		
		if (e == h) {
			System.out.println("Sant 6");
		}
		
		if (h == i) {
			System.out.println("Sant 7");
		}
	}
}