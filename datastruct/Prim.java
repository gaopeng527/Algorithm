package com.cn.datastruct;

import java.util.Scanner;

//������֮�������ܾ���
public class Prim {
	//�����ڽӾ���ͼ�ṹ
	static class GraphMatrix{
		static final int MaxNum=20;  //ͼ����󶥵���
		char[] Vertex=new char[MaxNum];  //���涥����Ϣ����Ż���ĸ��
		int GType;  	//ͼ�����ͣ�0������ͼ��1������ͼ��
		int VertexNum;  //���������
		int EdgeNum; 	//�ߵ�����
		int[][] EdgeWeight = new int[MaxNum][MaxNum];  //����ߵ�Ȩ
		int[] isTrav = new int[MaxNum];   //������־
	}
	
	static final int MaxValue=65535;   //���ֵ������Ϊһ�����������
	static final int USED=0;  //��ѡ�ö���
	static final int NoL=-1;  //���ڽӶ���
	static Scanner input=new Scanner(System.in);
	
	//�����ڽӾ���ͼ
	static void CreateGraph(GraphMatrix GM){
		int i,j,k;
		int weight; 	//Ȩ
		char EstartV,EendV;		//�ߵ���ʼ����
		System.out.printf("����ͼ�и�������Ϣ\n");
		for(i=0;i<GM.VertexNum;i++){		//���붥��
			System.out.printf("��%d�����㣺", i+1);
			GM.Vertex[i]=(input.next().toCharArray())[0];  //���浽�����������Ԫ����
		}
		System.out.printf("���빹�ɸ��ߵĶ��㼰Ȩֵ��\n");
		for(k=0;k<GM.EdgeNum;k++){			//����ߵ���Ϣ
			System.out.printf("��%d���ߣ�", k+1);
			EstartV=input.next().charAt(0);
			EendV=input.next().charAt(0);
			weight=input.nextInt();
			for(i=0;EstartV!=GM.Vertex[i];i++);  	//�����ж����в���ʼ��
			for(j=0;EendV!=GM.Vertex[j];j++);		//�����еĶ����в����յ�
			GM.EdgeWeight[i][j]=weight;  		//��Ӧλ�ñ���Ȩֵ����ʾ��һ����
			if(GM.GType==0){		//��������ͼ
				GM.EdgeWeight[j][i]=weight;
			}
		}
	}
	
	//��վ���
	static void ClearGraph(GraphMatrix GM){
		int i,j;
		for(i=0;i<GM.VertexNum;i++){
			for(j=0;j<GM.VertexNum;j++){
				GM.EdgeWeight[i][j]=MaxValue;   //���þ����и�Ԫ�ص�ֵΪMaxValue
			}
		}
	}
	
	//����ڽӾ���
	static void OutGraph(GraphMatrix GM){
		int i,j;
		for(j=0;j<GM.VertexNum;j++){
			System.out.printf("\t%c", GM.Vertex[j]);    //�ڵ�һ�����������Ϣ
		}
		System.out.println();
		for(i=0;i<GM.VertexNum;i++){
			System.out.printf("%c", GM.Vertex[i]);
			for(j=0;j<GM.VertexNum;j++){
				if(GM.EdgeWeight[i][j]==MaxValue){	//��ȨֵΪ���ֵ
					System.out.printf("\tZ");	//��Z��ʾ�����
				}else{
					System.out.printf("\t%d", GM.EdgeWeight[i][j]);  	//����ߵ�Ȩֵ
				}
			}
			System.out.println();
		}
	}
	
	//��С�������㷨
	static void PrimGraph(GraphMatrix GM){
		int i,j,k,min,sum;
		int[] weight=new int[GraphMatrix.MaxNum];	//Ȩֵ
		char[] vtempx=new char[GraphMatrix.MaxNum];		//��ʱ������Ϣ
		sum=0;
		for(i=1;i<GM.VertexNum;i++){	//�����ڽӾ����е�һ������
			weight[i]=GM.EdgeWeight[0][i];
			if(weight[i]==MaxValue){
				vtempx[i]=(char) NoL;
			}else{
				vtempx[i]=GM.Vertex[0];		//�ڽӶ���
			}
		}
		vtempx[0]=USED;	//ѡ��
		weight[0]=MaxValue;
		for(i=1;i<GM.VertexNum;i++){
			min=weight[0];		//��СȨֵ
			k=i;
			for(j=1;j<GM.VertexNum;j++){
				if(weight[j]<min&&vtempx[j]>0){		//�ҵ����и�СȨֵ��δʹ�ñ�
					min=weight[j];		//����Ȩֵ
					k=j;				//�����ڽӵ����
				}
			}
			sum+=min;		//Ȩֵ�ۼ�
			System.out.printf("(%c,%c),",vtempx[k],GM.Vertex[k]);   //���������һ����
			vtempx[k]=USED;		//ѡ��
			weight[k]=MaxValue;
			for(j=0;j<GM.VertexNum;j++){	//����ѡ����С��
				if(GM.EdgeWeight[k][j]<weight[j]&&vtempx[j]!=0){
					weight[j]=GM.EdgeWeight[k][j];		//Ȩֵ
					vtempx[j]=GM.Vertex[k];
				}
			}
		}
		System.out.printf("\n��С����������ȨֵΪ��%d\n", sum);
	}
	
	public static void main(String[] args) {
		GraphMatrix GM=new GraphMatrix();		//���屣���ڽӱ��ṹ��ͼ
		char again;
		String go;
		System.out.println("Ѱ����С��������");
		do{
			System.out.print("������������ͼ�����ͣ�");
			GM.GType=input.nextInt();	//ͼ������
			System.out.print("����ͼ�Ķ���������");
			GM.VertexNum=input.nextInt();		//����ͼ�Ķ�����
			System.out.print("����ͼ�ı�������");
			GM.EdgeNum=input.nextInt(); 		//����ͼ����
			ClearGraph(GM);		//���ͼ
			CreateGraph(GM);		//�����ڽӱ��ṹ��ͼ
			
			System.out.print("��С�������ı�Ϊ��");
			PrimGraph(GM);
			
			System.out.println("\n��������y/n��?");
			go=input.next();
		}while(go.equalsIgnoreCase("y"));
		System.out.println("��Ϸ������");
	}

}