package com.string;
import java.util.*;
//by literal//direct value
//by new keyword
public class TestString {

	public static void main(String[] args) {
	/*	String name="Sakshi";    
		String name1=new String("Sony");
		char ch[]= {'s','i','t','a'};
		String name2=new String(ch);
		System.out.println(name+" "+name1+" "+name2);
		
		String s1="hello";//scp
		String s2=new String("hello");//heap
		
		if(s1.equals(s2))//method to compare string
			System.out.println("equal");
		else
			System.out.println("not equal");
		
		//Syso
		if(s1.equalsIgnoreCase(s2))//method to compare string
			System.out.println("equal");
		else
			System.out.println("not equal");
		
		System.out.println(s1==s2);//reference
		
		String s3="Apple";
		String s4="Banana";
		System.out.println(s3.compareTo(s4));
		
		String s="Sachin"+"Tendulkar";
		System.out.println(s);
		s=s.concat("symbiosis");
		System.out.println(s);
	
		String s6=50+30+"Sakshi"+40+40;
		System.out.println(s6);
		
	
		
		String s7="Sachine Tendulkar";
		System.out.println(s7.substring(6));
		System.out.println(s7.substring(0,6));
		
		String s9="Sakshi";
		System.out.println(s9.toUpperCase());
		
		System.out.println(s9.toLowerCase());
		System.out.println(s9);
		
		String s11="Sony";
		System.out.println(s11.startsWith("so"));
		System.out.println(s11.endsWith("y"));
		
		String s12=" teju ";
		System.out.println(s12);
		System.out.println(s.trim());
		
		String s13="Vijay";
		System.out.println(s13.charAt(0));//v
		System.out.println(s13.charAt(3));//a
		
		int a=10;
		String s14 =String.valueOf(a);
		System.out.println(s14+20);
		
		String s55="Java is a programming language.Java is a platform.Java is an Island";
		String replaceString=s55.replace("Java","Kava");
		System.out.println();
		
		String str="Study Tonight";
		System.out.println(str.indexOf('u'));
		System.out.println(str.indexOf('t',3));
		String subString="Ton";
		System.out.println(str.indexOf(subString));
		System.out.println(str.indexOf(subString,7));
		
		
		*/
	

            Scanner sc=new Scanner (System.in);
            System.out.println("enter an array of string");
            String str=sc.nextLine();
           // String str1="Hello@Yesh@how@r@you";
            String[]s=str.split(" ",5);
            for(String i:s)
            	System.out.println(i);
}
}