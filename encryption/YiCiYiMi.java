package com.cn.mimaxue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

//一次一密加密、解密算法
public class YiCiYiMi {
	static char[] key;
	/**
	 * 一次一密加密、解密算法
	 * @param str 明文（密文）
	 * @param key 密钥
	 * @return 密文（明文）
	 */
	static char[] bitcode(char[] str, char[] key){
		int len,i;
		char[] wen;
		len = str.length;
		wen = new char[len];
		for(i=0;i<len;i++){
			wen[i]=(char) (str[i]^key[i]);
		}
		return wen;
	}
	
	public static void main(String[] args) throws IOException {
		int i,len;
		char[] str,miwen,mingwen;
		String go,strtemp;
		System.out.println("一次一密加密、解密算法示例！");
		Scanner input = new Scanner(System.in);
		do{
			System.out.print("请输入明文：");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			strtemp=br.readLine();
			str=strtemp.toCharArray();
			len = str.length;
			System.out.print("明文为：");
			for(i=0;i<len;i++){
				System.out.print(str[i]);
			}
			System.out.println();
			key=new char[len];
			Random r = new Random();
			System.out.print("此次加密解密的密钥为：");
			for(i=0;i<len;i++){
				key[i]=(char) (r.nextInt(10)+'0');
				System.out.print(key[i]);
			}
			System.out.println();
			miwen=bitcode(str,key);
			System.out.print("加密为：");
			for(i=0;i<len;i++){
				System.out.print(miwen[i]);
			}
			System.out.println();
			mingwen=bitcode(miwen,key);
			System.out.print("解密为：");
			for(i=0;i<len;i++){
				System.out.print(mingwen[i]);
			}
			System.out.println();
			System.out.print("是否继续(y/n):");
			go=input.next();
		}while(go.equalsIgnoreCase("y"));
		System.out.println("程序结束！");
	}

}
