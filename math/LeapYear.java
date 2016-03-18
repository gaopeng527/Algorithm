package com.cn.math;
//判断瑞年
public class LeapYear {
	//判断瑞年
	public static int leapYear(int year){
		if(year%400==0||(year%4==0&&year%100!=0)){
			return 1;
		}else{
			return 0;
		}
	}
	public static void main(String[] args) {
		int year;
		int count=0;
		System.out.println("2000年到3000年之间的所有瑞年如下：");
		for(year=2000;year<=3000;year++){
			if(leapYear(year)==1){
				System.out.print(year+" ");
				count++;
				if(count%16==0){
					System.out.println();
				}
			}
		}
		System.out.println();
	}

}
