package aa;

public class Mmm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * �ַ������滻
		 * oldChar:ԭʼ�ַ����е�����
		 * newChar:Ҫ�滻������
		 * public String replace(char oldChar,char newChar)
		 * 
		 * 
		 * 
		 */
		String str="�����ʹ�࣬�����ʹ�࣬���Ǻ��������";
		//�滻�ַ��������ݲ����
		System.out.println(str.replace("��","���"));
		
		/*
		 * �ַ������滻
		 * regex:ԭʼҪ�滻������
		 * replacement:Ҫ�滻������
		 * 
		 * public String replaceFirst(String regex,String replacement)
		
		 * 
		 */
		System.out.println(str.replaceFirst("��", "_"));
		
		
		
		
		
		
		
	}

}
