package aa;

public class Mm55 {

	public static void main(String[] args) {
		
		
		/**
		 * boolean 只有两个值， True和false
		 * 比较两个字符串是否相等，比较的只是一个数值
		 * public boolean equals(Object anObject)
		 * 比较两个字符串是否相等，忽略大小写
		 * public boolean equalsIgnoreCase(string anotherboject）
	
		 * 
		 */

		String  str ="hellow";
		String stra ="HELLOW";
		// 比较两个字符串是否相等
		System.out.println(str.equals(stra));
		//忽略了大小写
		System.out.println(str.equalsIgnoreCase(stra));
		
		/**
		 * 比较两个字符串的大小，返回值是int，大于(>0),等于(=0),小于(<0)
		 * public int compareTo(String anotherString)
		 * 比较两个字符串的大小，忽略大小写   
		 * public int equalsIgnoreCase(String str)
		
		 */
		String stra1 ="as"; //97
		String stra2="As";  //65
	
		String stra3="As";//65
		//比较两个字符串的大小
		System.out.println(stra2.compareTo(stra1));
		System.out.println(stra2.compareTo(stra3));
	    System.out.println(stra1.compareToIgnoreCase(stra2));
		
	}

}
