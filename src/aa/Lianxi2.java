package aa;

import java.util.Arrays;

public class Lianxi2 {

	public static void main(String[] args) {
	// ����Ķ��� 
	/*	�������� ��������[]=new ��������[����ĳ���];
	 * ��������[]�������� =new �������� [����ĳ���];
	 * �ֲ�ʽ��
	 * ��������  
	 * ��������  ��������[]=null;
	 * �������� =new ��������[����ĳ���];
	 *
	 * ��������ռ�
	 * �������� =new ��������[];
	 * ��̬��ʼ��
	 * �������� []��������=new ��������[]{ֵ��ֵ����}
	 * 
	 * ������ ��̬��ʼ��
	 * ��������Ƭ[]��������={ֵ,ֵ,ֵ����}
	 * �ࣺ ���Ժ���Ϊ�ļ��� ��Ϊ --->����:�ܸ�ʲô��--->���ݷ��������� ��������ʲô��Ҫ�õ��Ķ��� public void
     * +��������(����){ ����ô�� }
     * 
     * 		���췽��������ĳ�ʼ������
     *      public +��ǰ�������(){}
	 *    �Զ��巽����public void ��������(����){}
     *  ���췽�����ִ��
	 *	 �����Ǵ���ĳ����Ķ����ʱ�򣬾��Ѿ���ʼִ����
	 *	new Aa();
	 *	 �Զ��巽�����ִ��
	 *	 �������Զ��巽�����ڵ���Ķ��� �ö������Ƶ�������ķ�������
	 *	Aa a = new Aa();
	 *	a.show();
     * 
	 * */
		

		
		//�� A B C 
	/*	char []aa={'A','B','C'};
		System.out.println(aa);*/
	/*      
		char c[]=new char[3];
	    c[0]='A';      //����ĸ�ֵ �±��0 ��ʼ
	    c[1]='B';
	    c[2]='C';
	 for(int i=0;i<c.length;i++){
		 System.out.println(c);
	 }
	*/
		
		
		
		/*char [] c={'A','B','C'};
		int i=0;
		while(i<c.length){              //����ѭ��������  i>c����ѭ��  <ִ���������
			System.out.println(c[i]);
			i++;
		}*/
		
	/*	char [] c={'A','B','C'};                �������
		int i=c.length-1;
		while(i>=0){              //����ѭ��������  i>c����ѭ��  <ִ���������
			System.out.println(c[i]);
			i--;
		}
		*/
		
	   /*  char [] c={'A','B','C'};
		 for(int i=c.length-1;i>=0;i--){
			 System.out.println(c[i]);
		 }*/
		
	
		
		
		
		
		chengji();//����
	          
	
		
	}
	//88.8 ,56.4,98,60,96.0,56.2,12.6,77.7,88.9,66.5  ƽ���ɼ� ��� ��С �ܳɼ�
	
	//double sum=0;double max=data[0];double min=data[0];double pj=0;

	public static void chengji(){
	double data[]={88.8 ,56.4,98,60,96.0,56.2,12.6,77.7,88.9,66.5};
	double sum=0; //�����ܳɼ�
	double min=data[0];//����ɼ��±�
	double max=data[0];
	int maxflag=0;
	int minflag=0;              
	//����һ
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
	//��������
/*	int i=0;
	while(i<data.length){  //����ѭ��������
		sum+=data[i];
		if(max<data[i]){   //�����ɼ�������       
			max=data[i];   //��ֵ�����ֵ
			maxflag=i;
	}
		if(min>data[i]){
			min=data[i];
			minflag=i;
		}
	i++;//�ı�ѭ��������
	    
	}*/
	                Arrays.sort(data);//       ����  ��С
	              for (double i:data){
		             System.out.println(i);
		 
	 }
	/*	System.out.println("�ܳɼ�     " +sum);
		 System.out.println("ƽ���ɼ�"+sum/data.length);
	    System.out.println("���ֵ "+max+",���ɼ����±�"+maxflag);
	    System.out.println("��Сֵ "+min+",���ɼ����±�"+minflag);
	    */
	}
	}	
	

