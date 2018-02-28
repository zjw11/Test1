package aa;

public class Mm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *split:拆分
		 *字符串的拆分
		 *regex:要拆分的格式
		 *public String[] split(String regex) 
		 * 
		 * 
		 */
		String str ="美女 你好 请问 你 有 男朋友 吗";
		//把内容拆分为，存在data数组中
		String data[]=str.split(" ");
		//对数组进行输出，数组名.length 是获取数组的长度
		for(int i=0;i<data.length;i++){
		//输出每一个数组中的数
		System.out.println(data[i]);
		  
		}
				//不替换. 拆分以下步骤  \为转移字符
		String ip ="192,168.0.1";
		String data1[]=ip.split("\\,");
		for(int i=0;i<data1.length;i++) {
			System.out.println(data1[i]);
		}
				
		
	//	String data2[] =ips.split("123");
		
		
		
		/*
		 * 拆分字符串
		 * regex:拆分字符串的格式
		 * limit:指定拆分的位置
		 * public String[] split(String regex,int limit)
		 *
		 * 
		 * 
		 */
		String strs ="人潮 |涌动| 相识|既是一种|缘分";
		String data3[]=strs.split("\\|",4);
		for(int i=0;i<data3.length;i++){
			
			System.out.println(data3[i]);
			
		}
				
		
		
		
	}

}
