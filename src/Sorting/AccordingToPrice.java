package Sorting;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import Factory.ProductFactory;
import Pojo.Product;

public class AccordingToPrice {
public static List<Product> getSortedPrice() {
					
		

	ProductFactory pt=new ProductFactory();
	HashMap<?, Product> hsortId=pt.getMap();
	
	
	List<Product> list=new LinkedList<Product>(hsortId.values()); 
		
		
	Collections.sort(list,(o1,o2)->o1.getPrice()-o2.getPrice());
	
	
	list.forEach((i)->System.out.println(i));
	return list;
	}
}
