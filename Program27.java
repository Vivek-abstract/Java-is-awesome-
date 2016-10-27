//This program doesn't work for 100, 10 etc where last digit is 0
public class Program27 {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		//First we reverse the number
		int r = 0;
		while(n > 0){
			int d = n % 10;
			r = r * 10 + d;
			n /= 10;
		}
		while(r > 0){
			int d = r % 10;
			r /= 10;
			switch(d){
				case 0:
					System.out.print("ZERO ");
					break;
				case 1:
					System.out.print("ONE ");
					break;
				case 2:
					System.out.print("TWO ");
					break;
				case 3:
					System.out.print("THREE ");
					break;
				case 4:
					System.out.print("FOUR ");
					break;
				case 5:
					System.out.print("FIVE ");
					break;
				case 6:
					System.out.print("SIX ");
					break;
				case 7:
					System.out.print("SEVEN ");
					break;
				case 8:
					System.out.print("EIGHT ");
					break;
				case 9:
					System.out.print("NINE ");
					break;
			}
		}
	}
}
