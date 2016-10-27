public class Program31 {
	public static void main(String[] args) {
		Letter l = new Letter();
		Digit d = new Digit();
		Thread t1 = new Thread(l);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();
	}
}
class Letter extends Thread{
	public void run(){
		char ch = 'A';
		for(int i = 1; i <= 5; i++){
			System.out.print(ch);
			ch++;
			try{
				Thread.sleep(100);
			} catch(Exception e){}
		}
	}
}
class Digit extends Thread{
	public void run(){
		for(int i = 1; i <= 5; i++){
			System.out.print(i);
			try{
				Thread.sleep(100);
			} catch(Exception e){}
		}
	}
}