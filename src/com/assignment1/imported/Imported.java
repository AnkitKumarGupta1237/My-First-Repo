package com.assignment1.imported;
import com.assignment1.output.*;
public class Imported 
{
	public static void ImportedTax(String itemName,double itemPrice,int quantity)
	{
		double tax = 0.1 * itemPrice * quantity;
		double finalCost = tax + itemPrice * quantity;
		double totalPrice;
		if (finalCost <= 100) {
			totalPrice = 5 + finalCost;
		} else if (finalCost <= 200) {
			totalPrice = 10 + finalCost;
		} else {
			totalPrice = 0.05 * finalCost + finalCost;
		}
		Output.PrintOutput(itemName,quantity,itemPrice,tax,totalPrice);
	}
}
