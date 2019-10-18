package com.exam;

public class Timer implements Runnable{

	private boolean complete = false;
	
	public boolean isComplete() {
		return this.complete;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			complete = true;
		}
	}
	
}
