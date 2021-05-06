package com.bridegelabz.linecomparison;

public class LineComparisonCompute 
{
	static int x1=10;
	static int x2=40;
	static int y1=30;
	static int y2=40;
	public void calLengthUC1()
	{
		System.out.println("UC1 output:");
		double length=0;
		length=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1), 2));
		System.out.println("Length : "+length);
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to Comparison Computation Program ");
		//UC1
		LineComparisonCompute l1=new LineComparisonCompute();
		l1.calLengthUC1();
	}

}
