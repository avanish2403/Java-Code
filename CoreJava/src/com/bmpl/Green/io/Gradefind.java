package com.bmpl.Green.io;

import java.util.*;
class Gradefind
{
public static void main(String[] args)
{
int m1,m2,m3,m4,m5;
int t,av;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 marks");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
m4=sc.nextInt();
m5=sc.nextInt();
t=m1+m2+m3+m4+m5;
av=t/5;
switch (av/10)
{
case 10:System.out.println("Average Mark is "+av+" Grade is A++");
break;
case 9:
System.out.println("Average Mark is "+av+" Grade is A++");
break;
case 8:
System.out.println("Average Mark is "+av+" Grade is A++");
break;
case 7:
System.out.println("Average Mark is "+av+" Grade is A");
break;
case 6:
System.out.println("Average Mark is "+av+" Grade is A");
break;
case 5:
System.out.println("Average Mark is "+av+" Grade is B");
break;
case 4:
System.out.println("Average Mark is "+av+" Grade is C");
break;
default:
	System.out.println("Average Mark is "+av+" Grade is F");
}
sc.close();
}
}