package com.cn.gao;

import java.util.Scanner;

//对字符串进行快速排序
public class CharsQuickSort {
	public static final int SIZE=100;  //可以输入的最大字符数
	//快速排序的一次划分
	public static int charsPartition(char a[], int left, int right){
		int l,r;
		char temp;
		l=left;
		r=right;
		temp=a[l];			//首元素作为分界值
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
	//字符串排序的快速排序算法
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
		System.out.print("请输入一个待排序的字符串：");
		Scanner input = new Scanner(System.in);
		a = input.next().toCharArray();
		System.out.println("排序前:");
		System.out.println(a);
		//排序
		charsQuickSort(a,0,a.length-1);
		System.out.println("排序后：");
		System.out.println(a);
	}

}
