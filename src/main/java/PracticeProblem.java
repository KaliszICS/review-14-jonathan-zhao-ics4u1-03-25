
public class PracticeProblem {
	
	public static void main(String args[]) {

	}
	public static int calculate(int num1, int num2, char c) {
	int sum = 0;
		switch (c) {
		case '+': 
			sum = (num1 + num2);
			break;
		case '-': 
			sum = (num1 - num2);
			break;
		case '*': 
			sum = (num1 * num2);
			break;
		case '/': 
			sum = (int)Math.floor(num1 / num2);
			break;
		case '%': 
			sum = (num1 % num2);
			break;
		case '^': 
			sum = (int)(Math.pow(num1, num2));
			break;
		}
		return sum;
	}

	final static int MAXIMUM = 10;
	public static boolean totalWordsChecker(String word) {
			return word.split("[^A-Za-z'_]+").length <= MAXIMUM;
	

		
	}

		
	

	
	public static String minString(String s1, String s2, String s3){
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		s3 = s3.toLowerCase();
		if (s1.compareTo(s2) < 0){
			if (s1.compareTo(s3) < 0){
				return s1;
			} else {
				return s3;
			}

		} else {
			if (s2.compareTo(s3) < 0){
				return s2;
			} else {
				return s3;
		}
	
	
	}
	
	}
}


