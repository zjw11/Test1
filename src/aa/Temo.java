package aa;

import java.util.Scanner;

public class Temo {

	public static void main(String[] args) {
		//条件？值1：值2
		//条件成立返回值1 不成立返回值2
		int a= 1>0?10:20;
		/**
		 * 三目运算  三元表达式
		 * 1.使用Scanner 输入三个整数
		 * 2、使用三元表达式  获取最大值并输出
		 * Ctrl +alt  +   复制当前 代码 到下一行
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第一个值");
		int x1=scan.nextInt();// 获取 输入的整数
		
		System.out.println("请输入第二个值");
		int x2=scan.nextInt();
		
		System.out.println("请输入第三个值");
		int x3=scan.nextInt();
		
		
		
		int max=x1>x2?x1:x2;//最大值
		max =max>x3?max:x3;
		System.out.println(max);
		
		
		
		
	}

}
