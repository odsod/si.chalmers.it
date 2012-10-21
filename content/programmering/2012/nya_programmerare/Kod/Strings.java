class Strings {
	public static void main(String[] args) {
		System.out.println(reverse("Johan"));
	}
	
	private static String reverse(String org) {
		char[] ar = org.toCharArray();
		String ret = "";
		
		for(int i = ar.length - 1; i >= 0; i--) {
			ret += ar[i];
		}
		
		return ret;
	}
}