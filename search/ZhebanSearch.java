package com.cn.find;

import java.util.Scanner;

//�۰����
public class ZhebanSearch {
	public static final int SIZE=10;
	//�۰�����㷨
	public static int zhebanSearch(int a[],int n, int x){
		int low,high,mid;
		low=0;
		high=n-1;
		while(low<=high){
			mid=(low+high)/2;
			if(a[mid]==x){
				return mid;
			}else if(a[mid]>x){
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
		return -1;
	}
	
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
		while(true){
			System.out.print("������Ҫ���ҵ�ֵ(-1��ʾ����)��");
			Scanner input = new Scanner(System.in);
			int x = input.nextInt();
			if(x==-1) break;
			int index=zhebanSearch(a,SIZE,x);
			if(index<0){
				System.out.println("û���ҵ���");
			}else{
				System.out.println("���ݣ�"+x+" λ������ĵ�"+(index+1)+"��Ԫ�ش���");
			}
		}
		
	}

}
