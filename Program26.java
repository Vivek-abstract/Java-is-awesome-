import java.util.Scanner;

//What is the Exact meaning of the problem statement?

public class Program26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		sc.nextLine();
		// One extra location for the new string
		String[] my_array = new String[n + 1];
		System.out.println("Enter elements in array: ");
		for(int i = 0; i < n; i++){
			my_array[i] = sc.nextLine();
		}
		System.out.println("Enter String to insert: ");
		String s = sc.nextLine();
		System.out.println("Enter location to insert: ");
		int pos = sc.nextInt();
		if(pos > 0 && pos <= n + 1){
			// Assuming user counts from 1,2,3 when pos = 1 we must insert at first position (0)
			pos--; 
			//First we shift everything to the right
			for(int i = n; i > pos; i--){
				my_array[i] = my_array[i-1];
			}
			
			//Then we insert the string at the right position
			my_array[pos] = s;
			for(int i = 0; i < n + 1; i++){
				System.out.println(my_array[i] + " ");
			}
		} else {
			System.out.println("Invalid Input");
		}
		sc.close();
	}
}
