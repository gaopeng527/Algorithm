package com.cn.gao;
//��������
public class InsertionSort {
	public static final int SIZE=10;
	//���������㷨
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
			//���ÿ��������
			System.out.print("��"+i+"����������Ϊ��");
			for(j=0;j<a.length;j++){
				System.out.print(" "+a[j]);
			}
			System.out.println();
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
		insertionSort(a);
		//�������������
		System.out.println("����������Ϊ��");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}

}
