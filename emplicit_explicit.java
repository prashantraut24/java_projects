package com.pack1;

public class emplicit_explicit 
{
	void implicit()
	{
		System.out.println("performing implicit type casting");
		byte b=50;
		int i=b;
		float f=b;
		System.out.println("byte value b :"+b);
		System.out.println("int value i:"+i);
		System.out.println("flaot value f:"+f+"\n");
		
		char c='A';
		int i2=c;
		System.out.println("char value c:"+c);
		System.out.println("int vlaue i2:"+i2);
		
		int i3=100;
		double d=i3;
		System.out.println("int value is"+i3);
		System.out.println("double vlaue is:"+d+"\n");
		
	}
	void explicit()
	{
		System.out.println("performing explicit type casting");
		int i1=10;
		byte b1=(byte)i1;
		System.out.println("int value i1:"+i1);
		System.out.println("byte value b1:"+b1);
		
		int i2=500;
		byte b2=(byte)i2;
		System.out.println("int value i2:"+i2);
		System.out.println("byte value b2:"+b2+"\n");
		
		float f=10.9999f;
		byte b3=(byte)f;
		System.out.println("float value is:"+f);
		System.out.println("byte value:"+b3+"\n");
	}
	void meth1(int x)
	{
		System.out.println("hi");
	}
	void meth2(byte y)
	{
		System.out.println("hello");
	}
	public static void main(String[] args) 
	{
		emplicit_explicit emp=new emplicit_explicit();
		emp.implicit();
		System.out.println("----------------");
		emp.explicit();
		System.out.println("----------------");
		emp.meth1(10);
		emp.meth1((byte)10);
	}
	
}
