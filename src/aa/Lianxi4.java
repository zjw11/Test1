package aa;

import java.util.Arrays;
import java.util.Random;
public class Lianxi4{
      public static int[] create(int x)  {
          //1定义一个方法create，能够生成一个随机整数数组，传入一个整数参数作为数组长度
    	 
    	  Random ran=new Random();
    	  int[] arr=new int[x];
          //产生随机数
    	  //含下不含上[0,100)    0-99中 的任意一个整数
    	 for(int i=0;i<arr.length;i++){
    		 arr[i]=ran.nextInt(100);//产生随机数
    	 }

	  return arr;
      }
      //写出一个输出数组的方法 print
      public static void print(int[]c){   //输出的方法
    	 for(int j=0;j<c.length;j++){
		 System.out.println(c[j]+" "); //  传入数组
    	 } 
          System.out.println("输出结果"  );
      
      }

	public static void main(String[] args) {
		
		int []d=create(7);
           //Arrays.toString(a)  输出数组的内容
	System.out.println(Arrays.toString(d));
	 // print(d);      //调用数组名   里面数组
     
		//求最小值
	    int min=d[0];
   for(int i=0;i<d.length;i++){
 		 min=min<d[i]?min:d[i];
   /* if(min>d[i]){
    	 min=d[i];*/
    	 
     }
      System.out.println("最小值为"+min); 
	 	 
	
   
	//求最大值
	
      int[] d1={17, 91, 2, 11, 49, 95, 29};
      int max=d1[0];
      for(int i=0;i<d1.length;i++){
 		 max=max>d1[i]?max:d1[i];
	 
	}    
      System.out.println("最大值为"+max); 
      //求和                                                                                                                                                                                                                                                                                                                                                                                                                  
      int[] d2={18, 50, 2, 11, 49, 95, 4};
      int sum=d2[0];
      for(int i=0;i<d2.length;i++){
    	  sum+=d2[i];
    	     
    	  System.out.println("和为"+sum); 
} 

	
	
}	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

