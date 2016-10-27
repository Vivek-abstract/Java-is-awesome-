import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		if(n < 2){
			System.out.println("Invalid input");
		} else {
			int a[] = new int[n];
			System.out.println("Enter the elements: ");
			for(int i = 0; i < n; i++){
				a[i] = sc.nextInt();
			}
			
			int largest, second_largest;
			largest = second_largest = Integer.MIN_VALUE;
		
			for(int i = 0; i < n; i++){
				if(a[i] > largest){
					second_largest = largest;
					largest = a[i];
				} else if(a[i] > second_largest && a[i] != largest){
					second_largest = a[i];
				}
			}
			System.out.println("Largest = " + largest);
			System.out.println("Second largest = " + second_largest);
		}
		sc.close();
	}
}
