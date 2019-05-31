package org.hcl;

public class Java {
	public void companyName(String name) {
		System.out.println("Company Name is\t"+name);
	}
	public void companyName(int Id,float Sal) {
		System.out.println("ID\t"+Id+"\tSal\t"+Sal);
	}
	public void test1() {
		System.out.println("test1");
	}
	public void test2() {
		System.out.println("test2");
	}
	public void test4() {
		System.out.println("test4");
		System.out.println("i did");	
	}
	public void compID(int id) {
		System.out.println("company id is" + id);
	}
	
	public void companyName(float NetSal,int Serialno,String location) {
		System.out.println("NetSal\t"+NetSal+"\tSerial no\t"+Serialno+"\tLocation\t"+location);
	}
	
	public static void main(String[] args) {
		Java c=new Java();
		c.companyName("ACL");
		c.companyName(5465, 4612312f);
		c.companyName(5465, 5, "Chennai");
		c.compID(7);
	}
			
}

