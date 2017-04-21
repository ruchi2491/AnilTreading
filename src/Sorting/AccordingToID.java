package Sorting;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import Factory.ProductFactory;
import Pojo.Product;

public class AccordingToID  {

	public static List<Product> getSortedIDList() {
		ProductFactory pt=new ProductFactory();
		HashMap<?, Product> hsortId=pt.getMap();
		
		
		List<Product> list=new LinkedList<Product>(hsortId.values()); 
			
			
		Collections.sort(list,(o1,o2)->o1.getProductId()-o2.getProductId());
		
		list.forEach((i)->System.out.println(i));
		return list;
	}

}
