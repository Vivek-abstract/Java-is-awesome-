import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int r = 0, d, sum = 0;
		while(n > 0){
			d = n % 10;
			sum += d;
			r = r*10 + d;
			n = n / 10;
		}
		System.out.println("Reverse = " + r + "\nSum of digits = " + sum);
		sc.close();
	}
}
