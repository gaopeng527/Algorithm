package com.cn.gao;

import java.util.Scanner;

public class PrintAscii {
	public void dispAscii(char ch){
		int i=(int)ch;
		System.out.println(ch+"��Ascii��Ϊ��"+i);
	}
	public static void main(String[] args) {
		PrintAscii pa = new PrintAscii();
		System.out.print("������Ҫ�鿴���ַ���");
		Scanner input = new Scanner(System.in);
		String s=input.next();
		char ch=s.charAt(0);
		pa.dispAscii(ch);
	}

}
