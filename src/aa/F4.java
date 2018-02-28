package aa;

public class F4 {
	public static void main(String[] args) {
		/*	Person per = new Person("张三", 12);
		per.setName("张四");
		per.setAge(15);
		System.out.println(per.infoz());
		System.out.println(per.getName());
		System.out.println(per.getAge());*/
		Person per = new Person("张三", 12);
		System.out.println(per.infoz());
		
		
	}
}

class Person {
	private String name;
	private int age;

	/*public Person(String name, int age) { 
		this.name = name;
		this.age = age;
	}
*/
	
	//通过setter  赋值
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	//无参数构造
	public Person(){
		System.out.println("今天昆明下雪了");
	}
      public Person(String name){
    	  this();          
    	  this.name=name;
    	
      }
      public Person(int age){
    	  this.age=age;
      }
      public Person(String name,int age){
    	  this(name);//调用   this() 
    	  this.age=age;
      }
      public String infoz() {	
			return"姓名:" +name+",年龄:"+age;
			
	}
      
}

/*
 * java 的数据类型 int char 字符 byte 字节 double 小数（双精度） float（单精度） 小数 string 字符串 long
 * short boolean java 的数据类型分为两类 1.java的基本数据类型 （1）、数值型 <1>整形 默认值是0 int（整型） 4个字节
 * byte（字节型） 单个字节 short（短整形） 2个字节 long（长整型） 8个字节 <2>浮点型 浮点型默认值0.0 double（双精度）
 * float（单精度）
 * 
 * （2）、字符型 字符的默认值是"\u0000" char <3>布尔型 默认值 false boolean 布尔型 true false 2.引用数据类型
 * 默认值为null 数组 数组的定义 类型[]数组名 = new 类型（）; 类 string Random 接口
 * 
 * 表示整数数据 int，学生年龄，班级 等 表示小数的时候，我们用的是double 表示文件的一个大小，内存大小，时间大小数字 我们可以用 long（字节）
 * 进行编码转换，字节输出 byte 进行中文处理的时候 char 逻辑上的处理 我们采用 boolean
 */

// 每一个字符对应一个ASCII编码

// public private 修饰符
