package com.cn.gao;

import java.util.Scanner;

//���ؿ��޸����㷨�����
public class GaiLv {
	public static double MontePI(int n){
		double PI;
		double x,y;
		int i,sum=0;
		for(i=0;i<n;i++){
			x=Math.random(); //����0-1֮��������
			y=Math.random();
			if(x*x+y*y<=1){
				sum++;
			}
		}
		PI=4.0*sum/n;
		return PI;
	}
	
	public static void main(String[] args){
		System.out.println("���ؿ��޸����㷨����У�");
		System.out.print("����������Ϊ��");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double PI = MontePI(n);
		System.out.println("PI="+PI);
	}
}
