package com.assignment1.manufactured;
import com.assignment1.output.*;
public class Manufactured 
{
	public static void ManufacturedTax(String itemName,double itemPrice,int quantity)
	{
		double tax = (0.125 * itemPrice * quantity) + 0.02 * (itemPrice * quantity + 0.125 * itemPrice * quantity);
		double totalPrice = itemPrice*quantity + tax;
		Output.PrintOutput(itemName,quantity,itemPrice,tax,totalPrice);
	}
}
