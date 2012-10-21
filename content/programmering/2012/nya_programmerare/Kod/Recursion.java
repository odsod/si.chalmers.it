class Recursion {
	public static void main(String[] args) {
		System.out.println(add(10, 6));
	}
	
	static String reverse(String s) {
		if(s.isEmpty())
			return "";

		char lastChar = s.charAt(s.length() - 1);
		return lastChar + reverse(s.substring(0, s.length() - 1));
	}
	
	static String reverse2(String s) {
		if(s.isEmpty()) {
			return "";
		}
		
		return reverse2(s.substring(1)) + s.charAt(0);
	}
	
	static int nbrOfChars(String s) {
		if(s.isEmpty()) {
			return 0;
		}
				
		return 1 + nbrOfChars(s.substring(1));
	}
	
	static int sum(int n) {
		if(n == 1) {
			return 1;
		}
		
		return n + sum(n-1);
	}
	
	
	
	static int add(int a, int b) {
		if (a < 0 || b < 0) {
			throw new IllegalArgumentException("Negative value");
		}
		if(b == 0) {
			return a;
		}else if (a < b) {
			return add(b,a);
		}
		return add(a + 1, b - 1);
	}
	
	
	
	
	static int fibonacci(int n) {
		if(n < 2) {
			return n;
		}
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	static int fibonacci2(int n) {
		int[] fib = new int[n+1];
		fib[1] = fib[2] = 1;
		
		for(int i = 3; i <= n; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}

		return fib[n];
	}
	
	static int sgd(int a, int b) {
		if(b == 0) {
			return a;
		}

		return sgd(b, a % b);
	}
}