package aa;

import java.util.Scanner;

public class Temo {

	public static void main(String[] args) {
		//������ֵ1��ֵ2
		//������������ֵ1 ����������ֵ2
		int a= 1>0?10:20;
		/**
		 * ��Ŀ����  ��Ԫ���ʽ
		 * 1.ʹ��Scanner ������������
		 * 2��ʹ����Ԫ���ʽ  ��ȡ���ֵ�����
		 * Ctrl +alt  +   ���Ƶ�ǰ ���� ����һ��
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("�������һ��ֵ");
		int x1=scan.nextInt();// ��ȡ ���������
		
		System.out.println("������ڶ���ֵ");
		int x2=scan.nextInt();
		
		System.out.println("�����������ֵ");
		int x3=scan.nextInt();
		
		
		
		int max=x1>x2?x1:x2;//���ֵ
		max =max>x3?max:x3;
		System.out.println(max);
		
		
		
		
	}

}
