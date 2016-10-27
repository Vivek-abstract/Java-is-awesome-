import java.util.Scanner;

public class Program24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String jps = sc.nextLine();
		//First let's capitalize the first letter
		jps = Character.toUpperCase(jps.charAt(0)) + jps.substring(1);
		
		//Now find " " and capitalize the char after " "
		char c[] = jps.toCharArray(); 
		for(int i = 0; i < c.length; i++){
			if(c[i] == ' '){
				jps = jps.substring(0, i + 1) + Character.toUpperCase(jps.charAt(i+1)) + jps.substring(i+2);
			}
		}
		System.out.println("The new string is: \n" + jps);
		sc.close();
	}
}
