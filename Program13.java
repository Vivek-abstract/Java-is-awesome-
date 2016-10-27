import java.util.Scanner;

public class Program13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		sc.close();
		try{
			if(n >= 0){
				factorial(n);
			} else {
				throw new NegNumberException("Number is -ve");
			}
		}catch(NegNumberException e){}
	}
	static void factorial(int n){
		long f = 1;
		for(int i = 1; i <= n; i++){
			f *= i;
		}
		System.out.println("Factorial of " + n + " = " + f);
	}
}
class NegNumberException extends Exception{
	NegNumberException(String str){
		System.out.println(str);
	}
}
