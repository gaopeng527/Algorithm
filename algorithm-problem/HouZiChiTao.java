package com.cn.suanfaquti;

import java.util.Scanner;

public class HouZiChiTao {
	/**
	 * 猴子吃桃算法
	 * @param n 天数
	 * @return 桃子数量
	 */
	static int peach(int n){
		int count;
		if(n==1){
			return 1;
		}else{
			count=2*(peach(n-1)+1);
		}
		return count;
	}
	public static void main(String[] args) {
		int n,count;
		System.out.println("猴子吃桃问题求解！");
		System.out.print("请输入天数：");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		count = peach(n);
		System.out.printf("最初桃子的数量为：%d个。\n",count);
	}

}
