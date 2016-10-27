import java.util.Scanner;


public class Program10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n  = sc.nextInt();
		sc.nextLine();
		String my_array[] = new String[n];
		System.out.println("Enter the strings: ");
		for(int i = 0; i < n; i++){
			my_array[i] = sc.nextLine();
		}
		
		System.out.println("Enter string to search: ");
		String element = sc.nextLine();
		int pos = -1;
		for(int i = 0; i < n; i++){
			if(my_array[i].equals(element)){
				pos= i + 1;
			}
		}
		if(pos == -1){
			System.out.println("String not found");
		} else {
			System.out.println("String found at position: " + pos);
		}
		sc.close();
	}
}
