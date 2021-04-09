package com.assignment1.output;

public class Output 
{
	public static void PrintOutput(String itemName,int quantity,double itemPrice,double tax,double totalPrice)
	{
		System.out.println("#######################");
		System.out.println(" Item name is:-" + itemName);
		System.out.println(" Number of item is:-" + quantity);
		System.out.println(" Item price is:-Rs"+ itemPrice);
		System.out.println(" Sales tax is :-Rs" + tax);
		System.out.println(" Final price is:-Rs" + totalPrice);
	}
}
