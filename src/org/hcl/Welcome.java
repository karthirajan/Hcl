package org.hcl;

public class Welcome {
	public static void main(String[] args) {
		String s="Welcome to Greens Technology";
		String s2[]=s.split(" ");
		for(int i=s2.length-1; i>=0; i--) {
			System.out.println(s2[i]);
			
		}
	}

}
