package com.cn.gao;

public class ShellSort {
	public static final int SIZE=10;
	//ϣ�������㷨
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
			k++;  //��¼����
			System.out.print("��"+k+"����������Ϊ��");
			for(int m=0;m<a.length;m++){
				System.out.print(" "+a[m]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
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
		shellSort(a);
		//�������������Ԫ��
		System.out.println("����������Ϊ��");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
	}
}
