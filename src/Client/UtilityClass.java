package Client;

import java.util.Scanner;

import Sorting.AccordingToDiscount;
import Sorting.AccordingToID;
import Sorting.AccordingToName;
import Sorting.AccordingToPrice;
import Sorting.AccordingToPriceRange;
import Sorting.AccordingToSelectedBrand;


public class UtilityClass {
	
	public static void execute()
	{
	System.out.println("Enter your choice");
	
	System.out.println("1.Sort the products based on productID.");

	System.out.println("2. Sort the products in Alphabetic Order.");
	
	System.out.println("3. Sort the products based on user selected brand.");
	
	System.out.println("4. Sort the products based on price in ascending order");
	
	System.out.println("5. Should be able to filter the products based on the price range of the products,");
	
	System.out.println("6. Should be able to provide a discount of 20% on the products above 4000.(using lambda)");
	
	System.out.println("7. Should be able to provide a discount of 10% on the products below 4000.(using lambda)");
	
	
	
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int option=Integer.parseInt(str);

	switch (option) {
	case 1:
		AccordingToID.getSortedIDList();
		break;
	case 2:
		AccordingToName.getSortedName();
		break;
	case 3:
		AccordingToSelectedBrand.getSortedSelectedBrandName();
		break;
	case 4:
		AccordingToPrice.getSortedPrice();
		break;
	case 5:
		AccordingToPriceRange.getSortedPrice();
		break;
	case 6:
		AccordingToDiscount.discountAbove();
		break;
	case 7:
		AccordingToDiscount.discountBelow();
		break;
	default:
		break;
	}
	}
}
