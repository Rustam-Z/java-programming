/**
 * Student: Rustam Zokirov ID: U1910049 Lab: #10
 */

class ThreadPrime extends Thread {
	public void run() {
		int ct = 0, n = 0, i = 1, j = 1;
		while (n < 10) {
			j = 1;
			ct = 0;
			while (j <= i) {
				if (i % j == 0)
					ct++;
				j++;
			}
			if (ct == 2) {
				System.out.println("Prime: " + i);
				n++;
			}
			i++;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ThreadNonPrime extends Thread {
	public void run() {		
		int x = 18; //end of the interval
		int y = 2; //first of the interval
		for(int i = y + 1; i < x; i++) {
			for(int j = 2; j < i; j++) {  
				if((i % j ==0 )) {
					System.out.println("Non-Prime: " + i);
					break;
				}
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class PrimeNum {
	public static void main(String[] arg) {
		ThreadPrime thread1 = new ThreadPrime();
		ThreadNonPrime thread2 = new ThreadNonPrime();
			
		thread1.start();
		thread2.start();
	}
}
