import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter elements of array: ");
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		// The most Naive Sort ever
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				if(a[i] > a[j]){
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println("The sorted array is:");
		for(int i = 0; i < n; i++){
			System.out.print(a[i] + " ");
		}
		sc.close();
	}
}
