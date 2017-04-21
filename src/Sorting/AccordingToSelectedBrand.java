package Sorting;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Factory.ProductFactory;
import Pojo.Product;

public class AccordingToSelectedBrand {

public static List<Product>  getSortedSelectedBrandName() {
	
					
	ProductFactory pt=new ProductFactory();
	HashMap<?, Product> hsortId=pt.getMap();
	
	
	
	List<Product> list=new LinkedList<Product>(hsortId.values()); 
		System.out.println("Enter brand");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	
		
	List<Product> list1=new LinkedList<Product>(); 
			
	for(int i=0;i<list.size();i++)
	{
		
		if(list.get(i).getBrand().equals(str))
		{
			list1.add(list.get(i));
		}
		
	}
			
	Collections.sort(list1,(o1,o2)->o1.getName().compareTo(o2.getName()));
	
	list1.forEach((i)->System.out.println(i));
	return list1;
}
}
