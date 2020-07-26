package cleancode;

import java.util.*;
import java.math.*;
class SimpleInterest
{
	int amount,rate,time;
	SimpleInterest(int p,int r,int t)
	{
		amount=p;
		rate=r;
		time=t;
	}
	void calculateSimpleInterest()
	{
		System.out.println("Simple Interest:"+(amount*rate*time)/100);
	}
}
class CompoundInterest
{
	int amount,rate,time,c=0;
	CompoundInterest(int p,int r,int t)
	{
		amount=p;
		rate=r;
		time=t;
	}
	void calculateCompoundInterest()
	{
		System.out.println("Compound Interest:"+amount*(Math.pow((1 + rate / 100), time)));
	}
}
public class Compound
{
	static
	{
		int p,r,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		p=sc.nextInt();
		System.out.println("enter rate of interest");
		r=sc.nextInt();
		System.out.println("enter time");
		t=sc.nextInt();
		SimpleInterest a=new SimpleInterest(p,r,t);
		a.calculateSimpleInterest();
		CompoundInterest b=new CompoundInterest(p,r,t);
		b.calculateCompoundInterest();
	}
	public static void main(String arg[])
	{
		
	}
}