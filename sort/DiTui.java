package com.cn.gao;

import java.util.Scanner;

//递推法求解兔子产仔问题
public class DiTui {
	public static int fibonacci(int n){
		int f1,f2;
		if(n==1||n==2){
			return 1;
		}else{
			f1=fibonacci(n-1);
			f2=fibonacci(n-2);
			return f1+f2;
		}
	}
	
	public static void main(String[] args){
		System.out.println("递推法求解兔子产仔问题:");
		System.out.print("请输入时间（月）:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int num = fibonacci(n);
		System.out.println("经过"+n+"月的时间，共能繁殖成"+num+"对兔子！");
	}
}
