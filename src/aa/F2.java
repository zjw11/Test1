package aa;

public class F2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�Ƚ������ַ����Ƿ���� 
		// Public boolean equals(Object anobject)
		String a= "hello" ;
		String a1="hello" ;
		String a2=new String("hello");//string a2  ���¿�����һ���ռ� ��string �ȿ���һ���ռ�  ��
		//�ȿ��ٵĻ�����������
		
	System.out.println("a��a1��equals�����Ƚϣ�"+a.equals(a1));// true ����һ��
	System.out.println("a��a2��equals�����Ƚϣ�"+a.equals(a2));	//true   ����һ��
	System.out.println("a��a1��equals�����Ƚϣ�"+(a==a1));	//true
	System.out.println("a��a2��equals�����Ƚϣ�"+(a==a2));	//false ���� hello   λ��Ҫһ��   ��ַ��һ��
		
		// ==��equals()�������^����
	   /*
	    * == �Ƚϵ���String �ڴ���е����ݺ͵�ַ��ȲŻ�true
	    * ==equals()�Ƚϵ����ڴ����ֵ���
	    * 
	    * �ֹ����(�ֹ����ʵ�����ݵĹ���
	    * Public String intern()
	    * 
	    */
		//System.out.println(a==a2.intern());
		
		
		
		
		
		
	}

}
