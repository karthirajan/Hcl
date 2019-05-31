package org.hcl;

public class Welcome extends Java {
	public void test1() {
		System.out.println("test1");
	}
	public void test3() {
		System.out.println("test2");
		System.out.println("i made some changes");
	}
	public static void main(String[] args) {
	

		Welcome w=new Welcome();
		w.companyName("Renu");
	}
}
