package com.cn.mimaxue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//替换加密解密算法
public class THJMJM {
	/**
	 * 加密算法
	 * @param str 明文字符串
	 * @param n	明文中每个ASCII码向后移动的位数,即密钥
	 * @return
	 */
	static char[] jiami(char[] str,int n){
		int i,len;
		char[] miwen;
		len=str.length;
		miwen=new char[len];	//申请内存
		for(i=0;i<len;i++){
			miwen[i]=(char)(str[i]+n);
		}
		return miwen;
	}
	/**
	 * 解密算法
	 * @param miwen 密文字符串
	 * @param n	密文中每个ASCII码向前移动的位数，应与加密算法向后移动位数相同
	 * @return
	 */
	static char[] jiemi(char[] miwen,int n){
		int i,len;
		char[] str;
		len=miwen.length;
		str=new char[len];	//申请内存
		for(i=0;i<len;i++){
			str[i]=(char)(miwen[i]-n);
		}
		return str;
	}
	public static void main(String[] args) throws IOException {
        char[] str,miwen,jiemi;
        int n,i;
        String go;
        System.out.println("替换加密解密算法演示！");
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("请输入替换加密解密算法的密钥：");
            n = input.nextInt();
            System.out.print("请输入明文：");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String strtemp=br.readLine();
            str=strtemp.toCharArray();
            System.out.print("明文为：");
            for(i=0;i<str.length;i++){
                System.out.print(str[i]);
            }
            System.out.println();
            miwen=jiami(str,n);
            System.out.print("密文为：");
            for(i=0;i<miwen.length;i++){
                System.out.print(miwen[i]);
            }
            System.out.println();
            jiemi=jiemi(miwen,n);
            System.out.print("解密为：");
            for(i=0;i<jiemi.length;i++){
                System.out.print(jiemi[i]);
            }
            System.out.println();
            System.out.print("是否继续(y/n):");
            go = input.next();
        }while(go.equalsIgnoreCase("y")); 
        System.out.println("退出程序！");

	}

}
