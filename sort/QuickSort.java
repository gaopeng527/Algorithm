package com.cn.gao;

public class QuickSort {
	public static final int SIZE=10;
	//���������һ�λ���
	public static int partition(int[] a,int left, int right){
		int temp,l,r,p;
		l=left;
		r=right;
		p=(left+right)/2;
		temp=a[(left+right)/2];    //���м�Ԫ��Ϊ�ֽ�ֵ
		while(l<r){
			while(a[r]>temp&&l<r) r--;
			if(l<r){
				a[p]=a[r];
				p=r;
			}	
			while(a[l]<temp&&l<r) l++;
			if(l<r){
				a[p]=a[l];
				p=l;
			}
		}
		a[p]=temp;
		return p;
	}
	//���������㷨
	public static void quickSort(int[] a,int left,int right){
		int p;
		if(left<right){
			p=partition(a,left,right);
			quickSort(a,left,p-1);
			quickSort(a,p+1,right);
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[SIZE];
		//Ϊ���鸳ֵ
		for(int i=0;i<a.length;i++){
			a[i] = (int) (100 + Math.random()*100);
		}
		//�������ǰ������
		System.out.println("����ǰ������Ϊ��");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//����������
		quickSort(a,0,a.length-1);
		//�������������
		System.out.println("����������Ϊ��");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
