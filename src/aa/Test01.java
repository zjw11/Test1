package aa;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//��ȡJava������
		Scanner scan=new Scanner(System.in);
		//������������
		System.out.println("��������������");
		double weight=scan.nextDouble();
		double height=scan.nextDouble();
		System.out.println("�������������");
		double result=weight/(height*height);//BMI  ֵ
		if(result<18.5){
			System.out.println("���ع���");
		}
		if(result>=18.5 && result<24){ 
			System.out.println("������Χ");
			}
		if(result>=24 && result<27){
			System.out.println("���س���");
			}
	    if(result>=27 && result<30){
	    	System.out.println("��ȷ���");
			
		}
	    if(result>=30 && result<35){
	    	System.out.println("�жȷ���");
	    }
	    if(35>=result){
	    	System.out.println("�ضȷ���");
	    	
	    }

	}

}
