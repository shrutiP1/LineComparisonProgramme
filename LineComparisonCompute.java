package com.bridegelabz.linecomparison;

public class LineComparisonCompute 
{
	static int x1=10;
	static int x2=40;
	static int y1=30;
	static int y2=40;
	int length1=0;
	int length2=0;
	public void calLengthUC1()
	{
		System.out.println("UC1 output:");
		double length=0;
		length=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1), 2));
		System.out.println("Length : "+length);
	}
	public void checkEqualUC2()
	{
		System.out.println("UC2 output:");
		 length1=x2-x1;
		 length2=y2-y1;
		 
		 if(length1==length2)
		 {
			 System.out.println("two lines are equal");
		 }
		 else
		 {
			 System.out.println("Two lines are not equal");
		 }
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to Comparison Computation Program ");
		//UC1
		LineComparisonCompute l1=new LineComparisonCompute();
		l1.calLengthUC1();
		//UC2
		l1.checkEqualUC2();
		
	}

}
