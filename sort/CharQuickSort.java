package com.cn.gao;
//字符串数组排序的快速排序实现
public class CharQuickSort {
	public static final int SIZE=5;
	//快速排序的一次划分
	public static int charPartition(String a[], int left, int right){
		int l,r;
		String temp;
		l=left;
		r=right;
		temp=a[l];			//首元素作为分界值
		while(l<r){
			while(a[r].compareTo(temp)>0&&l<r){
				r--;
			}
			if(l<r){
				a[l]=a[r];
				l++;
			}
			while(a[l].compareTo(temp)<0&&l<r){
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
	//字符串数组排序的快速排序算法
	public static void charQuickSort(String a[], int left, int right){
		int p;
		if(left<right){
			p = charPartition(a,left,right);
			charQuickSort(a,left,p-1);
			charQuickSort(a,p+1,right);
		}
	}
	public static void main(String[] args) {
		//声明数组并初始化
		String[] a = new String[]{"One","World","Dream","Beijing","Olympic"};	
		//输出排序前的数组
		System.out.println("排序前的数组为：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//对数组排序
		charQuickSort(a,0,SIZE-1);
		//输出排序后的数组
		System.out.println("排序后的数组为：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}

}
