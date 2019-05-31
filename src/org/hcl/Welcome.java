package org.hcl;

<<<<<<< HEAD
public class Welcome extends Java {
	public void test1() {
		System.out.println("test1");
	}
	public void test3() {
		System.out.println("test2");
		System.out.println("i made some changes");
=======
public class Welcome {
	public static void main(String[] args) {
		String s="Welcome to Greens Technology";
		String s2[]=s.split(" ");
		for(int i=s2.length-1; i>=0; i--) {
			System.out.println(s2[i]);
			
		}
>>>>>>> 60560c8a467a49fdeb695bf2414bdfddb35a6849
	}
	public static void main(String[] args) {
	

		Welcome w=new Welcome();
		w.companyName("Renu");
	}
}
