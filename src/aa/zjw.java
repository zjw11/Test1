package aa;

public class zjw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 申明一个字符串string类  属于java中的的一个引用类型
		// string 变量名名称 = 初始值；
		// 类 首字母大写
		// string 直接賦值
		String a= "hello world!";
		System.out.println(a);
		
		
		// string  構造方法賦值
		String b =new String("hello world");
	    System.out.println("b的值："+b);
	    
	   // System.out.println(a==a);
	    System.out.println(a==b);
		
	    int c1= 10 ;	
	    int c2= 10 ;
	    
		System.out.println(c1==c2);
	
		
		// 类 在计算机内存中分为堆和栈
		// =赋值与
		
		//== 等于  比较的是Java中的堆的地址值
		// ===恒等于
		
		
		// String 的直接赋值和构造方法赋值的区别
		 // String b1 ="今天天气很好！";
		  
		 String str = new String ("hello");
		 str	=str +"world"	 ;
		 str	=str +"!!!"  ;
		System.out.println(str);
		
		
		//String中的直接赋值和构造方法赋值有什么区别
		/*
		 * 直接赋值：只开辟一个内存空间，可以实现内存中堆空间共享
		 * 构造方法：开辟两个对空间 String new 开辟出来的堆空间
		 * 
		 **/
		//equals()两个字符串的比较
		String strs =null;
		//System.out.println(strs.equals("船长"));
		System.out.println("A".equals(strs));
		/* if("A".equals(strs)) {
		
		//  执行的语句
			 
			 	}*/
			 
			 // 类中有属性和方法String 类，方法和属性看方法
	   // public class StringDemo
//	    public static void main(string[]args) {
//	    	
//	    //
//	    	System.out.println(add(1,8));
//	    
//	    }
	  
	  //  public static 返回类型 方法名称(参数类型 参数, 参数
	    //执行的方法语句
	    
	    //}
	    // 两个整数相加分方法
	    	
//	    	public static int add(int a,int b) {
//	    		return a+b	 }
	    	// public static int add1(int a)
	    	
			
		
		
	}

	}
		

   
