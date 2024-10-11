package com.bptn.course._IL._01_threads._runnable_interface;

public class SynchronizedPrinter {

	
    void printNumbers() {
        
        // Lock the object
    	synchronized(this) {
          System.out.println("Inside of the synchronized block.");
          for( int i=0 ; i<5 ; i++ ) {
              System.out.println(i+1);
              try {
                  Thread.sleep(500);
              } catch(Exception ex) {
                  System.out.println(ex.getMessage());
              }
          }
      
  }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
