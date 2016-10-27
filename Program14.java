public class Program14 {
	public static void main(String[] args) {
		Star s = new Star();
		Slash sl = new Slash();
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(sl);
		t1.start();
		t2.start();
	}
}
//extends Thread or implements Runnable
class Star implements Runnable{
	public void run(){
		for(int i = 1; i <= 5; i++){
			System.out.print("*");
			try{
				Thread.sleep(100);
			}catch(Exception e){}
		}
	}
}
class Slash extends Thread{
	public void run(){
		for(int i = 1; i <= 5; i++){
			System.out.print("/");
			try{
				Thread.sleep(100);
			}catch(Exception e){}
		}
	}
}