import java.util.Scanner;

public class Program25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements of array: ");
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		sc.close();
		//Take an element i and delete all duplicates j from the array
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(a[j] == a[i]){
					for(int k = j; k < n-1; k++){
						a[k] = a[k+1];
					}
					n--;
					j--;
					// Because after shifting every element to the left, the first element can be another duplicate
				}
			}
		}
		System.out.println("The new array after deleting all the duplicate elements is:");
		for(int i = 0; i < n; i++){
			System.out.print(a[i] + " ");
		}
	}
}
