package aa;

public class Mm55 {

	public static void main(String[] args) {
		
		
		/**
		 * boolean ֻ������ֵ�� True��false
		 * �Ƚ������ַ����Ƿ���ȣ��Ƚϵ�ֻ��һ����ֵ
		 * public boolean equals(Object anObject)
		 * �Ƚ������ַ����Ƿ���ȣ����Դ�Сд
		 * public boolean equalsIgnoreCase(string anotherboject��
	
		 * 
		 */

		String  str ="hellow";
		String stra ="HELLOW";
		// �Ƚ������ַ����Ƿ����
		System.out.println(str.equals(stra));
		//�����˴�Сд
		System.out.println(str.equalsIgnoreCase(stra));
		
		/**
		 * �Ƚ������ַ����Ĵ�С������ֵ��int������(>0),����(=0),С��(<0)
		 * public int compareTo(String anotherString)
		 * �Ƚ������ַ����Ĵ�С�����Դ�Сд   
		 * public int equalsIgnoreCase(String str)
		
		 */
		String stra1 ="as"; //97
		String stra2="As";  //65
	
		String stra3="As";//65
		//�Ƚ������ַ����Ĵ�С
		System.out.println(stra2.compareTo(stra1));
		System.out.println(stra2.compareTo(stra3));
	    System.out.println(stra1.compareToIgnoreCase(stra2));
		
	}

}
