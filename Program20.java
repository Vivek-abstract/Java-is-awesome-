import java.util.*;

public class Program20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector data = new Vector();
		int rpt = 1;
		
		while(rpt != 0){
			System.out.println("-----Menu-----");
			System.out.println("1.Integer\n2.Float\n3.Double\n4.Student\n5.Display");
			System.out.println("--------------");
			System.out.println("Enter choice: ");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter an integer: ");
					int n = sc.nextInt();
					data.addElement(n);
					System.out.println(n + " is successfully added.");
					display(data);
					break;
				case 2:
					System.out.println("Enter a float: ");
					float f = sc.nextFloat();
					data.addElement(f);
					System.out.println(f + " is successfully added.");
					display(data);
					break;
				case 3:
					System.out.println("Enter a double: ");
					double d = sc.nextDouble();
					data.addElement(d);
					System.out.println(d + " is successfully added.");
					display(data);
					break;
				case 4:
					//Lets get rid of any previous new lines
					sc.nextLine();
					System.out.println("Enter name: ");
					String name = sc.nextLine();
					System.out.println("Enter roll no and total: ");
					int roll_no = sc.nextInt();
					int total = sc.nextInt();
					Baccha b = new Baccha(name,roll_no,total);
					data.addElement(b);
					System.out.println(name + " is successfully added.");
					display(data);
					break;
				case 5:
					display(data);
					break;
			}
			System.out.println("Do you want to continue? (1/0): ");
			rpt = sc.nextInt();
		}
		sc.close();
	}
	static void display(Vector v){
		System.out.println("The elements of the vector are: ");
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}
}
class Baccha{
	public String name;
	int roll_no, total;
	Baccha(String n, int r, int t){
		name = n;
		roll_no = r;
		total = t;
	}
	public String toString(){
		String s = "Student Name: " + name + "\n" +
				   "Roll No: " + roll_no + "\n" +
			 	   "Total: " + total;
		return s;
	}
}