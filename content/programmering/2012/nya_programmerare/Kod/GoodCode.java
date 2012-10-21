class GoodCode {
	
	public static void main(String[] args) {
		
		int firstSquare = square(3);
		int secondSquare = square(10);
		
		printIfEquals(firstSquare, secondSquare);
	}
	
	
	public static int square(int num) {
		return num*num;
	}
	
	
	public static void printIfEquals(int firstNumber, int secondNumber) {

		if (firstNumber == secondNumber) {
			System.out.println("The numbers are equal!");
		}
		else {
			System.out.println("The numbers are not equal!");
		}
		
	}
	
}