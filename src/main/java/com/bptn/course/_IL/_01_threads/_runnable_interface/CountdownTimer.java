package com.bptn.course._IL._01_threads._runnable_interface;

import com.bptn.course._01_knowledge_checks._01_Threads.MyThread;

public class CountdownTimer implements Runnable {
	private int startValue;
	private Runnable countdownTimer;
	// Parameterized constructor
	public CountdownTimer(int startValue) {

		// Assign the startValue parameter to the instance variable   

		this.startValue = startValue;

	}

	@Override
	public void run() {

		// Complete the functionality of run() method. Complete Steps 2,3,4
		for (int i = startValue; i > 0; i--) {
			System.out.println(i);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}


	// Define the main function

	public static void main(String[] args) {

		// Create a new CountdownTimer object with a start value of your choice. For instance: 10
		CountdownTimer countdownTimer = new CountdownTimer(10);




		// Create a new Thread object, passing the countdownTimer object as the Runnable target
		Thread thread = new Thread(countdownTimer);

		// Start the thread by calling the start() method
		thread.start();

		System.out.println("Main thread continues to execute...");


	}

	private void start() {
		// TODO Auto-generated method stub

	}

}
