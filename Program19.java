import java.util.Scanner;

public class Program19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of student: ");
		String name = sc.nextLine();
		System.out.println("Enter roll no: ");
		int roll_no = sc.nextInt();
		System.out.println("Enter sub1 and sub2 marks:");
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		System.out.println("Enter sports score: ");
		int score = sc.nextInt();
		Result r = new Result(name, roll_no, sub1, sub2);
		r.get_score(score);
		r.calculate();
		sc.close();
	}
}
interface Sports{
	//This is by default public final and static
	void get_score(int s);  
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
class Result extends Test implements Sports{
	int total = 0, score;
	Result(String n, int r, int s1, int s2){
		super(n,r,s1,s2);
	}
	//Note the public method because this is not public by default this is default by default xD
	@Override
	public void get_score(int s){
		score = s;
	}
	void calculate(){
		total = sub1 + sub2 + score;
		System.out.println("Total: " + total);
	}
}