package com.cn.datastruct;
import java.io.IOException;
import java.util.Scanner;
//动态数组排序实例
public class DynamicArray {
	//链表结构
	static class LinkList{
		char data;              //数据域
		LinkList next;          //指针域
	}
	//创建链表
	static LinkList CreatLinkList(char ch){
		LinkList list = null;
		list = new LinkList();
		list.data = ch;
		list.next = null;
		return list;
	}
	//插入结点
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
	//动态数组排序
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
		System.out.println("动态数组排序！");
		System.out.println("请输入一组字符，以回车结束！");
		Scanner input = new Scanner(System.in);
		ch = input.next().toCharArray(); 
		chc = ch[0]; 		//输入链表的第一个数据
		p=list=CreatLinkList(chc);	//创建一个链表结点
		for(int i=1;i<ch.length;i++){
			insertList(p,ch[i]);
		}
		dynamicSort(list);    //动态数组排序
		System.out.println();
		System.out.println("对该数组排序后，得到的结果如下：");
		while(list!=null){
			System.out.print(list.data+" ");
			list=list.next;
		}
		System.out.println();
	}

}
