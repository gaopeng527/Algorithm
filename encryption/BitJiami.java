package com.cn.mimaxue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//λ���ܡ������㷨
public class BitJiami {
	/**
	 * λ���ܽ����㷨
	 * @param str ���ģ����ģ�
	 * @param n ��Կ
	 * @return ���ģ����ģ�
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
        System.out.println("λ���ܽ����㷨��ʾ��");
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("������λ���ܽ����㷨����Կ��");
            n = input.next().charAt(0);
            System.out.print("���������ģ�");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String strtemp=br.readLine();
            str=strtemp.toCharArray();
            System.out.print("����Ϊ��");
            for(i=0;i<str.length;i++){
                System.out.print(str[i]);
            }
            System.out.println();
            miwen=bitcode(str,n);
            System.out.print("����Ϊ��");
            for(i=0;i<miwen.length;i++){
                System.out.print(miwen[i]);
            }
            System.out.println();
            jiemi=bitcode(miwen,n);
            System.out.print("����Ϊ��");
            for(i=0;i<jiemi.length;i++){
                System.out.print(jiemi[i]);
            }
            System.out.println();
            System.out.print("�Ƿ����(y/n):");
            go = input.next();
        }while(go.equalsIgnoreCase("y")); 
        System.out.println("�˳�����");

	}

}
