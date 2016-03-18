package com.cn.suanfaquti;

public class EightQueen {
	static int iCount=0;	//全局变量
	static int[] WeiZhi=new int[8];	//全局数组
	static void Output(){
		int i,j,flag=1;
		System.out.printf("第%2d种方案(★表示皇后):\n", ++iCount);	//输出序号
		System.out.printf("     ");
		for(i=1;i<=8;i++){
			System.out.print("▁");
		}
		System.out.println();
		for(i=0;i<8;i++){
			System.out.print("▕");
			for(j=0;j<8;j++){
				if(WeiZhi[i]-1==j){
					System.out.print("★");	//皇后的位置
				}else{
					if(flag<0){
						System.out.print("     ");	//棋格
					}else{
						System.out.print("■");	//棋格
					}
				}
				flag=-1*flag;
			}
			System.out.println("▏ " );
			flag=-1*flag;
		}
		System.out.print("     ");
		for(i=1;i<=8;i++){
			System.out.print("▔");
		}
		System.out.println();
	}
	
	//算法
	static void eightQueen(int n){
		int i,j;
		int ct;	//用于判断是否冲突
		if(n==8){
			Output();	//输出求解结果
			return;
		}
		for(i=1;i<=8;i++){	//试探
			WeiZhi[n]=i;	//在该列的第i行上放置
			//判断第n个皇后是否与前面的皇后形成攻击
			ct=1;
			for(j=0;j<n;j++){
				if(WeiZhi[n]==WeiZhi[j]){	//形成攻击
					ct=0;
				}else if(Math.abs(WeiZhi[j]-WeiZhi[n])==(n-j)){	//形成攻击
					ct=0;
				}else{
					
				}
			}
			if(ct==1)	//没有冲突，就开始下一列的试探
				eightQueen(n+1);	//递归调用
		}
	}
	
	public static void main(String[] args) {
		System.out.println("八皇后问题求解！");
		System.out.println("八皇后问题排列方案：");
		eightQueen(0);	//求解

	}

}
