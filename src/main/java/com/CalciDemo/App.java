package com.CalciDemo;


public class App 
{
	
	
	public int add(int num1, int num2) 
	{
		return num1+num2;
		
	}
	public int multiply(int num1, int num2) 
	{
		return num1*num2;
		
	}
    public static void main( String[] args )
    {
        int result = 0;
        
        App obj = new App();
        result = obj.add(12, 20);
        System.out.println(result);
        result = obj.multiply(10, 2);
        System.out.println(result);
        
        		
    }
}
