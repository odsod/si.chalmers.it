public class TruthTests {

	public static void main(String[] args) {
		
		if (true && (false || true)){
			System.out.println("Yay 1");
		}
		
		/* ------------------------ */
		
		if (!true && !(true && false)) {
			System.out.println("Yay 2");
		} else {
			System.out.println("Nay 2");
		}
		
		/* ------------------------ */
		
		int var = 9;
		
		if ( !(5 > 10) && !(40 % 10 == 0)) {
			System.out.println("Yay 3");
		}
		else if (10 == var++){
			System.out.println("Yay 3.5");
		}
		else {
			System.out.println("Nay 3");
		}
		
		/* ------------------------ */
		
		int herp = 1;
		
		if (herp++ == 2) {
			System.out.println("Yay 4");
		}
		else if (++herp == 3){
			System.out.println("Yay 4.5");
		}
		else {
			System.out.println("Nay 4");
		}
		
		/* ------------------------ */
		
		int derp = 10;
		
		if (derp == 11)
			System.out.println("Yay 5");
			System.out.println("Yay 6");

	}

}