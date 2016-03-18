package com.cn.mimaxue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//位加密、解密算法
public class BitJiami {
	/**
	 * 位加密解密算法
	 * @param str 明文（密文）
	 * @param n 密钥
	 * @return 密文（明文）
	 */
	static char[] bitcode(char[] str, char n){
		int len,i;
		char[] wen;
		len=str.length;
		wen = new char[len];
		for(i=0;i<len;i++){
			wen[i]=(char) (str[i]^n);
		}
		return wen;
	}
	
	public static void main(String[] args) throws IOException {
        char[] str,miwen,jiemi;
        int i;
        char n;
        String go;
        System.out.println("位加密解密算法演示！");
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("请输入位加密解密算法的密钥：");
            n = input.next().charAt(0);
            System.out.print("请输入明文：");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String strtemp=br.readLine();
            str=strtemp.toCharArray();
            System.out.print("明文为：");
            for(i=0;i<str.length;i++){
                System.out.print(str[i]);
            }
            System.out.println();
            miwen=bitcode(str,n);
            System.out.print("密文为：");
            for(i=0;i<miwen.length;i++){
                System.out.print(miwen[i]);
            }
            System.out.println();
            jiemi=bitcode(miwen,n);
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
