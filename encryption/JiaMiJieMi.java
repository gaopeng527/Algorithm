package com.cn.mimaxue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JiaMiJieMi {
    /**
     * �����㷨
     * @param str ����
     * @param n    ָ���Ķ�ά���������
     * @return
     */
    static char[] jiami(char[] str,int n){
        int len,d,i,j,m;
        char[] temp,miwen;
        len=str.length;
        if((d=len%n)!=0){
            len = len + n-d;
        }
        temp = new char[len];
        m=len/n;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(i*n+j<str.length){
                    temp[i+m*j]=str[i*n+j];
                }else{
                    temp[i+m*j]=' ';
                }
            }
        }
        while(temp[len-1]==' '){
            len--;
        }
        miwen = new char[len];
        for(i=0;i<len;i++){
            miwen[i]=temp[i];
        }
        return miwen;
    }
    /**
     * �����㷨
     * @param miwen ����
     * @param n    ָ���Ķ�ά�����������������㷨��ͬ��
     * @return
     */
    static char[] jiemi(char[] miwen,int n){
        int len,d,i,j,m;
        char[] temp,str;    
        len=miwen.length;
        if((d=len%n)!=0){
            len = len + n-d;
        }
        temp = new char[len];
        m=len/n;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(i*m+j<miwen.length){
                    temp[i+j*n]=miwen[i*m+j];
                }else{
                    temp[i+n*j]=' ';
                }            
            }
        }
        while(temp[len-1]==' '){
            len--;
        }
        str = new char[len];
        for(i=0;i<len;i++){
            str[i]=temp[i];
        }
        return str;
    }
    
    public static void main(String[] args) throws IOException{
        char[] str,miwen,jiemi;
        int n,i;
        String go;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("������ָ���Ķ�ά�����������");
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