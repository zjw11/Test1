package aa;

import java.util.Scanner;

public class Lianxi3 {

	public static void main(String[] args) {        //   �����鸴�Ƶ�   ��һ������
	/*	int data[]={10,20,30,40,50,60,70,80,90};
		int data1[]=new int[9]; */      //��ʾ���Ƹ���    ����  data.length ���Ըĳ�9  ����һ���洢�ռ�
     /*       for(int i=0;i<data.length;i++){
            	data1[i]=data[i];
            }
            for(int i=0;i<data1.length;i++){
            	System.out.println(data1[i]);
           
            }*/
	
		 //������
	//	int i =0;
//	     while(i<data.length){
//	    	 data1[i]=data[i];
//		  i++;
//		
//	}
//	     for(int a=0;a<data1.length-1;a++){
//         	System.out.println(data1[a]);
	     
//	}
		
		               
	/*	while(i<data.length){            //  �������
    	 data1[i]=data[i];
		  i++;}
	     for(int a=data1.length-1;a>=0;a--){
	         	System.out.println(data1[a]);  
	     
	}*/

	   /*  Scanner scan = new Scanner(System.in);         //����һ�� ����3 ��5 ����   Scanner����  �����̵�����
	     System.out.println("����һ����");                 //��ȡ���̵�����ֵ
	     int a=scan.nextInt();
	     if((a%3==0&&a%5==0)||a%3==0){
	    	 
	    	 System.out.println("�ܱ�3 ��5 ����");
	     }else{
	    	 
	    	 System.out.println("���ܱ�3 ��5 ����");
	     }*/

		
		//   1+��100   
		//     int i=0;    //����һ����ʼֵ   
   //	     int sum=0; //   ����һ������
	    /* do{  sum+=i;
	          i++;
	    	 
	     }while(i<=100);
	     System.out.println(sum);*/
	     /*
	     do{                                  //1 ��100 ż�����
	    	 if(i%2==0){
	    		 sum+=i; 
	    	 }
	    	 
	    	 i++;
	     
	    	 
	     }while(i<=100);
	     System.out.println(sum);
	     */
		
		
		
		/*for(int i=0;i<4;i++){    //   ��һ�ַ���                   ��������              // *
			for(int j=0;j<=i;j++){                               // * *
				System.out.print("*");                           //* *��*
			
			}
			System.out.println();
			}
	*/
	  /*  int i=0;                        //�ڶ��ַ���
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
		                                                                     // * *��*                
		/*int line=4;       //       ������ǵ�           ����   
	     for(int i=0;i<line;i++){      // ������������         
			for(int j=i;j<=line;j++){         //������                    
				System.out.print(" ");                          
			
			}for(int x=0;x<=i;x++){  
			
			System.out.print(" *"); }
			System.out.println();
			} */
	     
	   /*�����ά����
	    * ��������  ��������[][]=new ��������[�г���][�г���];
	    * �������� [][] �������� = new ��������[�г���][�г���]��
	    *   
	    *   ��̬��ʼ��
	    *   ��������  ��������[][]=
	    *   new ��������[][]{ֵ��ֵ��ֵ}��{ֵ��ֵ��ֵ}{ֵ��ֵ��ֵ}} 
	    *   
	    *   
	    */
	 
	    int data [][]=new int [][]{
	    	{45,23,65},
	    	{89,45},
	    	{23,2,7},
	    };
	    for (int i=0;i<data.length;i++){//�����
	    	for (int j=0;j<data[i].length;j++){//������
	    		System.out.println(data[i][j]);
	    	}
	    	
	    }
	     
	    //����  1ά 2ά    
	    /*
	      * ѭ���ĳ�ʼ����
	      * whlile(����ѭ��������){ִ��ѭ������䣻�ı�ѭ�������}
	      * 
	      * do {}while ;
	      * ����  ѭ���ĳ�ʼ������
	      * do{ִ��ѭ�������   �ı�ѭ��������}while(����ѭ��������)��
	      * 
	      * for(ѭ���ĳ�ʼ������ѭ���Ľ������� �ı�ѭ��������){}
	      * if(�������){����������ʱ��ִ��}
	      * 
	      * 
	      * continue  ������ǰѭ�� 
          * break     ���� ���е�ѭ��(������ǰѭ��)
	      * 
	      * 
	      * 
	      */  
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}
	}
