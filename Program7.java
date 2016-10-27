import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m1, n1, m2, n2;
		System.out.println("Enter m and n for first matrix: ");
		m1 = sc.nextInt();
		n1 = sc.nextInt();
		System.out.println("Enter m and n for second matrix: ");
		m2 = sc.nextInt();
		n2 = sc.nextInt();
		if(n1 == m2){
			int a[][] = new int[m1][n1];
			int b[][] = new int[m2][n2];
			
			System.out.println("Enter elements of first matrix: ");
			for(int i = 0; i < m1; i++){
				for(int j = 0; j < n1; j++){
					a[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Enter elements of second matrix: ");
			for(int i = 0; i < m2; i++){
				for(int j = 0; j < n2; j++){
					b[i][j] = sc.nextInt();
				}
			}
			
			int ans[][] = new int[m1][n2];
			for(int i = 0; i < m1; i++){
				for(int j = 0; j < n2; j++){
					ans[i][j] = 0;
					for(int k = 0; k < m2; k++){
						ans[i][j] += a[i][k] * b[k][j]; 
					}
				}
			}
			
			System.out.println("The result of multiplication is: ");
			for(int i = 0; i < m1; i++){
				for(int j = 0; j < n2; j++){
					System.out.print(ans[i][j] + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("The two matrices cannot be multiplied");
		}
	}
}
