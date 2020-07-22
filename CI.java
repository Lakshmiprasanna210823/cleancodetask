package com.Interest;
import java.lang.Math;
public class CI {
 double calculateCI(double P2,double r2,double t2)
 {
	 return (P2*(Math.pow(1+r2/100,t2)));
 }
}
