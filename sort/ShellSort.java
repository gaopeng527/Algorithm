package com.cn.gao;

public class ShellSort {
	public static final int SIZE=10;
	//希尔排序算法
	public static void shellSort(int[] a){
		int d,i,j,temp,k=0;;
		for(d=a.length/2;d>=1;d/=2){
			for(i=d;i<a.length;i++){
				temp=a[i];
				j=i-d;
				while(j>=0&&a[j]>temp){
					a[j+d]=a[j];
					j-=d;
				}
				a[j+d]=temp;				
			}
			k++;  //记录步数
			System.out.print("第"+k+"步的排序结果为：");
			for(int m=0;m<a.length;m++){
				System.out.print(" "+a[m]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		int[] a = new int[SIZE];
		//为数组元素赋值
		for(int i=0;i<a.length;i++){
			a[i] = (int) (100 + Math.random()*100);
		}
		//输出排序前的数组元素
		System.out.println("排序前的数组为：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
		//对数组排序
		shellSort(a);
		//输出排序后的数组元素
		System.out.println("排序后的数组为：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
	}
}
