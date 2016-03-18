package com.cn.datastruct;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KuoHaoPiPei {
	static class Stack{
		char[] data;  //�������
		int MaxSize;	//�������
		int top;		//ջ��ָ��
		//���췽��
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
		//��ջ
		public boolean push(char data){
			if(isFull()){
				System.out.println("ջ����!");
				return false;
			}
			this.data[++top]=data;
			return true;
		}
		//��ջ
		public char pop() throws Exception{
			if(isEmpty()){
				throw new Exception("ջ�ѿգ�");
			}
			return this.data[top--];
		}		
		//���ջ��Ԫ��
		public char peek(){
			return this.data[getTop()];
		}
		
		//����ƥ���㷨
		public void pipei()throws Exception{
			char temp,ch;
			int match;	//��¼ƥ����
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ch=(char) br.read();		//����һ���ַ�
			while(ch!='0'){
				if(getTop()==-1){
					push(ch);
				}else{
					temp=pop();		//ȡ��ջ��Ԫ��
					match=0;	//�ж��Ƿ�ƥ�䣨Ĭ�ϲ�ƥ�䣩
					if(temp=='('&&ch==')')
						match=1;
					if(temp=='['&&ch==']')
						match=1;
					if(temp=='{'&&ch=='}')
						match=1;
					if(temp=='<'&&ch=='>')
						match=1;
					if(match==0){	//�����ƥ��
						push(temp);	//��ԭջ��Ԫ��������ջ
						push(ch);	//������������ַ���ջ
					}
				}
				ch=(char) br.read();	//������һ���ַ�
			}
			if(isEmpty()){
				System.out.println("�����������ȫƥ�䣡");
			}else{
				System.out.println("��������Ų�ƥ�䣬���飡");
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		String go;
		Scanner input = new Scanner(System.in);
		Stack stack = new Stack(20);
		System.out.println("����ƥ�����⣡");
		do{
			System.out.println("������һ�����ŵ���ϣ���0��ʾ������֧�ֵ����Ű�����{},(),[],<>��");
			stack.pipei();    	//ƥ���㷨
			System.out.print("\n����ƥ����y/n��?");
			go=input.next();
		}while(go.equalsIgnoreCase("y"));
		System.out.println("ƥ�������");
	}

}
