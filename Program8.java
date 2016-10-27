import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		System.out.println("Enter elements of matrix: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i < j){
					int t = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = t;
				}
			}
		}
		System.out.println("The transpose of the given matrix is: ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
