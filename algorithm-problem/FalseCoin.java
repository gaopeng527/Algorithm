package com.cn.suanfaquti;

import java.util.Scanner;

public class FalseCoin {
	static final int MAXNUM=30;	//最大硬币数
	static int falseCoin(int coin[],int low,int high){
		int i,sum1,sum2;
		int re=0;
		sum1=sum2=0;
		if(low+1==high){
			if(coin[low]<coin[high]){
				re=low+1;
				return re;
			}else{
				re=high+1;
				return re;
			}
		}
		//如果n是偶数
		if((high-low+1)%2==0){
			//记录前一半的重量
			for(i=low;i<low+(high-low+1)/2;i++){
				sum1+=coin[i];
			}
			//记录后一半的重量
			for(i=low+(high-low+1)/2;i<=high;i++){
				sum2+=coin[i];
			}
			if(sum1<sum2){
				re = falseCoin(coin,low,low+(high-low+1)/2-1);
			}else if(sum1>sum2){
				re = falseCoin(coin,low+(high-low+1)/2,high);
			}
		}else{		//n为奇数
			//记录前一半的重量
			for(i=low;i<low+(high-low)/2;i++){
				sum1+=coin[i];
			}
			//记录后一半的重量
			for(i=low+(high-low)/2+1;i<=high;i++){
				sum2+=coin[i];
			}
			if(sum1<sum2){
				re = falseCoin(coin,low,low+(high-low)/2-1);
			}else if(sum1>sum2){
				re = falseCoin(coin,low+(high-low)/2+1,high);
			}else{
				re=low+(high-low)/2+1;
				return re;
			}
		}
		return re;
	}
	public static void main(String[] args) {
		int[] coin=new int[MAXNUM];
		int i,n,result;
		System.out.println("分治法求解假银币问题！");
		System.out.print("请输入银币总个数：");
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		System.out.print("请输入银币重量：");
		for(i=0;i<n;i++){
			coin[i]=input.nextInt();
		}
		result = falseCoin(coin,0,n-1);	//求解
		System.out.printf("在上述%d个银币中，第%d个银币是假的！",n,result);
	}

}
