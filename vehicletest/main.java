package vehicletest;

import java.io.InputStream;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������Ϣ���£�");
		System.out.println("�ؿͳ�");
		System.out.println("���	��������	�⳵���ã�Ԫ/�������죩��	������ˣ��ˣ�");
		System.out.println("1	С�γ�	40	                                 4");
		System.out.println("2	�����	65	                                 7");
		System.out.println("3	��ͳ�	180	                                 20");
		System.out.println("�ػ���");
		System.out.println("���	��������	�⳵���ã�Ԫ/�������죩��	����ػ����֣���");
		System.out.println("4	������	30	                                1.5");
		System.out.println("5	������	47	                                2.5");
		System.out.println("6	��ʽ��	80	                                4.5");
		System.out.println("Ƥ����");
		System.out.println("���	��������	�⳵���ã�Ԫ/�������죩��	������ˣ��ˣ�	����ػ����֣�");
		System.out.println("7	��ʽƤ����     60	                                     5	                        1");
		System.out.println("8	��ʽƤ����     60	                                     2	                        3");
	peoplecar p1=new peoplecar(); 
	p1.name="С�γ�";
	p1.fee=40;
	p1.num=4;
	peoplecar p2=new peoplecar(); 
	p2.name="�����";
	p2.fee=6540;
	p2.num=74;
	peoplecar p3=new peoplecar(); 
	p3.name="��ͳ�";
	p3.fee=180;
	p3.num=20;
	goodcar g1=new goodcar(); 
	g1.name="������";
	g1.fee=30;
	g1.num=1.5;
	goodcar g2=new goodcar(); 
	g2.name="������";
	g2.fee=47;
	g2.num=2.5;
	goodcar g3=new goodcar(); 
	g3.name="��ʽ��";
	g3.fee=80;
	g3.num=4.5;
	pecar e1=new pecar(); 
	e1.name="��ʽƤ����";
	e1.fee=60;
	e1.num=5;
	e1.good=1;
	pecar e2=new pecar(); 
	e2.name="��ʽƤ����";
	e2.fee=60;
	e2.num=1;
	e2.good=3;
	Scanner sc=Scanner(System.in);
	System.out.println("���������1"+p1.name+"����������:");
     p1.number=sc.nextInt();
    System.out.println("���������2"+p2.name+"����������:");
     p2.number=sc.nextInt();
	System.out.println("���������3"+p3.name+"����������:");
	 p3.number=sc.nextInt();
	System.out.println("���������1"+g1.name+"����������:");
    g1.number=sc.nextInt();
	System.out.println("���������2"+g2.name+"����������:");
    g2.number=sc.nextInt();     
	System.out.println("���������3"+g3.name+"����������:");
    g3.number=sc.nextInt();     
	System.out.println("���������1"+e1.name+"����������:");
    e1.number=sc.nextInt();
	System.out.println("���������1"+e2.name+"����������:");
    e2.number=sc.nextInt();
	System.out.println("��������������");
	p1.day=p2.day=p3.day=g1.day=g2.day=g3.day=e1.day=e2.day=sc.nextInt();
	int tpeople,tfee,tnumber;
	double tgood;
tpeople=p1.number*p1.num+p2.number*p2.num+p3.number*p3.num+e1.number*e1.num+e2.number*e2.num;
tgood=g1.number*g1.num+g2.number*g2.num+g3.number*g3.num+e1.number*e1.good+e2.number*e2.good;
tfee=p1.jisuan()+p2.jisuan()+p3.jisuan()+g1.jisuan()+g2.jisuan()+g3.jisuan()+e1.jisuan()+e2.jisuan();
tnumber=g1.number+g2.number+g3.number+p1.number+p2.number+p3.number+e1.number+e2.number;
System.out.println("�����⳵������ػ���"+tgood);
System.out.println("�����⳵����"+tfee);
System.out.println("�⳵����"+p1.day);
System.out.println("���ó�������"+tnumber);
System.out.println("����������������Ŀ:");
p1.show();
p2.show();
p3.show();
g1.show();
g2.show();
g3.show();
e1.show();
e2.show();

	}
	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}


}
