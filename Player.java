package com.exam;

public class Player implements Runnable, Cloneable{
	int id;
	String name;
	Timer time; 
	Object ball;
	public Player(int id, String name, Timer time, Object ball) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
		this.ball = ball;
	}

	public Player clone(){ 		
			try {
				return (Player)super.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub 
		while(time.isComplete() == false) {
			synchronized(ball) {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				System.out.println("Number " + id + " owns the ball");
			} 
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		
	}

}
