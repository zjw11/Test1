package aa;

public class Mm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *split:���
		 *�ַ����Ĳ��
		 *regex:Ҫ��ֵĸ�ʽ
		 *public String[] split(String regex) 
		 * 
		 * 
		 */
		String str ="��Ů ��� ���� �� �� ������ ��";
		//�����ݲ��Ϊ������data������
		String data[]=str.split(" ");
		//��������������������.length �ǻ�ȡ����ĳ���
		for(int i=0;i<data.length;i++){
		//���ÿһ�������е���
		System.out.println(data[i]);
		  
		}
				//���滻. ������²���  \Ϊת���ַ�
		String ip ="192,168.0.1";
		String data1[]=ip.split("\\,");
		for(int i=0;i<data1.length;i++) {
			System.out.println(data1[i]);
		}
				
		
	//	String data2[] =ips.split("123");
		
		
		
		/*
		 * ����ַ���
		 * regex:����ַ����ĸ�ʽ
		 * limit:ָ����ֵ�λ��
		 * public String[] split(String regex,int limit)
		 *
		 * 
		 * 
		 */
		String strs ="�˳� |ӿ��| ��ʶ|����һ��|Ե��";
		String data3[]=strs.split("\\|",4);
		for(int i=0;i<data3.length;i++){
			
			System.out.println(data3[i]);
			
		}
				
		
		
		
	}

}
