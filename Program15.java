import java.util.Scanner;

public class Program15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++){
			try{
				int x = sc.nextInt();
				if(x < 0){
					throw new NegNumberException("Number is negative");
				}
				sum += x;
				a[i] = x;
			} catch(NegNumberException e){
				System.exit(0);
			}
		}
		System.out.println("Sum of elements: " + sum);
		sc.close();
	}
}
class NegNumberException extends Exception{
	NegNumberException(String str){
		System.out.println(str);
	}
}