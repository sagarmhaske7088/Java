package com;

import java.util.concurrent.TimeUnit;

public class Multipal {

	public static void main(String[] args) {
		System.out.println("Open Shop");
		Thread t1,t2,t3;
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			System.out.println("Macking The Biscuit");	
			}
		};
		Runnable r2=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			System.out.println("packing The Biscuit");	
			}
		};
		Runnable r3=new Runnable(){
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Seeling The Biscuit");
				
				System.out.println("Shop close");
			}
		};
		try {
			TimeUnit.SECONDS.sleep(2);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
		
		
		
		t1=new Thread(r1);
		t2=new Thread(r2);
		t3=new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
