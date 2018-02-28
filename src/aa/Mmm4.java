package aa;

public class Mmm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 字符串的替换
		 * oldChar:原始字符串中的内容
		 * newChar:要替换的内容
		 * public String replace(char oldChar,char newChar)
		 * 
		 * 
		 * 
		 */
		String str="今天很痛苦，明天很痛苦，但是后天很美好";
		//替换字符串的内容并输出
		System.out.println(str.replace("天","你好"));
		
		/*
		 * 字符串的替换
		 * regex:原始要替换的内容
		 * replacement:要替换的内容
		 * 
		 * public String replaceFirst(String regex,String replacement)
		
		 * 
		 */
		System.out.println(str.replaceFirst("天", "_"));
		
		
		
		
		
		
		
	}

}
