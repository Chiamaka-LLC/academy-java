package com.bptn.course._01_knowledge_checks._01_Threads;

public class MyThread extends Thread {

	int limitToStop;

	/*Create a parameterized constructor in the MyThread class that takes an int as a parameter to 
	initialize a limitToStop instance variable.
	 */

	public MyThread(int limitToStop) {
		this.limitToStop = limitToStop;
	}

	//Override the run() method in the MyThread class

	@Override
	public void run() {
		/*In the run() method, put a for-loop that goes from 0 to limitToStop. 
		 *The block associated with the for loop should print out only the odd numbers (from 0 to limitToStop)
		 */
		for (int i = 0; i<=limitToStop; i++) {
			if (i % 2 != 0) {
				System.out.println(i);


			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
	

	}

}
