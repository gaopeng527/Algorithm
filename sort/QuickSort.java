package com.cn.gao;

public class QuickSort {
	public static final int SIZE=10;
	//快速排序的一次划分
	public static int partition(int[] a,int left, int right){
		int temp,l,r,p;
		l=left;
		r=right;
		p=(left+right)/2;
		temp=a[(left+right)/2];    //将中间元作为分界值
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
	//快速排序算法
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
		//为数组赋值
		for(int i=0;i<a.length;i++){
			a[i] = (int) (100 + Math.random()*100);
		}
		//输出排序前的数组
		System.out.println("排序前的数组为：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//对数组排序
		quickSort(a,0,a.length-1);
		//输出排序后的数组
		System.out.println("排序后的数组为：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
