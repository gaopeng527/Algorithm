package com.cn.suanfaquti;

public class EightQueen {
	static int iCount=0;	//ȫ�ֱ���
	static int[] WeiZhi=new int[8];	//ȫ������
	static void Output(){
		int i,j,flag=1;
		System.out.printf("��%2d�ַ���(���ʾ�ʺ�):\n", ++iCount);	//������
		System.out.printf("     ");
		for(i=1;i<=8;i++){
			System.out.print("�x");
		}
		System.out.println();
		for(i=0;i<8;i++){
			System.out.print("��");
			for(j=0;j<8;j++){
				if(WeiZhi[i]-1==j){
					System.out.print("��");	//�ʺ��λ��
				}else{
					if(flag<0){
						System.out.print("     ");	//���
					}else{
						System.out.print("��");	//���
					}
				}
				flag=-1*flag;
			}
			System.out.println("�� " );
			flag=-1*flag;
		}
		System.out.print("     ");
		for(i=1;i<=8;i++){
			System.out.print("��");
		}
		System.out.println();
	}
	
	//�㷨
	static void eightQueen(int n){
		int i,j;
		int ct;	//�����ж��Ƿ��ͻ
		if(n==8){
			Output();	//��������
			return;
		}
		for(i=1;i<=8;i++){	//��̽
			WeiZhi[n]=i;	//�ڸ��еĵ�i���Ϸ���
			//�жϵ�n���ʺ��Ƿ���ǰ��Ļʺ��γɹ���
			ct=1;
			for(j=0;j<n;j++){
				if(WeiZhi[n]==WeiZhi[j]){	//�γɹ���
					ct=0;
				}else if(Math.abs(WeiZhi[j]-WeiZhi[n])==(n-j)){	//�γɹ���
					ct=0;
				}else{
					
				}
			}
			if(ct==1)	//û�г�ͻ���Ϳ�ʼ��һ�е���̽
				eightQueen(n+1);	//�ݹ����
		}
	}
	
	public static void main(String[] args) {
		System.out.println("�˻ʺ�������⣡");
		System.out.println("�˻ʺ��������з�����");
		eightQueen(0);	//���

	}

}
