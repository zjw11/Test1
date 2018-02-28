package aa;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//获取Java的输入
		Scanner scan=new Scanner(System.in);
		//下面输入体重
		System.out.println("请输入您的体重");
		double weight=scan.nextDouble();
		double height=scan.nextDouble();
		System.out.println("请输入您的身高");
		double result=weight/(height*height);//BMI  值
		if(result<18.5){
			System.out.println("体重过轻");
		}
		if(result>=18.5 && result<24){ 
			System.out.println("正常范围");
			}
		if(result>=24 && result<27){
			System.out.println("体重超重");
			}
	    if(result>=27 && result<30){
	    	System.out.println("轻度肥胖");
			
		}
	    if(result>=30 && result<35){
	    	System.out.println("中度肥胖");
	    }
	    if(35>=result){
	    	System.out.println("重度肥胖");
	    	
	    }

	}

}
