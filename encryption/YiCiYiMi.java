package com.cn.mimaxue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

//һ��һ�ܼ��ܡ������㷨
public class YiCiYiMi {
	static char[] key;
	/**
	 * һ��һ�ܼ��ܡ������㷨
	 * @param str ���ģ����ģ�
	 * @param key ��Կ
	 * @return ���ģ����ģ�
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
		System.out.println("һ��һ�ܼ��ܡ������㷨ʾ����");
		Scanner input = new Scanner(System.in);
		do{
			System.out.print("���������ģ�");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			strtemp=br.readLine();
			str=strtemp.toCharArray();
			len = str.length;
			System.out.print("����Ϊ��");
			for(i=0;i<len;i++){
				System.out.print(str[i]);
			}
			System.out.println();
			key=new char[len];
			Random r = new Random();
			System.out.print("�˴μ��ܽ��ܵ���ԿΪ��");
			for(i=0;i<len;i++){
				key[i]=(char) (r.nextInt(10)+'0');
				System.out.print(key[i]);
			}
			System.out.println();
			miwen=bitcode(str,key);
			System.out.print("����Ϊ��");
			for(i=0;i<len;i++){
				System.out.print(miwen[i]);
			}
			System.out.println();
			mingwen=bitcode(miwen,key);
			System.out.print("����Ϊ��");
			for(i=0;i<len;i++){
				System.out.print(mingwen[i]);
			}
			System.out.println();
			System.out.print("�Ƿ����(y/n):");
			go=input.next();
		}while(go.equalsIgnoreCase("y"));
		System.out.println("���������");
	}

}
