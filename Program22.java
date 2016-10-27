import java.util.Scanner;

public class Program22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		System.out.println("Enter elements of array: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int sabove = 0, son = 0, sbelow = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i < j){
					sabove += a[i][j];
				} else if(i == j){
					son += a[i][j];
				} else {
					sbelow += a[i][j];
				}
			}
		}
		System.out.println("Sum of elements present above diagonal: " + sabove);
		System.out.println("Sum of elements present on diagonal: " + son);
		System.out.println("Sum of elements present below diagonal: " + sbelow);
	}
}
