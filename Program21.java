import java.util.Scanner;

public class Program21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int n = sc.nextInt();
		sc.close();
		for(int rows = 1; rows <= n; rows++){
			//First loop for the spaces
			for(int space = n - rows; space > 0; space--){
				System.out.print(" ");
			}
			//Second loop if for ABC...
			char ch = 'A';
			for(int i = 1; i <= rows; i++, ch++){
				System.out.print(ch);
			}
			// Third loop is for 123...
			for(int i = rows - 1; i > 0; i--){
				System.out.print(i);
			}
			//Goto the next line
			System.out.println();
		}
	}
}
