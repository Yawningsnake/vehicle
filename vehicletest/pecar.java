package vehicletest;

public class pecar {
	String name;//车型
	int fee;//单个费用
	int num;//载人数量
	double good;//载货
	int number;//租车数
	int day;//天数
	int jisuan()
	{     int tfee;//总费用
		if(number<0||day<0) {
			System.out.println("错误;");
			return -1;}
		else {
			tfee = number*fee*day;
			return tfee;
		}}
		void show()	
		{if(number>0)
		System.out.println("车型："+name+"租用数目："+number);	
		}
}
