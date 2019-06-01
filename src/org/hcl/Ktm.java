package org.hcl;

public class Ktm implements Bike {

	@Override
	public void cost() {
		// TODO Auto-generated method stub
	System.out.println("Cost of Ktm");	
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
	System.out.println("Speed of Ktm");
	}
public static void main(String[] args) {
	Ktm k=new Ktm();
	k.cost();
	k.speed();
}

}
