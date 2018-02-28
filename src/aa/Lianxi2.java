package aa;

import java.util.Arrays;

public class Lianxi2 {

	public static void main(String[] args) {
	// 数组的定义 
	/*	数据类型 数组名称[]=new 数据类型[数组的长度];
	 * 数据类型[]数组名称 =new 数据类型 [数组的长度];
	 * 分布式：
	 * 申明数组  
	 * 数组类型  数组名称[]=null;
	 * 数组名称 =new 数组类型[数组的长度];
	 *
	 * 开辟数组空间
	 * 数组名称 =new 数组类型[];
	 * 静态初始化
	 * 数据类型 []数组名称=new 数据类型[]{值，值。。}
	 * 
	 * 简化数据 静态初始化
	 * 数据类型片[]数组名称={值,值,值。。}
	 * 类： 属性和行为的集合 行为 --->方法:能干什么事--->根据方法的名称 参数：干什么事要用到的东西 public void
     * +方法名称(参数){ 该怎么搞 }
     * 
     * 		构造方法：程序的初始化操作
     *      public +当前类的名称(){}
	 *    自定义方法：public void 方法名称(参数){}
     *  构造方法如何执行
	 *	 当我们创建某个类的对象的时候，就已经开始执行了
	 *	new Aa();
	 *	 自定义方法如何执行
	 *	 创建该自定义方法所在的类的对象 用对象名称点出来他的方法名称
	 *	Aa a = new Aa();
	 *	a.show();
     * 
	 * */
		

		
		//将 A B C 
	/*	char []aa={'A','B','C'};
		System.out.println(aa);*/
	/*      
		char c[]=new char[3];
	    c[0]='A';      //数组的赋值 下标从0 开始
	    c[1]='B';
	    c[2]='C';
	 for(int i=0;i<c.length;i++){
		 System.out.println(c);
	 }
	*/
		
		
		
		/*char [] c={'A','B','C'};
		int i=0;
		while(i<c.length){              //跳出循环的条件  i>c跳出循环  <执行下面语句
			System.out.println(c[i]);
			i++;
		}*/
		
	/*	char [] c={'A','B','C'};                到着输出
		int i=c.length-1;
		while(i>=0){              //跳出循环的条件  i>c跳出循环  <执行下面语句
			System.out.println(c[i]);
			i--;
		}
		*/
		
	   /*  char [] c={'A','B','C'};
		 for(int i=c.length-1;i>=0;i--){
			 System.out.println(c[i]);
		 }*/
		
	
		
		
		
		
		chengji();//调用
	          
	
		
	}
	//88.8 ,56.4,98,60,96.0,56.2,12.6,77.7,88.9,66.5  平均成绩 最大 最小 总成绩
	
	//double sum=0;double max=data[0];double min=data[0];double pj=0;

	public static void chengji(){
	double data[]={88.8 ,56.4,98,60,96.0,56.2,12.6,77.7,88.9,66.5};
	double sum=0; //定义总成绩
	double min=data[0];//定义成绩下标
	double max=data[0];
	int maxflag=0;
	int minflag=0;              
	//方法一
/*	for(int i= 0;i<data.length;i++){
		sum+=data[i];
		if(max<data[i]){
			max=data[i];
			maxflag=i;
			
			}
		
		if(min>data[i]){
			min=data[i];
			minflag=i;
		
		}
	}*/
	//方法二：
/*	int i=0;
	while(i<data.length){  //跳出循环的条件
		sum+=data[i];
		if(max<data[i]){   //比最大成绩还打吗       
			max=data[i];   //赋值给最大值
			maxflag=i;
	}
		if(min>data[i]){
			min=data[i];
			minflag=i;
		}
	i++;//改变循环的条件
	    
	}*/
	                Arrays.sort(data);//       排序  大小
	              for (double i:data){
		             System.out.println(i);
		 
	 }
	/*	System.out.println("总成绩     " +sum);
		 System.out.println("平均成绩"+sum/data.length);
	    System.out.println("最大值 "+max+",最大成绩的下标"+maxflag);
	    System.out.println("最小值 "+min+",最大成绩的下标"+minflag);
	    */
	}
	}	
	

