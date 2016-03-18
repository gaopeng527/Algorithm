package com.cn.gao;

import java.util.Scanner;

public class PrintAscii {
	public void dispAscii(char ch){
		int i=(int)ch;
		System.out.println(ch+"的Ascii码为："+i);
	}
	public static void main(String[] args) {
		PrintAscii pa = new PrintAscii();
		System.out.print("请输入要查看的字符：");
		Scanner input = new Scanner(System.in);
		String s=input.next();
		char ch=s.charAt(0);
		pa.dispAscii(ch);
	}

}
