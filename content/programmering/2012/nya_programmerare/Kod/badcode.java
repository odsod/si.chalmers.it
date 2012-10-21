class badcode {
	
	public static void main(String[] args) {
		
		int Three;
		Three = 3;
		
		int 1square = Numbertimesitself(Three);
		int ANumber = Numbertimesitself(10);
		
		isThe_Numbers_Equal(1square, ANumber);
	}
	
	
	public static int Numbertimesitself(int z) {
		int f = z;
		int s = f * z;
		
		return s;
	}
	
	
	public static void isThe_Numbers_Equal(int förstasiffranattkolla, int andrasiffranattkolla) {
		boolean true = false;
		
		if (förstasiffranattkolla == andrasiffranattkolla) {
			true = true;
		}
		
		if (true == true) {
			System.out.println("Three equals ANumber!");
		}
		else {
			System.out.println("Three does not equal ANumber!");
		}
	}
	
}