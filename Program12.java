import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		int n = s.length();
		char c[] = new char[n];
		c = s.toCharArray();
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(c[i] > c[j]){
					char t = c[i];
					c[i] = c[j];
					c[j] = t;
				}
			}
		}
		s = new String(c);
		System.out.println("The new sorted string is: ");
		System.out.println(s);
		sc.close();
	}
}
