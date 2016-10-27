import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int r = 0, d, t = n;
		while(n != 0){
			d = n % 10;
			r = r * 10 + d;
			n = n / 10;
		}
		if(t == r){
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}
		sc.close();
	}
}
