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
		System.out.println("������ɵ�����Ϊ��");
		//�������
		for(i=0;i<N;i++){
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		System.out.print("������Ҫ���ҵ����ݣ�");
		//��������
		Scanner input=new Scanner(System.in);
		x=input.nextInt();
		//��������
		for(i=0;i<N;i++){
			if(arr[i]==x){
				f=i;
				break;
			}				
		}
		if(f<0){
			System.out.println("��������û���ҵ�����"+x);
		}else{
			System.out.println("����"+x+"�������еĵ�"+(f+1)+"��Ԫ�ش���");
		}
	}

}
