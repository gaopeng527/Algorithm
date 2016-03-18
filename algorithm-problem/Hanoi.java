package com.cn.suanfaquti;

import java.util.Scanner;

public class Hanoi {
	static long count;	//�ƶ��Ĵ���
	/**
	 * ��ŵ���㷨,�����Ӵ�a�ƶ���c
	 * @param n ������Ŀ
	 * @param a	���ӱ�ʶ
	 * @param b ���ӱ�ʶ
	 * @param c ���ӱ�ʶ
	 */
	static void hanoi(int n,char a,char b,char c){
		if(n==1){
			System.out.printf("��%d���ƶ���\t%c->%c\n",++count,a,c);
		}else{
			hanoi(n-1,a,c,b);
			System.out.printf("��%d���ƶ���\t%c->%c\n",++count,a,c);
			hanoi(n-1,b,a,c);
		}
	}
	public static void main(String[] args) {
		int n;
		count =0;
		System.out.println("��ŵ��������⣡");
		System.out.print("���������ӵ�������");
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		hanoi(n,'A','B','C');
		System.out.printf("�����ϣ��ܹ���Ҫ%d���ƶ���\n",count);
	}

}
