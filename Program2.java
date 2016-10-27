import java.util.*;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int r = 0, d, t = n;
		while(n != 0){
			d = n % 10;
			r = r + d * d * d;
			n = n / 10;
		}
		if(r == t){
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
		sc.close();
	}
}
