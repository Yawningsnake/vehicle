package vehicletest;

public class goodcar {
	String name;//����
	int fee;//��������
	double num;//������
	int number;//�⳵��
	int day;//����
	int jisuan()
	{     int tfee;//�ܷ���
		if(number<0||day<0) {
			System.out.println("����;");
			return -1;}
		else {
			tfee = number*fee*day;
			return tfee;
		}}
		void show()	
		{if(number>0)
		System.out.println("���ͣ�"+name+"������Ŀ��"+number);	
		}
}
