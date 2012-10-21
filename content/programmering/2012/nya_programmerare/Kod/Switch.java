public class Switch {
	public static void main(String[] args) {
		
		/* Assignment: */
		
		char key = 'f';
		
		if (key == 'a') {
			System.out.println("Walk left");
		}
		else if (key == 'd') {
			System.out.println("Walk right");
		}
		else if (key == 's') {
			System.out.println("Walk down");
		}
		else if (key == 'w') {
			System.out.println("Walk up");
		}
		else {
			System.out.println("Stand still");
		}
		
		/* Solution: 
			
			switch works with:
			- int
			- byte
			- short
			- char
			- enums
			- String (Java 7)
			- Character, Integer, Byte, Short (wrappers)
		*/
		
		switch(key) {
			case 'w': 	System.out.println("Walk up"); break;
			case 'a': 	System.out.println("Walk left"); break;
			case 's': 	System.out.println("Walk down"); break;
			case 'd': 	System.out.println("Walk right"); break;
			default: 	System.out.println("Stand still");
		}
	}
}