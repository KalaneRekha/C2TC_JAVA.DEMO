package Multithreading;

public class Eclipse1 extends Thread {
	
		
		public void run()
		{
		    
			for (int i = 0; i < 3; i++) {
				System.out.println("Eclipse Thread name is" + Thread.currentThread().getName());
				
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

	class MultiThreading{
		
		public static void main(String[] args) {
			Eclipse e=new Eclipse();
			e.start();
			
			Eclipse e1=new Eclipse();
			e1.start();
			
			   
			}
		}

