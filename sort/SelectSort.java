package com.cn.gao;
//选择排序
public class SelectSort {
	public static final int SIZE = 10;
	//选择排序算法
	public static void selectSort(int[] a){
		int temp,min;
		for(int i=0;i<a.length-1;i++){
			min=i;
			//找出最小元素下标
			for(int j=i+1;j<a.length;j++){
				if(a[min]>a[j]){
					min=j;
				}
			}
			//交换元素
			if(min!=i){
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
			//输出每步排序结果
			System.out.print("第"+(i+1)+"步的排序结果为：");
			for(int j=0;j<a.length;j++){
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
		selectSort(a);
		//输出排序后的数组
		System.out.println("排序后的数组为：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
