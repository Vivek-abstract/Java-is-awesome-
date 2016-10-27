import java.util.Scanner;

public class Program29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int rows = sc.nextInt();
		System.out.println("Enter number of subjects: ");
		int col = sc.nextInt();
		int[][] data = new int[rows][col];
		
		for(int i = 0; i < rows; i++){
			System.out.println("Data of Student " + (i+1));
			for(int j = 0; j < col; j++){
				System.out.println("Enter marks of subject " + (j+1) + ":");
				data[i][j] = sc.nextInt();
			}
		}
		sc.close();
		//We go row by row and print the data and corresponding row totals
		System.out.println("Marks of Students");
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < col; j++){
				System.out.print(data[i][j] + "\t");
			}
			System.out.println("|\t" + row_total(data,i,col));
		}
		System.out.println("-----------------------------------");
		//Now we print the column totals and also calculate the grand total
		int grand_total = 0;
		for(int i = 0; i < col; i++){
			System.out.print(col_total(data,rows,i) + "\t");
			grand_total += col_total(data,rows,i);
		}
		//Now we print the grand total
		System.out.print( "|\t" + grand_total);
	}
	static int row_total(int a[][], int row, int col){
		int sum = 0;
		for(int j = 0; j < col; j++){
			sum += a[row][j];
		}
		return sum;
	}
	static int col_total(int a[][], int row, int col){
		int sum = 0;
		for(int i = 0; i < row; i++){
			sum += a[i][col];
		}
		return sum;
	}
}
