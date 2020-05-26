package vehicletest;

import java.io.InputStream;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("车辆信息如下：");
		System.out.println("载客车");
		System.out.println("序号	车辆名称	租车费用（元/（车·天））	最大载人（人）");
		System.out.println("1	小轿车	40	                                 4");
		System.out.println("2	面包车	65	                                 7");
		System.out.println("3	大巴车	180	                                 20");
		System.out.println("载货车");
		System.out.println("序号	车辆名称	租车费用（元/（车·天））	最大载货（吨））");
		System.out.println("4	低栏车	30	                                1.5");
		System.out.println("5	高栏车	47	                                2.5");
		System.out.println("6	厢式车	80	                                4.5");
		System.out.println("皮卡车");
		System.out.println("序号	车辆名称	租车费用（元/（车·天））	最大载人（人）	最大载货（吨）");
		System.out.println("7	日式皮卡车     60	                                     5	                        1");
		System.out.println("8	美式皮卡车     60	                                     2	                        3");
	peoplecar p1=new peoplecar(); 
	p1.name="小轿车";
	p1.fee=40;
	p1.num=4;
	peoplecar p2=new peoplecar(); 
	p2.name="面包车";
	p2.fee=6540;
	p2.num=74;
	peoplecar p3=new peoplecar(); 
	p3.name="大巴车";
	p3.fee=180;
	p3.num=20;
	goodcar g1=new goodcar(); 
	g1.name="低栏车";
	g1.fee=30;
	g1.num=1.5;
	goodcar g2=new goodcar(); 
	g2.name="高栏车";
	g2.fee=47;
	g2.num=2.5;
	goodcar g3=new goodcar(); 
	g3.name="厢式车";
	g3.fee=80;
	g3.num=4.5;
	pecar e1=new pecar(); 
	e1.name="日式皮卡车";
	e1.fee=60;
	e1.num=5;
	e1.good=1;
	pecar e2=new pecar(); 
	e2.name="日式皮卡车";
	e2.fee=60;
	e2.num=1;
	e2.good=3;
	Scanner sc=Scanner(System.in);
	System.out.println("请输入序号1"+p1.name+"的租用数量:");
     p1.number=sc.nextInt();
    System.out.println("请输入序号2"+p2.name+"的租用数量:");
     p2.number=sc.nextInt();
	System.out.println("请输入序号3"+p3.name+"的租用数量:");
	 p3.number=sc.nextInt();
	System.out.println("请输入序号1"+g1.name+"的租用数量:");
    g1.number=sc.nextInt();
	System.out.println("请输入序号2"+g2.name+"的租用数量:");
    g2.number=sc.nextInt();     
	System.out.println("请输入序号3"+g3.name+"的租用数量:");
    g3.number=sc.nextInt();     
	System.out.println("请输入序号1"+e1.name+"的租用数量:");
    e1.number=sc.nextInt();
	System.out.println("请输入序号1"+e2.name+"的租用数量:");
    e2.number=sc.nextInt();
	System.out.println("请输入租用天数");
	p1.day=p2.day=p3.day=g1.day=g2.day=g3.day=e1.day=e2.day=sc.nextInt();
	int tpeople,tfee,tnumber;
	double tgood;
tpeople=p1.number*p1.num+p2.number*p2.num+p3.number*p3.num+e1.number*e1.num+e2.number*e2.num;
tgood=g1.number*g1.num+g2.number*g2.num+g3.number*g3.num+e1.number*e1.good+e2.number*e2.good;
tfee=p1.jisuan()+p2.jisuan()+p3.jisuan()+g1.jisuan()+g2.jisuan()+g3.jisuan()+e1.jisuan()+e2.jisuan();
tnumber=g1.number+g2.number+g3.number+p1.number+p2.number+p3.number+e1.number+e2.number;
System.out.println("总体租车的最大载货量"+tgood);
System.out.println("总体租车费用"+tfee);
System.out.println("租车天数"+p1.day);
System.out.println("租用车辆总数"+tnumber);
System.out.println("各个车辆的租用数目:");
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
