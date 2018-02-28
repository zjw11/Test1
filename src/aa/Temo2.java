package aa;

import java.util.Scanner;

public class Temo2 {

	public static void main(String[] args) {
	
	   double a =1500;
       System.out.println("请输入您的价格");
       if (a<=500){
    	   System.out.println(a);
    	   
       }else if(a<500){
    	   System.out.println(a*0.9);
    	   
       }else if(a<800){
    	   System.out.println(a*0.85);
    	   
       }else if(a<1000){
    	   System.out.println(a*0.8);
       }else if(a<2000){ 
    		System.out.println(a*0.7);
    	
       }else{
    	   System.out.println(a);
    	   
       }
       
       
       
	}	

}
