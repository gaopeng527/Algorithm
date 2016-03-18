package com.cn.datastruct;
import java.io.IOException;
import java.util.Scanner;
//��̬��������ʵ��
public class DynamicArray {
	//����ṹ
	static class LinkList{
		char data;              //������
		LinkList next;          //ָ����
	}
	//��������
	static LinkList CreatLinkList(char ch){
		LinkList list = null;
		list = new LinkList();
		list.data = ch;
		list.next = null;
		return list;
	}
	//������
	static void insertList(LinkList list,char e){
		LinkList p = new LinkList();
		p.data=e;
		if(list==null){
			list=p;
			p.next=null;
		}else{
			p.next=list.next;
			list.next=p;
		}
	}
	//��̬��������
	static void dynamicSort(LinkList p){
		LinkList q = p;
		int i,j,k=0;
		char temp;
		while(q!=null){
			k++;
			q=q.next;
		}
		q=p;
		for(i=0;i<k-1;i++){
			for(j=0;j<k-i-1;j++){
				if(q.data>q.next.data){
					temp=q.data;
					q.data=q.next.data;
					q.next.data=temp;
				}
				q=q.next;
			}
			q=p;
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		char[] ch;
		char chc;
		LinkList list,p;
		System.out.println("��̬��������");
		System.out.println("������һ���ַ����Իس�������");
		Scanner input = new Scanner(System.in);
		ch = input.next().toCharArray(); 
		chc = ch[0]; 		//��������ĵ�һ������
		p=list=CreatLinkList(chc);	//����һ��������
		for(int i=1;i<ch.length;i++){
			insertList(p,ch[i]);
		}
		dynamicSort(list);    //��̬��������
		System.out.println();
		System.out.println("�Ը���������󣬵õ��Ľ�����£�");
		while(list!=null){
			System.out.print(list.data+" ");
			list=list.next;
		}
		System.out.println();
	}

}
