//This program works for all numbers
public class Program27a {
	public static void main(String[] args) {
		String s = args[0];
		char[] ch = s.toCharArray();
		for(char c: ch){
			switch(c){
				case '0':
					System.out.print("ZERO ");
					break;
				case '1':
					System.out.print("ONE ");
					break;
				case '2':
					System.out.print("TWO ");
					break;
				case '3':
					System.out.print("THREE ");
					break;
				case '4':
					System.out.print("FOUR ");
					break;
				case '5':
					System.out.print("FIVE ");
					break;
				case '6':
					System.out.print("SIX ");
					break;
				case '7':
					System.out.print("SEVEN ");
					break;
				case '8':
					System.out.print("EIGHT ");
					break;
				case '9':
					System.out.print("NINE ");
					break;
			}
		}
	}
}
