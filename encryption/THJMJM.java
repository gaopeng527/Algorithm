package com.cn.mimaxue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//�滻���ܽ����㷨
public class THJMJM {
	/**
	 * �����㷨
	 * @param str �����ַ���
	 * @param n	������ÿ��ASCII������ƶ���λ��,����Կ
	 * @return
	 */
	static char[] jiami(char[] str,int n){
		int i,len;
		char[] miwen;
		len=str.length;
		miwen=new char[len];	//�����ڴ�
		for(i=0;i<len;i++){
			miwen[i]=(char)(str[i]+n);
		}
		return miwen;
	}
	/**
	 * �����㷨
	 * @param miwen �����ַ���
	 * @param n	������ÿ��ASCII����ǰ�ƶ���λ����Ӧ������㷨����ƶ�λ����ͬ
	 * @return
	 */
	static char[] jiemi(char[] miwen,int n){
		int i,len;
		char[] str;
		len=miwen.length;
		str=new char[len];	//�����ڴ�
		for(i=0;i<len;i++){
			str[i]=(char)(miwen[i]-n);
		}
		return str;
	}
	public static void main(String[] args) throws IOException {
        char[] str,miwen,jiemi;
        int n,i;
        String go;
        System.out.println("�滻���ܽ����㷨��ʾ��");
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("�������滻���ܽ����㷨����Կ��");
            n = input.nextInt();
            System.out.print("���������ģ�");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String strtemp=br.readLine();
            str=strtemp.toCharArray();
            System.out.print("����Ϊ��");
            for(i=0;i<str.length;i++){
                System.out.print(str[i]);
            }
            System.out.println();
            miwen=jiami(str,n);
            System.out.print("����Ϊ��");
            for(i=0;i<miwen.length;i++){
                System.out.print(miwen[i]);
            }
            System.out.println();
            jiemi=jiemi(miwen,n);
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
