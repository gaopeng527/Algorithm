package com.cn.gao;

import java.util.Scanner;

//穷举法求解鸡兔同笼问题
public class QiongJu {
	static int chicken,rabbit;
	public static int qiongJu(int head,int foot){
		int result=0,i;
		for(i=0;i<=head;i++){
			if(i*2+(head-i)*4==foot){
				chicken=i;
				rabbit=head-i;
				result=1;
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		System.out.println("穷举发求解鸡兔同笼问题：");
		Scanner input = new Scanner(System.in);
		System.out.print("请输入头数：");
		int head = input.nextInt();
		System.out.print("请输入脚数：");
		int foot = input.nextInt();
		int result=qiongJu(head, foot);
		if(result==1){
			System.out.println("鸡有"+chicken+"只，兔有"+rabbit+"只。");
		}else{
			System.out.println("无法求解！");
		}
	}
}
