package com.cn.math;

import java.text.DecimalFormat;

//多项式求值
public class Polynomial {
	/**
	 * 
	 * @param a中为多项式系数，次数由低到高
	 * @param n为数组a的大小
	 * @param x求值点
	 * @return
	 */
	public static double polynomial(double a[],int n,double x){
		int i;
		double result=a[n-1];
		for(i=n-2;i>=0;i--){
			result=result*x+a[i];
		}
		return result;
	}
	public static void main(String[] args) {
		double result;
		double a[] = {-15.0,-7.0,7.0,2.0,-3.0,7.0,3.0};
		double x[] = {-2.0,-0.5,1.0,2.0,3.7,4.0};
		
		DecimalFormat df = new DecimalFormat("0.000000E000");
		DecimalFormat df1 = new DecimalFormat("0.00");
		
		for(int i=0;i<x.length;i++){
			result = polynomial(a,a.length,x[i]);
			System.out.println("x="+df1.format(x[i])+"时，P(x)="+df.format(result));
		}

	}

}
