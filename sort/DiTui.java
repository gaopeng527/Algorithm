package com.cn.gao;

import java.util.Scanner;

//���Ʒ�������Ӳ�������
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
		System.out.println("���Ʒ�������Ӳ�������:");
		System.out.print("������ʱ�䣨�£�:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int num = fibonacci(n);
		System.out.println("����"+n+"�µ�ʱ�䣬���ܷ�ֳ��"+num+"�����ӣ�");
	}
}
