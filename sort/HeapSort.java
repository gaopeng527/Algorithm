package com.cn.gao;
//������������
public class HeapSort {
	public static final int SIZE=10;
	//�������㷨
	public static void heapSort(int[] a, int n){
		int i,j,temp,k;
		//������ѹ���
		for(i=n/2-1;i>=0;i--){
			while(2*i+1<n){   //����к��ӽڵ�
				j=2*i+1;  //i������
				if(j+1<n&&a[j]<a[j+1]){  //��֤j��ָ��Ϊ���Һ���������
					j++;
				}
				if(a[j]>a[i]){   //�����ڵ��ֵʹ������ѵ�����
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					i=j;   //�ı��˶ѵĽṹ�����µ���
				}else{
					break;
				}
			}		
		}
		//������õĶ�
		System.out.print("���õĶ�Ϊ��");
		for(j=0;j<n;j++){
			System.out.print(" "+a[j]);
		}
		System.out.println();
		//�����������
		for(i=n-1;i>0;i--){
			temp=a[0];
			a[0]=a[i];
			a[i]=temp;
			k=0;
			while(2*k+1<i){
				j=2*k+1;
				if(j+1<i&&a[j]<a[j+1]){  //��֤j��ָ��Ϊ���Һ���������
					j++;
				}
				if(a[j]>a[k]){   //�����ڵ��ֵʹ������ѵ�����
					temp=a[k];
					a[k]=a[j];
					a[j]=temp;
					k=j;   //�ı��˶ѵĽṹ�����µ���
				}else{
					break;
				}
			}
			System.out.print("��"+(n-i)+"�������Ľ��Ϊ��");
			for(j=0;j<n;j++){
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
		heapSort(a,SIZE);
		//�������������
		System.out.println("����������Ϊ��");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}

}
