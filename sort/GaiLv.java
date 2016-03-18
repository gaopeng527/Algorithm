package com.cn.gao;

import java.util.Scanner;

//蒙特卡罗概率算法计算π
public class GaiLv {
	public static double MontePI(int n){
		double PI;
		double x,y;
		int i,sum=0;
		for(i=0;i<n;i++){
			x=Math.random(); //产生0-1之间的随机数
			y=Math.random();
			if(x*x+y*y<=1){
				sum++;
			}
		}
		PI=4.0*sum/n;
		return PI;
	}
	
	public static void main(String[] args){
		System.out.println("蒙特卡罗概率算法计算π：");
		System.out.print("输入点的数量为：");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double PI = MontePI(n);
		System.out.println("PI="+PI);
	}
}
