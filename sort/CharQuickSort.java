package com.cn.gao;
//�ַ�����������Ŀ�������ʵ��
public class CharQuickSort {
	public static final int SIZE=5;
	//���������һ�λ���
	public static int charPartition(String a[], int left, int right){
		int l,r;
		String temp;
		l=left;
		r=right;
		temp=a[l];			//��Ԫ����Ϊ�ֽ�ֵ
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
	//�ַ�����������Ŀ��������㷨
	public static void charQuickSort(String a[], int left, int right){
		int p;
		if(left<right){
			p = charPartition(a,left,right);
			charQuickSort(a,left,p-1);
			charQuickSort(a,p+1,right);
		}
	}
	public static void main(String[] args) {
		//�������鲢��ʼ��
		String[] a = new String[]{"One","World","Dream","Beijing","Olympic"};	
		//�������ǰ������
		System.out.println("����ǰ������Ϊ��");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//����������
		charQuickSort(a,0,SIZE-1);
		//�������������
		System.out.println("����������Ϊ��");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}

}
