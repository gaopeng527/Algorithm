package com.cn.datastruct;

import java.util.Scanner;

//�򵥵�Լɪ�����
public class Josephus {
	static final int Num=41;	//������
	static final int KillMan=3;		//��ɱ�߱���
	//Լɪ���㷨
	static void josephus(int alive){
		int []man = new int[Num];
		int count=1;
		int i=0,pos=-1;
		while(count<=Num){
			do{
				pos=(pos+1)%Num;   //������
				if(man[pos]==0)   //ֻ��û��ɱ���˲Ų�����0
					i++;
				if(i==KillMan){   //������ɱ
					i=0;
					break;
				}			
			}while(true);
			man[pos]=count;
			System.out.printf("��%2d������ɱ��Լɪ�򻷱��Ϊ%2d",pos+1,man[pos]);
			if(count%2==1){
				System.out.printf("->");
			}else{
				System.out.printf("->\n");   //�������
			}
			count++;
		}
		System.out.println();
		System.out.printf("��%d����Ҫ�����˵ĳ�ʼλ��Ӧ������������ţ�\n",alive);
		alive = Num - alive;
		for(i=0;i<Num;i++){
			if(man[i]>alive)
				System.out.printf("��ʼ��ţ�%d,Լɪ�򻷱�ţ�%d\n", i+1,man[i]);
		}
		System.out.println();
	}
	public static void main(String[] args){
		int alive;
		System.out.print("Լɪ��������⣡\n");
		System.out.print("��������Ҫ������˵�������");
		Scanner input = new Scanner(System.in);
		alive = input.nextInt();
		josephus(alive);
	}
}
