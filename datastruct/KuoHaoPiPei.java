package com.cn.datastruct;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KuoHaoPiPei {
	static class Stack{
		char[] data;  //存放数据
		int MaxSize;	//最大容量
		int top;		//栈顶指针
		//构造方法
		public Stack(int MaxSize){
			this.MaxSize=MaxSize;
			data = new char[MaxSize];
			top = -1;
		}

		public int getMaxSize() {
			return MaxSize;
		}

		public int getTop() {
			return top;
		}

		public boolean isEmpty(){
			return top==-1;
		}
		
		public boolean isFull(){
			return top+1==MaxSize;
		}
		//入栈
		public boolean push(char data){
			if(isFull()){
				System.out.println("栈已满!");
				return false;
			}
			this.data[++top]=data;
			return true;
		}
		//出栈
		public char pop() throws Exception{
			if(isEmpty()){
				throw new Exception("栈已空！");
			}
			return this.data[top--];
		}		
		//获得栈顶元素
		public char peek(){
			return this.data[getTop()];
		}
		
		//括号匹配算法
		public void pipei()throws Exception{
			char temp,ch;
			int match;	//记录匹配结果
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ch=(char) br.read();		//输入一个字符
			while(ch!='0'){
				if(getTop()==-1){
					push(ch);
				}else{
					temp=pop();		//取出栈顶元素
					match=0;	//判断是否匹配（默认不匹配）
					if(temp=='('&&ch==')')
						match=1;
					if(temp=='['&&ch==']')
						match=1;
					if(temp=='{'&&ch=='}')
						match=1;
					if(temp=='<'&&ch=='>')
						match=1;
					if(match==0){	//如果不匹配
						push(temp);	//将原栈顶元素重新入栈
						push(ch);	//将输入的括号字符入栈
					}
				}
				ch=(char) br.read();	//输入下一个字符
			}
			if(isEmpty()){
				System.out.println("输入的括号完全匹配！");
			}else{
				System.out.println("输入的括号不匹配，请检查！");
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		String go;
		Scanner input = new Scanner(System.in);
		Stack stack = new Stack(20);
		System.out.println("括号匹配问题！");
		do{
			System.out.println("请输入一组括号的组合，以0表示结束。支持的括号包括：{},(),[],<>。");
			stack.pipei();    	//匹配算法
			System.out.print("\n继续匹配吗（y/n）?");
			go=input.next();
		}while(go.equalsIgnoreCase("y"));
		System.out.println("匹配结束！");
	}

}
