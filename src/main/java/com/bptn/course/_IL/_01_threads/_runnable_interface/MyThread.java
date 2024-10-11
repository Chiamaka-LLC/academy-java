package com.bptn.course._IL._01_threads._runnable_interface;

public class MyThread extends Thread {

    
    // Create a constructor to initialize the printer instance variable.
	SynchronizedPrinter printer;
	public MyThread(SynchronizedPrinter printer) {
    	this.printer = printer;
    }
    // Override the run() method to call printNumbers() method of the printer instance variable.
    @Override
    public void run() {
    	printer.printNumbers();
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
