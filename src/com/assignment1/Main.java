package com.assignment1;

import java.util.Scanner;
import com.assignment1.raw.*;
import com.assignment1.imported.*;
import com.assignment1.manufactured.*;
public class Main
{
	public static void main(String[] args) 
	{
		String itemName;
		String itemType;
		double itemPrice;
		int quantity;
		char c;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("Enter the name of the item");
			itemName = sc.next();
			System.out.print("Enter the price of the item");
			itemPrice = sc.nextDouble();
			System.out.print("Enter the number of quantity");
			quantity = sc.nextInt();
			System.out.print("Enter the type of items");
			itemType = sc.next();
			switch (itemType) 
			{
			case "Raw":Raw.RawTax(itemName,itemPrice,quantity);
				break;
			case "Manufactured":Manufactured.ManufacturedTax(itemName,itemPrice,quantity);
				break;
			case "Imported":Imported.ImportedTax(itemName,itemPrice,quantity);
				break;
			default:break;
			}
			System.out.println("\nDo you want to enter details of any other item");
			c = sc.next().charAt(0);
		}while(c=='y');
		sc.close();
	}	
}
