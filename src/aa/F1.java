package aa;

public class F1 {

	public static void main(String[] args) {
		

		/*
		 * 把字符数组转化为字符串 ,offset 开始位置,转换的个数 public string(char[] value，int offstage,int count)
		 * 
		 *
		 * 把字符数组转化为字符串 public string(char[] value) 构造方法 public 类名称(参数类型 参数,参数类型
		 * 参数...){}
		 */

		// 数据类型[]变量名={}; 变量名在括号前后都行
		// 定义一个数据，数组名为a
		char a[] = { 'h', 'e', 'l', 'l', 'o' };
		// 把字符数组转换为字符串,设置起始位置和结束个数
		String str = new String(a, 1, 4);    //全部为a  
		System.out.println(str);
		
		
		/*定义一个字符串   
				String str="helloworld";
				//把字符串转换为字节数组
				byte a[]=str.getBytes();
				//通过循环输出字节数组       println 强制换行    a[i]+"kongge" kongge 字符间距
				for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+"   ");   对应的数字就是对应字符的值
				104   101   108   108   111   119   111   114   108   100 
				}
				String str="a";
				byte a[]=str.getBytes();
				for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+"   ");  a=97   A= 65
				
		*/

		/*把字符串转还为字节数组
		 * public byte[] getBytes()
		 * 
		 * 面向对象
		 * 类  对象 this extendes interface
		 * static 封装 继承 多态
		 * 方法的重载  异常
		 */
		
		/* 把字节数组转换为字符串
		 *  public String(byte[]bytes)
		 * 定义一个字节数组
				byte ch[]= {'a','b','c','f'};
				//char
				String str=new String(ch);
				String str1=new String(ch);
		         System.out.println(str);
		         System.out.println(str1);
		
		*/
		
/*
		char a1='b';
		char a2='B'	;
		
		int b1 =a1;
		int b2= a2;
		
		System.out.println(b1);
		System.out.println(b2);*/
		
		
		
		
		
		
		
	}

}
