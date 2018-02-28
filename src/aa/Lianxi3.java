package aa;

import java.util.Scanner;

public class Lianxi3 {

	public static void main(String[] args) {        //   把数组复制到   另一个数组
	/*	int data[]={10,20,30,40,50,60,70,80,90};
		int data1[]=new int[9]; */      //表示复制个数    长度  data.length 可以改成9  开辟一个存储空间
     /*       for(int i=0;i<data.length;i++){
            	data1[i]=data[i];
            }
            for(int i=0;i<data1.length;i++){
            	System.out.println(data1[i]);
           
            }*/
	
		 //方法二
	//	int i =0;
//	     while(i<data.length){
//	    	 data1[i]=data[i];
//		  i++;
//		
//	}
//	     for(int a=0;a<data1.length-1;a++){
//         	System.out.println(data1[a]);
	     
//	}
		
		               
	/*	while(i<data.length){            //  到着输出
    	 data1[i]=data[i];
		  i++;}
	     for(int a=data1.length-1;a>=0;a--){
	         	System.out.println(data1[a]);  
	     
	}*/

	   /*  Scanner scan = new Scanner(System.in);         //输入一个 数被3 和5 整除   Scanner控制  检测键盘的输入
	     System.out.println("输入一个数");                 //获取键盘的输入值
	     int a=scan.nextInt();
	     if((a%3==0&&a%5==0)||a%3==0){
	    	 
	    	 System.out.println("能被3 和5 整除");
	     }else{
	    	 
	    	 System.out.println("不能被3 和5 整除");
	     }*/

		
		//   1+到100   
		//     int i=0;    //定义一个初始值   
   //	     int sum=0; //   定义一个集合
	    /* do{  sum+=i;
	          i++;
	    	 
	     }while(i<=100);
	     System.out.println(sum);*/
	     /*
	     do{                                  //1 到100 偶数相加
	    	 if(i%2==0){
	    		 sum+=i; 
	    	 }
	    	 
	    	 i++;
	     
	    	 
	     }while(i<=100);
	     System.out.println(sum);
	     */
		
		
		
		/*for(int i=0;i<4;i++){    //   第一种方法                   控制行数              // *
			for(int j=0;j<=i;j++){                               // * *
				System.out.print("*");                           //* *　*
			
			}
			System.out.println();
			}
	*/
	  /*  int i=0;                        //第二种方法
	    while(i<4){
	    	for(int j=0;j<=i;j++){                               //* *
				System.out.print("*");
	    }
	    	i++;
		System.out.println();  }*/
	    	 
		
	/*	int i=0;
	
	     do{
	    	 for(int j=0;j<=i;j++){ 
	    		
	    		 System.out.print("*");
 }
 
	    	 System.out.println();
	    	 i++;  
	    	 }while(i<4);*/
	                                                                      	 //   *
	                                                                         //  * *
		                                                                     // * *　*                
		/*int line=4;       //       输出星星的           行数   
	     for(int i=0;i<line;i++){      // 控制它的行数         
			for(int j=i;j<=line;j++){         //控制列                    
				System.out.print(" ");                          
			
			}for(int x=0;x<=i;x++){  
			
			System.out.print(" *"); }
			System.out.println();
			} */
	     
	   /*定义二维数组
	    * 数据类型  数组名称[][]=new 数据类型[行长度][列长度];
	    * 数据类型 [][] 数组名称 = new 数据类型[行长度][列长度]；
	    *   
	    *   静态初始化
	    *   数据类型  数组名称[][]=
	    *   new 数据类型[][]{值，值，值}，{值，值，值}{值，值，值}} 
	    *   
	    *   
	    */
	 
	    int data [][]=new int [][]{
	    	{45,23,65},
	    	{89,45},
	    	{23,2,7},
	    };
	    for (int i=0;i<data.length;i++){//输出行
	    	for (int j=0;j<data[i].length;j++){//控制列
	    		System.out.println(data[i][j]);
	    	}
	    	
	    }
	     
	    //区别  1维 2维    
	    /*
	      * 循环的初始条件
	      * whlile(跳出循环的条件){执行循环的语句；改变循环的语句}
	      * 
	      * do {}while ;
	      * 定义  循环的初始条件；
	      * do{执行循环的语句   改变循环的条件}while(跳出循环的条件)；
	      * 
	      * for(循环的初始条件，循环的结束条件 改变循环的条件){}
	      * if(条件语句){条件成立的时候执行}
	      * 
	      * 
	      * continue  跳出当前循环 
          * break     跳出 所有的循环(结束当前循环)
	      * 
	      * 
	      * 
	      */  
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}
	}
