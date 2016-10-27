import java.util.Scanner;

public class Program23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
		System.out.println("Enter radius: ");
		int r = sc.nextInt();
		sc.close();
		c.sphere(r);
		c.hemisphere(r);
	}
}
interface Volume{
	void sphere(int r);
	void hemisphere(int r);
}
class Calculator implements Volume{
	@Override
	public void sphere(int r){
		double ans = ( 4 * Math.PI * Math.pow(r, 3) ) / 3;
		System.out.println("Volume of sphere = " + ans);
	}
	@Override
	public void hemisphere(int r){
		double ans2 = ( 2 * Math.PI * Math.pow(r, 3) ) / 3;
		System.out.println("Volume of hemisphere = " + ans2);
	}
}