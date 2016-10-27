import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements of the array: ");
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		
		int pos = -1, element;
		System.out.println("Enter element to search:");
		element = sc.nextInt();
		for(int i = 0; i < n; i++){
			if(a[i] == element){
				pos = i + 1;
			}
		}
		if(pos == -1){
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at position: " + pos);
		}
	}
}
