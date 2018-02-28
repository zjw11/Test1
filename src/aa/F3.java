package aa;

public class F3 {

	public static void main(String[] args) {

		/*
		 * 判断某一个字符是否存在，存在返回true，不存在返回false
		 * public boolean contains(Charsequence s)
		 * 		
		 */
		//定义一个字符串
		String  str ="hellow";
		//判断这个中是否存在hes字符串
		if(str.contains("hes")){
		System.out.println("在str字符串中存在有he");
	
		} else	 {
			System.out.println("在str 字符串中不存在hes");
		}
		
		
		/*
		 * 从指定的位置检索(查询)一个字符串，如果这个字符串存在，返回这个字符串存在的位置
		 * 如果不存在，返回—1;ch 要检索的内容
		 * public int indexOf(int ch)
		 * 1为检索的一个位置  ;w为以上hellow w对应的位置 为5;
		 *如果if(str.indexOf("h")!=-1) str中检索是否字符h.如果存在返回位置，不存在返回-1  indexOf指出 索引出
		*/
		
	/*	System.out.println(str.indexOf("w"));
		if(str.indexOf(1)>0) {
			System.out.println("str中存在有o字符");
		}else{
			System.out.println("str中不存在有o字符");
		}
		*/
		/*
		 *  * 从指定的位置检索(查询)一个字符串，如果这个字符串存在，返回这个字符串存在的位置
		 * 如果不存在，返回—1;ch 要检索字符串,fromIndex 参数哪里开始检索
		 * public int indexOf(int ch,int fromIndex)
		
		 * 
		 * 
		 * 
		 */
		//或者把下if 后,0.1.2不等于-1他是真的true就运行   得出结果就是今天主席可能有其他事情   从3以后就会 检索不到 就会自动下一个程序      0今 1天2习
		/*String stra="今天习近平主席，会见美国总统特朗普";
		//(stra.indexOf("习近平",1)返回指定位置数，位置数为2 习近平为一个整体字符    如果条件里面检索到以上的内容都是第一句
		if(stra.indexOf("习近平",1)!=-1) {
			System.out.println("今天主席会见了美国总统");
			
		}else {System.out.println("今天主席可能有其他事情");
		*/
		
		
		
	}
		/*
		 * 从后面检索字符是否存在，如果存在就返回他的位置，如果不存在就返回-1
		 * public int lastIndexOf(int ch)
		 * 
		
		 */
		/*
		String strs="世界很大，我想去看看";
		//
		System.out.println(strs.lastIndexOf("看"));
	*/
		
		/*
		 *从后面检索字符是否存在，如果存在就返回他的位置，如果不存在就返回-1 
		 * ch 参数要检索的字符串，formIndex 参数是从哪里开始
		 * public int lastIndexOf(int ch,int fromIndex)
		 * 
		 * 
		 */
		/*String strac="不要吹牛逼了，好好地听，哥带你飞";
		//Sting strt="不要吹牛逼了";5是提取的范围
		System.out.println(strac.lastIndexOf("牛",5));
		*/
		/*
		 * 以某个字符串开的，如果存在返回true，不存在false
		 * prefix 要查询的开头的字符, toffset 是从哪里开始
		 * public boolean startsWith(String prefix,int toffset)
		 * 
		 */
		/*String sts="**123456@qq.com";
		//返回的是以某开头
		
		System.out.println(sts.startsWith("1",2));
		
		 * 以某一个字符结尾，存在返回true，不存在返回false
		 * public boolean endsWith(String suffix )
		 * 
		 * 
		 * 
		 */
//		System.out.println(sts.endsWith(".com"));
		
		
		
		
		
	}
//	}
		
		
		
		
		
		
	


