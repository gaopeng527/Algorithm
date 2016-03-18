package com.cn.gao;

import java.util.Scanner;

//���ַ������п�������
public class CharsQuickSort {
	public static final int SIZE=100;  //�������������ַ���
	//���������һ�λ���
	public static int charsPartition(char a[], int left, int right){
		int l,r;
		char temp;
		l=left;
		r=right;
		temp=a[l];			//��Ԫ����Ϊ�ֽ�ֵ
		while(l<r){
			while(a[r]>temp&&l<r){
				r--;
			}
			if(l<r){
				a[l]=a[r];
				l++;
			}
			while(a[l]<temp&&l<r){
				l++;
			}
			if(l<r){
				a[r]=a[l];
				r--;
			}
		}
		a[l]=temp;
		return l;
	}
	//�ַ�������Ŀ��������㷨
	public static void charsQuickSort(char a[], int left, int right){
		int p;
		if(left<right){
			p = charsPartition(a,left,right);
			charsQuickSort(a,left,p-1);
			charsQuickSort(a,p+1,right);
		}
	}
	public static void main(String[] args) {
		char a[] = new char[SIZE];
		System.out.print("������һ����������ַ�����");
		Scanner input = new Scanner(System.in);
		a = input.next().toCharArray();
		System.out.println("����ǰ:");
		System.out.println(a);
		//����
		charsQuickSort(a,0,a.length-1);
		System.out.println("�����");
		System.out.println(a);
	}

}
