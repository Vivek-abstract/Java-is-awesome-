import java.util.Scanner;

public class Program30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		sc.close();
		char[] c = s.toCharArray();
		int nAlpha = 0, nDigits  = 0, nSpl = 0;
		for(int i = 0; i < c.length; i++){
			if(Character.isLetter(c[i])){
				nAlpha++;
			} else if(Character.isDigit(c[i])){
				nDigits++;
			} else {
				//You are special xD
				nSpl++;
			}
		}
		System.out.println("Number of Alphabets: " + nAlpha);
		System.out.println("Number of Digits: " + nDigits);
		System.out.println("Number of Special Characters: " + nSpl);
	}
}
