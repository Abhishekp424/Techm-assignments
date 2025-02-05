package Threads;

public class ThreadExample extends Thread{

	public void run() {
		System.out.println("hello, Java!");
	}
		
public static void main(String[] arg) {
	ThreadExample th=new ThreadExample();
	th.start();
	
}
}
