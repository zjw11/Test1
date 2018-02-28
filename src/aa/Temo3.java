package aa;

import java.util.Scanner;

public class Temo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
            System.out.println("请输入你的工资");
            int a=scan.nextInt();
            int b=a-3500;
           if(b<=1500){
        	   System.out.println(b*0.03);
        	   
           }else if(4500>=b){
        	   System.out.println(b*0.1-105);
        	   
           }else if(9000>=b){
        	   System.out.println(b*0.2-555);
        	   
           }else if(35000>=b){
        	   System.out.println(b*0.25-1005);
        	   
           }else if(55000>=b){
        	   System.out.println(b*0.3-2755);
        	   
           }else if(80000>=b){
        	   System.out.println(b*0.35-5505);
        	   
           }else if(b>80000){
        	   System.out.println(b*0.45-13505);
           }else{
        	   System.out.println("输入价格");
           }
          
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
	}

}
