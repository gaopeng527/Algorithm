package com.cn.gao;
//ð������
public class BubbleSort {
	public static final int SIZE=10;
	//ð�������㷨
	public static void bubbleSort(int[] a){
		int temp;
		for(int i=1;i<a.length;i++){
			for(int j=0;j<a.length-i;j++){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			//���ÿ�������Ľ��
			System.out.print("��"+i+"����������Ϊ��");
			for(int j=0;j<a.length;j++){
				System.out.print(" "+a[j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[SIZE];
		//Ϊ����Ԫ�ظ�ֵ
		for(int i=0;i<a.length;i++){
			a[i] = (int) (100 + Math.random()*100);
		}
		//�������ǰ������Ԫ��
		System.out.println("����ǰ������Ϊ��");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
		//����������
		bubbleSort(a);
		System.out.println("����������Ϊ��");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
	}

}
