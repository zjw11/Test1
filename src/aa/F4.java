package aa;

public class F4 {
	public static void main(String[] args) {
		/*	Person per = new Person("����", 12);
		per.setName("����");
		per.setAge(15);
		System.out.println(per.infoz());
		System.out.println(per.getName());
		System.out.println(per.getAge());*/
		Person per = new Person("����", 12);
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
	
	//ͨ��setter  ��ֵ
	
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

	
	
	//�޲�������
	public Person(){
		System.out.println("����������ѩ��");
	}
      public Person(String name){
    	  this();          
    	  this.name=name;
    	
      }
      public Person(int age){
    	  this.age=age;
      }
      public Person(String name,int age){
    	  this(name);//����   this() 
    	  this.age=age;
      }
      public String infoz() {	
			return"����:" +name+",����:"+age;
			
	}
      
}

/*
 * java ���������� int char �ַ� byte �ֽ� double С����˫���ȣ� float�������ȣ� С�� string �ַ��� long
 * short boolean java ���������ͷ�Ϊ���� 1.java�Ļ����������� ��1������ֵ�� <1>���� Ĭ��ֵ��0 int�����ͣ� 4���ֽ�
 * byte���ֽ��ͣ� �����ֽ� short�������Σ� 2���ֽ� long�������ͣ� 8���ֽ� <2>������ ������Ĭ��ֵ0.0 double��˫���ȣ�
 * float�������ȣ�
 * 
 * ��2�����ַ��� �ַ���Ĭ��ֵ��"\u0000" char <3>������ Ĭ��ֵ false boolean ������ true false 2.������������
 * Ĭ��ֵΪnull ���� ����Ķ��� ����[]������ = new ���ͣ���; �� string Random �ӿ�
 * 
 * ��ʾ�������� int��ѧ�����䣬�༶ �� ��ʾС����ʱ�������õ���double ��ʾ�ļ���һ����С���ڴ��С��ʱ���С���� ���ǿ����� long���ֽڣ�
 * ���б���ת�����ֽ���� byte �������Ĵ����ʱ�� char �߼��ϵĴ��� ���ǲ��� boolean
 */

// ÿһ���ַ���Ӧһ��ASCII����

// public private ���η�
