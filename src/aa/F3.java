package aa;

public class F3 {

	public static void main(String[] args) {

		/*
		 * �ж�ĳһ���ַ��Ƿ���ڣ����ڷ���true�������ڷ���false
		 * public boolean contains(Charsequence s)
		 * 		
		 */
		//����һ���ַ���
		String  str ="hellow";
		//�ж�������Ƿ����hes�ַ���
		if(str.contains("hes")){
		System.out.println("��str�ַ����д�����he");
	
		} else	 {
			System.out.println("��str �ַ����в�����hes");
		}
		
		
		/*
		 * ��ָ����λ�ü���(��ѯ)һ���ַ������������ַ������ڣ���������ַ������ڵ�λ��
		 * ��������ڣ����ء�1;ch Ҫ����������
		 * public int indexOf(int ch)
		 * 1Ϊ������һ��λ��  ;wΪ����hellow w��Ӧ��λ�� Ϊ5;
		 *���if(str.indexOf("h")!=-1) str�м����Ƿ��ַ�h.������ڷ���λ�ã������ڷ���-1  indexOfָ�� ������
		*/
		
	/*	System.out.println(str.indexOf("w"));
		if(str.indexOf(1)>0) {
			System.out.println("str�д�����o�ַ�");
		}else{
			System.out.println("str�в�������o�ַ�");
		}
		*/
		/*
		 *  * ��ָ����λ�ü���(��ѯ)һ���ַ������������ַ������ڣ���������ַ������ڵ�λ��
		 * ��������ڣ����ء�1;ch Ҫ�����ַ���,fromIndex �������￪ʼ����
		 * public int indexOf(int ch,int fromIndex)
		
		 * 
		 * 
		 * 
		 */
		//���߰���if ��,0.1.2������-1�������true������   �ó�������ǽ�����ϯ��������������   ��3�Ժ�ͻ� �������� �ͻ��Զ���һ������      0�� 1��2ϰ
		/*String stra="����ϰ��ƽ��ϯ�����������ͳ������";
		//(stra.indexOf("ϰ��ƽ",1)����ָ��λ������λ����Ϊ2 ϰ��ƽΪһ�������ַ�    �������������������ϵ����ݶ��ǵ�һ��
		if(stra.indexOf("ϰ��ƽ",1)!=-1) {
			System.out.println("������ϯ�����������ͳ");
			
		}else {System.out.println("������ϯ��������������");
		*/
		
		
		
	}
		/*
		 * �Ӻ�������ַ��Ƿ���ڣ�������ھͷ�������λ�ã���������ھͷ���-1
		 * public int lastIndexOf(int ch)
		 * 
		
		 */
		/*
		String strs="����ܴ�����ȥ����";
		//
		System.out.println(strs.lastIndexOf("��"));
	*/
		
		/*
		 *�Ӻ�������ַ��Ƿ���ڣ�������ھͷ�������λ�ã���������ھͷ���-1 
		 * ch ����Ҫ�������ַ�����formIndex �����Ǵ����￪ʼ
		 * public int lastIndexOf(int ch,int fromIndex)
		 * 
		 * 
		 */
		/*String strac="��Ҫ��ţ���ˣ��úõ�����������";
		//Sting strt="��Ҫ��ţ����";5����ȡ�ķ�Χ
		System.out.println(strac.lastIndexOf("ţ",5));
		*/
		/*
		 * ��ĳ���ַ������ģ�������ڷ���true��������false
		 * prefix Ҫ��ѯ�Ŀ�ͷ���ַ�, toffset �Ǵ����￪ʼ
		 * public boolean startsWith(String prefix,int toffset)
		 * 
		 */
		/*String sts="**123456@qq.com";
		//���ص�����ĳ��ͷ
		
		System.out.println(sts.startsWith("1",2));
		
		 * ��ĳһ���ַ���β�����ڷ���true�������ڷ���false
		 * public boolean endsWith(String suffix )
		 * 
		 * 
		 * 
		 */
//		System.out.println(sts.endsWith(".com"));
		
		
		
		
		
	}
//	}
		
		
		
		
		
		
	


