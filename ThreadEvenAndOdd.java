package Threads;

import java.util.Scanner;

 class EvenThread extends Thread{
	 private int number;
	 public EvenThread(int number) {
		 this.number=number;
	 }
	public void run() {
		
		for(int i=2;i<=number;i+=2) {
			System.out.println("Even numbers"+i);
				  try {
		            	Thread.sleep(500);
		            	} 
		            catch (InterruptedException e) {
		            	e.printStackTrace(); 
		            }
		        }
		}
}
 class OddThread extends Thread{
	 private int number;
	 public OddThread(int number) {
		 this.number=number;
	 }
	public void run() {
		
		for(int i=1;i<=number;i+=2) {
			System.out.println("Odd numbers"+i);
				  try {
		            	Thread.sleep(500);
		            	} 
		            catch (InterruptedException e) {
		            	e.printStackTrace(); 
		            }
		}
		
	}
}
public class ThreadEvenAndOdd{
	
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		EvenThread et=new EvenThread(number);
		OddThread ot=new OddThread(number);
		et.start();
		ot.start();
	}
}

