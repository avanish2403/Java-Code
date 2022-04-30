package com.pdmu.Green.io;

import java.util.Scanner;

public class ReplaceVowel {

	public static void main(String[] args) {
		String word = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++)
		{
			if("AEIOUaeiou".indexOf(str.charAt(i))==-1)
			{
				word=word+str.charAt(i);
			}
		}
		System.out.println(word);
		sc.close();
	}

	
}
		
		
		
		
//		char[] ch = new char[str.length()];
//		for(int i=0; i<str.length(); i++)
//		{
//			ch[i]=str.charAt(i);
//		}
//		for(int i=0; i<str.length(); i++)
//		{
//		int character[]=new int[100];
//		if(ch[i]=='a'||ch[i]=='A'||ch[i]=='e'||ch[i]=='E'||ch[i]=='i'||ch[i]=='I'||ch[i]=='o'||ch[i]=='O'||ch[i]=='u'||ch[i]=='U');
//		{
//			character[i]=ch[i];
//		}
//		System.out.println(character[i]);
//		}
		
			
		
		
	    
	     
		

	
