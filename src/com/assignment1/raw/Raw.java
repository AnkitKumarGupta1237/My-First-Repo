package com.assignment1.raw;
import com.assignment1.output.*;
public class Raw 
{
	public static void RawTax(String itemName,double itemPrice,int quantity)
	{
		double tax = 0.125 * itemPrice * quantity;
		double totalPrice = itemPrice * quantity + tax;
		Output.PrintOutput(itemName, quantity, itemPrice, tax, totalPrice);
	}
}
