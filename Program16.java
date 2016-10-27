import java.util.Scanner;

public class Program16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter values of a, b, c and d: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		sc.close();
		try{
			if((b*d) == 0){
				throw new ZeroDivisionException("Oh shit! You divided by zero!");
			} 
			float ans = (a*b + b*c) / (b*d);
			System.out.println(ans);
		} catch(ZeroDivisionException e){}
	}
}
class ZeroDivisionException extends Exception{
	ZeroDivisionException(String str){
		System.out.println(str);
	}
}