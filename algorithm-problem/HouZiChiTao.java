package com.cn.suanfaquti;

import java.util.Scanner;

public class HouZiChiTao {
	/**
	 * ���ӳ����㷨
	 * @param n ����
	 * @return ��������
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
		System.out.println("���ӳ���������⣡");
		System.out.print("������������");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		count = peach(n);
		System.out.printf("������ӵ�����Ϊ��%d����\n",count);
	}

}
