package aa;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
	/*	Scanner scan=new Scanner(System.in);
		System.out.println("请输入您的年份");
		int year=scan.nextInt();
       if(year %4 ==0 && year%100 !=0||year%100==0){
    	   System.out.println("闰年");
    	   
       }else{
    	   System.out.println("平年");
    	   
       }*/
    	   
 /*  	short a = 1;
	int b = 2;
	double  c =12.3;
	System.out.println(a+b+c);*/
	
	/*	Scanner scan=new Scanner(System.in);
		System.out.println("请输入需要的数");
		int b=scan.nextInt();
		for(int a=1;a<=100;a=a+1){
			if(b %3 ==0 && b%5==0){
	        	
		}
			System.out.println("被忽略掉");
        
       }*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入需要的数");
		int x=426;
		int b=x%10;//获取各位
		int c=x/10%10;//获取十位
		int a=x/100;//获取百位
		System.out.println(b);
		/*for(int k=100;k<=999;k++){
			
			int a=k%10;
			int  b=k/10%10;
			int c=k/100;
			if(a*a*a+b*b*b+c*c*c==k){
				System.out.println(k);
			}
		
	}
*/
}
}