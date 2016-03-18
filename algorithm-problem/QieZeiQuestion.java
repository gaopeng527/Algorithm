package com.cn.suanfaquti;

import java.util.Scanner;

public class QieZeiQuestion {
	static class GType{	//物品数据结构
		double value;	//价值
		double weight;	//重量
		char isSelect;	//是否选中到方案
	}
	
	static double maxvalue;	//方案最大价值
	static double totalvalue;	//物品总价值
	static double maxwt;	//窃贼能拿的最大重量
	static int num;		//物品数量
	static char[] seltemp;	//临时数组
	/**
	 * 算法
	 * @param goods 物品
	 * @param i	下一个待选物品
	 * @param wt 盗贼现拿物品重量
	 * @param vt 可选物品总价值
	 */
	static void backpack(GType[] goods,int i,double wt,double vt){
		int k;
		if(wt+goods[i].weight<=maxwt){	//将物品i包含在当前方案，判断重量小于等于限制重量
			seltemp[i]=1;	//选中第i个物品
			if(i<num-1){		//如果物品i不是最后一个物品
				backpack(goods,i+1,wt+goods[i].weight,vt);	//递归调用，继续添加物品
			}else{
				for(k=0;k<num;++k){
					goods[k].isSelect=seltemp[k];
				}
				maxvalue=vt;	//保存当前方案的最大价值
			}
		}
		seltemp[i]=0;	//取消物品i的选择状态
		if(vt-goods[i].value>maxvalue){	//还可以继续添加物品
			if(i<num-1){
				backpack(goods,i+1,wt,vt-goods[i].value);	//递归调用
			}else{
				for(k=0;k<num;++k){
					goods[k].isSelect=seltemp[k];
				}
				maxvalue=vt-goods[i].value;
			}
		}
	}
	
	public static void main(String[] args) {
		double sumweight;
		int i;
		System.out.println("窃贼问题求解！");
		System.out.print("窃贼背包能容纳的最大重量：");
		Scanner input = new Scanner(System.in);
		maxwt=input.nextDouble();	//窃贼背包能容纳的最大重量
		System.out.print("可选物品数量：");
		num = input.nextInt(); 	//可选物品的数量
		GType[] goods=new GType[num];
		seltemp = new char[num];
		totalvalue=0;	//初始化总价值
		for(i=0;i<num;i++){
			GType t = new GType();
			System.out.print("输入第"+(i+1)+"号物品的重量和价值：");
			t.weight=input.nextDouble();
			t.value = input.nextDouble();
			totalvalue+=t.value;
			goods[i]=t;
		}
		System.out.print("\n背包最大能装的重量为："+maxwt+"\n\n");
		for(i=0;i<num;i++){
			System.out.println("第"+(i+1)+"号物品重："+goods[i].weight+",价值："+goods[i].value);
			seltemp[i]=0;
		}
		maxvalue=0;
		backpack(goods,0,0.0,totalvalue);	//求解
		sumweight=0;
		System.out.println("\n可将以下物品装入背包，使背包的物品价值最大：");
		for(i=0;i<num;++i){
			if(goods[i].isSelect==1){
				System.out.println("第"+(i+1)+"号物品，重量："+goods[i].weight+"，价值："+goods[i].value);
				sumweight+=goods[i].weight;
			}
		}
		System.out.println("\n总重量为："+sumweight+"，总价值为："+maxvalue);
	}

}
