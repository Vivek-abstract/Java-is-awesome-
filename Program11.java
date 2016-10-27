import java.util.Scanner;

public class Program11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println("Enter word to replace: ");
		String replace_this = sc.nextLine();
		System.out.println("Enter new word: ");
		String replace_by = sc.nextLine();
		s = s.replaceAll(replace_this, replace_by);
		System.out.println("The new string is: " + s);
		sc.close();
	}
}
