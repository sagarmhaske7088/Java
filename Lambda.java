package compdemo;

import java.util.concurrent.TimeUnit;

public class Lambda {

	public static void main(String[] args) {
		
		System.out.println("test...");
		// TODO Auto-generated method stub
		
		Thread t1,t2,t3;
		System.out.println("Shop open");
		t1=new Thread(()->System.out.println("Making is biscuit"));
		t2=new Thread(()->System.out.println("Packing is biscuit"));
		t3=new Thread(()->System.out.println("Selling is biscuit"));
		
		try {
			TimeUnit.SECONDS.sleep(3);
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Shop Close");

}
}


	


