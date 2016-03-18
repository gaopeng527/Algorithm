package com.cn.gao;
//堆排序程序设计
public class HeapSort {
	public static final int SIZE=10;
	//堆排序算法
	public static void heapSort(int[] a, int n){
		int i,j,temp,k;
		//建大根堆过程
		for(i=n/2-1;i>=0;i--){
			while(2*i+1<n){   //如果有孩子节点
				j=2*i+1;  //i的左孩子
				if(j+1<n&&a[j]<a[j+1]){  //保证j所指的为左右孩子中最大的
					j++;
				}
				if(a[j]>a[i]){   //交换节点的值使其满足堆的性质
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					i=j;   //改变了堆的结构，重新调整
				}else{
					break;
				}
			}		
		}
		//输出建好的堆
		System.out.print("建好的堆为：");
		for(j=0;j<n;j++){
			System.out.print(" "+a[j]);
		}
		System.out.println();
		//排序调整过程
		for(i=n-1;i>0;i--){
			temp=a[0];
			a[0]=a[i];
			a[i]=temp;
			k=0;
			while(2*k+1<i){
				j=2*k+1;
				if(j+1<i&&a[j]<a[j+1]){  //保证j所指的为左右孩子中最大的
					j++;
				}
				if(a[j]>a[k]){   //交换节点的值使其满足堆的性质
					temp=a[k];
					a[k]=a[j];
					a[j]=temp;
					k=j;   //改变了堆的结构，重新调整
				}else{
					break;
				}
			}
			System.out.print("第"+(n-i)+"次排序后的结果为：");
			for(j=0;j<n;j++){
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
		heapSort(a,SIZE);
		//输出排序后的数组
		System.out.println("排序后的数组为：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}

}
