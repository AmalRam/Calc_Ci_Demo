package com.CalciDemo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;



public class AppTest 
    
{
   
   int res =0;
   App calc =new App();
   
   @Test
   public void addTest()
   {
	   res= calc.add(2, 5);
	   
	   assertEquals(5, res);
	   
   }
     @Test
   public void mulTest()
   {
	   res= calc.multiply(2, 3);
	   
	   assertEquals(6, res);
   }
}
