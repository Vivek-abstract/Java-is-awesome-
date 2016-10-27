import java.util.Scanner;

public class Program17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("1.Teacher\n2.Typist\n3.Officer");
		System.out.println("--------------");
		System.out.println("Enter choice: ");
		choice = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter name: ");
		String name = sc.nextLine(); 
		System.out.println("Enter code: ");
		int code = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter address: ");
		String address = sc.nextLine();
		switch(choice){
			case 1:
				System.out.println("Enter subject and publication: ");
				String subject = sc.nextLine();
				String publication = sc.nextLine();
				Teacher t = new Teacher(code, name, address, subject, publication);
				t.display();
				break;
			case 2:
				System.out.println("Enter speed in wpm: ");
				int speed = sc.nextInt();
				Typist ty = new Typist(code, name, address, speed);
				ty.display();
				break;
			case 3:
				System.out.println("Enter grade: ");
				String grade = sc.nextLine();
				Officer o = new Officer(code, name, address, grade);
				o.display();
				break;
		}
		sc.close();
	}
}
class Staff{
	int code;
	String name, address;
	Staff(int c, String n, String a){
		code = c;
		name = n;
		address = a;
	}
	void display(){
		System.out.println("Name: " + name);
		System.out.println("Code: " + code);
		System.out.println("Address: " + address);
	}
}
class Teacher extends Staff{
	String subject, publication;
	Teacher(int c, String n, String a, String s, String p){
		super(c,n,a);
		subject = s;
		publication = p;
	}
	@Override
	void display(){
		super.display();
		System.out.println("Subject: " + subject);
		System.out.println("Publication: " + publication);
	}
}
class Typist extends Staff{
	int speed;
	Typist(int c, String n, String a, int s){
		super(c,n,a);
		speed = s;
	}
	@Override
	void display(){
		super.display();
		System.out.println("Speed: " + speed);
	}
}
class Officer extends Staff{
	String grade;
	public Officer(int c, String n, String a, String g) {
		super(c,n,a);
		grade = g;
	}
	@Override
	void display(){
		super.display();
		System.out.println("Grade: " + grade);
	}
}