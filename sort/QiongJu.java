package com.cn.gao;

import java.util.Scanner;

//��ٷ���⼦��ͬ������
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
		System.out.println("��ٷ���⼦��ͬ�����⣺");
		Scanner input = new Scanner(System.in);
		System.out.print("������ͷ����");
		int head = input.nextInt();
		System.out.print("�����������");
		int foot = input.nextInt();
		int result=qiongJu(head, foot);
		if(result==1){
			System.out.println("����"+chicken+"ֻ������"+rabbit+"ֻ��");
		}else{
			System.out.println("�޷���⣡");
		}
	}
}
