package com.cn.gao;
//ѡ������
public class SelectSort {
	public static final int SIZE = 10;
	//ѡ�������㷨
	public static void selectSort(int[] a){
		int temp,min;
		for(int i=0;i<a.length-1;i++){
			min=i;
			//�ҳ���СԪ���±�
			for(int j=i+1;j<a.length;j++){
				if(a[min]>a[j]){
					min=j;
				}
			}
			//����Ԫ��
			if(min!=i){
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
			//���ÿ��������
			System.out.print("��"+(i+1)+"����������Ϊ��");
			for(int j=0;j<a.length;j++){
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
		selectSort(a);
		//�������������
		System.out.println("����������Ϊ��");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

}
