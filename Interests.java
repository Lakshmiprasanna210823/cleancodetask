package com.lasya;
import java.util.*;
public class Interests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.format("%s","Select your options:1)Simple Interest 2)Compound Interest");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: SI obj1 =new SI();
			   System.out.format("%s","enter principal,rate and timeperiod");
		       float p = sc.nextFloat();
		       float r = sc.nextFloat();
		       float t = sc.nextFloat();
		       float result = obj1.CalculateSI(p,r,t);
		       System.out.format("%f",result);
		       break;
		case 2:CI obj2 = new CI();
		       System.out.format("%s","Enter principle,rate and number of years");
		       double p2 = sc.nextDouble();
		       double r2 = sc.nextDouble();
		       double t2 = sc.nextDouble();
		       double result1 = obj2.calculateCI(p2,r2,t2);
		       System.out.format("%f",result1);
		       break;

		}


	}

}
