package com.lulu.variables;

public class VariableTypes {

	public static void main(String[] args) {
		System.out.println("Variable Types");
		
		//Int addition
		int no1;
		int no2;
		int result;
		no1=3;
		no2=7;
		result=no1+no2;
		System.out.println("Result is "+result);
		
		//Float add
		float n1 = 3.5f;
		float n2 = 7.5f;
		float res = n1+n2;
		System.out.println("Result is "+res);
		
		//char
		char s='s';
		System.out.println("Character is "+s);
		
		//String
		String str="Hello";
		String trs="World";
		String st=str+trs;
		System.out.println("String is "+st);
		
		//Boolean
		boolean b1=true;
		boolean b2=false;
		
		int m1=3;
		int m2=5;
		if(m1>m2) {
			System.out.println(b1);
		}
		else {
			System.out.println(b2);
		}
		
		//Byte
		byte c1=103;
		byte c2=-103;
		System.out.println(c1+","+c2);
				
	}

}
