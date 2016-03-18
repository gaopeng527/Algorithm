package com.cn.gao;

import java.util.Random;
import java.util.Scanner;

public class findNumber {
	static final int N=20;
	public static void main(String[] args) {
		int[] arr=new int[N];
		int f=-1;
		int i,x;
		Random r=new Random();
		for(i=0;i<N;i++){
			arr[i]=r.nextInt(100);
		}
		System.out.println("随机生成的数组为：");
		//输出序列
		for(i=0;i<N;i++){
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		System.out.print("请输入要查找的数据：");
		//输入数据
		Scanner input=new Scanner(System.in);
		x=input.nextInt();
		//查找数据
		for(i=0;i<N;i++){
			if(arr[i]==x){
				f=i;
				break;
			}				
		}
		if(f<0){
			System.out.println("在数组中没有找到数据"+x);
		}else{
			System.out.println("数据"+x+"在数组中的第"+(f+1)+"个元素处！");
		}
	}

}
