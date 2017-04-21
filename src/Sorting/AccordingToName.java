package Sorting;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import Factory.ProductFactory;
import Pojo.Product;

public class AccordingToName {

public static List<Product> getSortedName() {
					
		
	ProductFactory pt=new ProductFactory();
	HashMap<?, Product> hsortId=pt.getMap();
	
	
	List<Product> list=new LinkedList<Product>(hsortId.values()); 
		
		
	Collections.sort(list,(o1,o2)->o1.getName().compareTo(o2.getName()));
	
	
	list.forEach((i)->System.out.println(i));
	return list;
	}
}
