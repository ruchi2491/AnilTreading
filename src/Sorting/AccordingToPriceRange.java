package Sorting;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Factory.ProductFactory;
import Pojo.Product;

public class AccordingToPriceRange {
public static List<Product> getSortedPrice() {
						
					
	ProductFactory pt=new ProductFactory();
	HashMap<?, Product> hsortId=pt.getMap();
	
	
	List<Product> list=new LinkedList<Product>(hsortId.values()); 
		
	System.out.println("Enter range");
	
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int value=Integer.parseInt(str);
	
	List<Product> list1=new LinkedList<Product>();
	
	String str2=sc.nextLine();
	int value2=Integer.parseInt(str2);
	
	
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).getPrice()>=value && list.get(i).getPrice()<=value2)
		{
			list1.add(list.get(i));
		}
	}
	
		
	
	list1.forEach((i)->System.out.println(i));
	return list1;
	}
}
