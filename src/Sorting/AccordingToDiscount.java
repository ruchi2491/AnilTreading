package Sorting;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import Factory.ProductFactory;
import Pojo.Product;

public class AccordingToDiscount {

	public static void discountAbove(){
		
		ProductFactory pt=new ProductFactory();
		HashMap<?, Product> hsortId=pt.getMap();
		
		
		List<Product> list=new LinkedList<Product>(hsortId.values()); 
		List<Product> list1=new LinkedList<Product>();
			int x;
		for(Product p:list)
		{
			double y=p.getPrice();
			
			if(y>4000)
			{
				 y=y-((0.2)*y);
				x= (int) Math.round(y);
				 p.setPrice(x);
				 list1.add(p);
			}
			
		}
		
		list1.forEach((i)->System.out.println(i));
		//list.forEach(if(p.getPrice()>4000)-> p.getPrice()-(4000/10));
		
		
	}
	
	public static void discountBelow(){
		
		ProductFactory pt=new ProductFactory();
		HashMap<?, Product> hsortId=pt.getMap();
		
		
		List<Product> list=new LinkedList<Product>(hsortId.values()); 
		List<Product> list1=new LinkedList<Product>();
			int x;
		for(Product p:list)
		{
			double y=p.getPrice();
			
			if(y<4000)
			{
				 y=y-((0.1)*y);
				x= (int) Math.round(y);
				 p.setPrice(x);
				 list1.add(p);
			}
			
		}
		
		list1.forEach((i)->System.out.println(i));
		
		
		
	}
	
}
