package com.test;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte x = -1; x =(byte) ( x >>> 5 );
		System.out.println(x);
		int a=5,b=7;

		int c= a+=2*3+b--;
		System.out.println(c);
		
		
		
		RoundingMode mode = RoundingMode.CEILING;
		BigDecimal big1 = new BigDecimal(-11);
		BigDecimal big2 = new BigDecimal(2);
		System.out.println(big1.divide(big2, mode)); 
	}

}