package com.bptn.course._IL._01_threads._runnable_interface;

public class Thread2 extends Thread {

	
    SynchronizedPrinter obj;
    
    // Create a constructor to initialize the above instance variable
    public Thread2(SynchronizedPrinter obj) {
        this.obj = obj;
    }
    // Override the run() method here to call printNumbers()
    @Override
    public void run() {
        obj.printNumbers();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
