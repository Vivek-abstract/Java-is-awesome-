import java.util.Scanner;


public class Program9 {
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
		int flag = 1;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(a[i][j] != a[j][i]){
					flag = 0;
				}
			}
		}
		if(flag == 1){
			System.out.println("Symmetric");
		} else {
			System.out.println("Not Symmetrix");
		}
	}
}
