package com.mainpackage;

import ADD.Addition;      //import addition
import DIV.Division;      //import division
import EVENODD.EvenOdd;    //import even odd
import MUL.Multiplication;  //import multiplication
import SUB.Substraction;   //import substraction


public class Common{
	
	public static void main(String args[]) {
		Addition add = new Addition();                   //object for addition
		add.Add(2, 3);
		
		Substraction sub = new Substraction();          //object for substraction
		sub.Sub(8, 5);
		
		Multiplication mul = new Multiplication();        //object for multiplication
		mul.Mul(3, 4);
		
		Division div = new Division();                 //object for division
		div.Div(8, 2);
		
		EvenOdd eo = new EvenOdd();                     //object for even odd
		eo.EvOd(5);   
	}

}
