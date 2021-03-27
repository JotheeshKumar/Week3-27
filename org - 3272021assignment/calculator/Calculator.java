package org.calculator;
public class Calculator {

	public int  add(int a,int b)
	{
		int add = a+b;
		return add;
	}
	public int add(int a,int b,int c)
	{
		int add = a+b+c;
		return add;
	}
	public int  sub(int a,int b)
	{
		int sub = a-b;
		return sub;
	}
	public double sub(double a,double b)
	{
		double sub = a-b;
		return sub;
	}
	public double multi(int a,int b)
	{
		double product = a*b;
		return product;
	}
	public double multi(int a,double b,double c)
	{
		double product = a*b*c;
		return product;
	}
	
	public double div(int a,int b)
	{
		double divide = a/b;
		return divide;
	}
	public double div(int a,double b)
	{
		double divide = a/b;
		return divide;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
	int	twosumdigit=cal.add(15, 65);
	int 	threesumdigit=cal.add(45, 22, 14);
	int	twosubdigit=cal.sub(10, 5);
	double 	threesubdigit=	cal.sub(24.4,2.12);
	double twomuldigit=cal.multi(5, 3);
	double	threemuldigit=cal.multi(2, 33.33,44.44);
	double	twodivdigit=	cal.div(40, 2);
	double threedivsumdigit=	cal.div(2, 40.40);
		
		System.out.println("add a & b: " +twosumdigit);
		System.out.println("add a & b & c: " +threesumdigit);
		System.out.println("sub a & b: " +twosubdigit);
		System.out.println("sub a & b & c: " +threesubdigit);
		System.out.println("mul a & b: " +twomuldigit);
		System.out.println("mul a & b & c: " +threemuldigit);
		System.out.println("div a & b: " +twodivdigit);
		System.out.println("div a & b & c: " +threedivsumdigit);
		
	
	}
}