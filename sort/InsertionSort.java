package com.cn.gao;
//插入排序
public class InsertionSort {
	public static final int SIZE=10;
	//插入排序算法
	public static void insertionSort(int[] a){
		int i,j,temp;
		for(i=1;i<a.length;i++){
			temp=a[i];
			j=i-1;
			while(j>=0&&a[j]>temp){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
			//输出每步排序结果
			System.out.print("第"+i+"步的排序结果为：");
			for(j=0;j<a.length;j++){
				System.out.print(" "+a[j]);
			}
			System.out.println();
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
		insertionSort(a);
		//输出排序后的数组
		System.out.println("排序后的数组为：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}

}
