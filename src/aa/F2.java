package aa;

public class F2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//比较两个字符串是否相等 
		// Public boolean equals(Object anobject)
		String a= "hello" ;
		String a1="hello" ;
		String a2=new String("hello");//string a2  重新开辟了一个空间 ，string 先开辟一个空间  ，
		//先开辟的会变成垃圾回收
		
	System.out.println("a和a1用equals方法比较："+a.equals(a1));// true 内容一样
	System.out.println("a和a2用equals方法比较："+a.equals(a2));	//true   内容一样
	System.out.println("a和a1用equals方法比较："+(a==a1));	//true
	System.out.println("a和a2用equals方法比较："+(a==a2));	//false 内容 hello   位置要一样   地址不一样
		
		// ==和equals()方法比較区别
	   /*
	    * == 比较的是String 内存堆中的内容和地址相等才会true
	    * ==equals()比较的是内存堆中值相等
	    * 
	    * 手工入池(手工添加实现数据的共享）
	    * Public String intern()
	    * 
	    */
		//System.out.println(a==a2.intern());
		
		
		
		
		
		
	}

}
