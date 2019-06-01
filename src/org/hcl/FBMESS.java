package org.hcl;

import java.util.Scanner;

public class FBMESS {
	
	public static void main(String[] args) {
		
	
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number");
	
	int i = s.nextInt();
	
	
	if (i%2==0)
	{
		System.out.println("even no : " +i);
	
	}
	else
	{
		System.out.println("odd no :" +i);
	}
	s.close();


	}
}

