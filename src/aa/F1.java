package aa;

public class F1 {

	public static void main(String[] args) {
		

		/*
		 * ���ַ�����ת��Ϊ�ַ��� ,offset ��ʼλ��,ת���ĸ��� public string(char[] value��int offstage,int count)
		 * 
		 *
		 * ���ַ�����ת��Ϊ�ַ��� public string(char[] value) ���췽�� public ������(�������� ����,��������
		 * ����...){}
		 */

		// ��������[]������={}; ������������ǰ����
		// ����һ�����ݣ�������Ϊa
		char a[] = { 'h', 'e', 'l', 'l', 'o' };
		// ���ַ�����ת��Ϊ�ַ���,������ʼλ�úͽ�������
		String str = new String(a, 1, 4);    //ȫ��Ϊa  
		System.out.println(str);
		
		
		/*����һ���ַ���   
				String str="helloworld";
				//���ַ���ת��Ϊ�ֽ�����
				byte a[]=str.getBytes();
				//ͨ��ѭ������ֽ�����       println ǿ�ƻ���    a[i]+"kongge" kongge �ַ����
				for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+"   ");   ��Ӧ�����־��Ƕ�Ӧ�ַ���ֵ
				104   101   108   108   111   119   111   114   108   100 
				}
				String str="a";
				byte a[]=str.getBytes();
				for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+"   ");  a=97   A= 65
				
		*/

		/*���ַ���ת��Ϊ�ֽ�����
		 * public byte[] getBytes()
		 * 
		 * �������
		 * ��  ���� this extendes interface
		 * static ��װ �̳� ��̬
		 * ����������  �쳣
		 */
		
		/* ���ֽ�����ת��Ϊ�ַ���
		 *  public String(byte[]bytes)
		 * ����һ���ֽ�����
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
