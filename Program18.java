import java.util.Scanner;

public class Program18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of student: ");
		String name = sc.nextLine();
		System.out.println("Enter roll no: ");
		int roll_no = sc.nextInt();
		System.out.println("Enter sub1 and sub2 marks:");
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		Result r = new Result(name, roll_no, sub1, sub2);
		r.calculate();
		sc.close();
	}
}
class Student{
	String name;
	int roll_no;
	Student(String n, int r){
		name = n;
		roll_no = r;
	}
}
class Test extends Student{
	int sub1,sub2;
	Test(String n, int r, int s1, int s2){
		super(n,r);
		sub1 = s1;
		sub2 = s2;
	}
}
class Result extends Test{
	int total = 0;
	Result(String n, int r, int s1, int s2){
		super(n,r,s1,s2);
	}
	void calculate(){
		total = sub1 + sub2;
		System.out.println("Total: " + total);
	}
}