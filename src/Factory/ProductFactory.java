package Factory;

import java.util.HashMap;
import java.util.Map;

import Pojo.Product;

public class ProductFactory {
	
	public HashMap getMap(){
		

	HashMap<Integer, Product> hmap=new HashMap<>();
	
	Product p1=new Product(1,"t-shirt",500,"Nike","It is a t-shirt of nike","Amar Factory",20,"nice product");
	Product p2=new Product(2,"t-shirt",1500," U.S.POLO","It is a t-shirt of U.S.POLO","Abhijit Factory",1,"nice product");
	Product p3=new Product(3,"t-shirt",2000,"Indigo Nation","It is a t-shirt of Indigo Nation","bharati Factory",12,"nice product");
	Product p4=new Product(4,"t-shirt",540,"ZARA","It is a t-shirt of ZARA","snehal Factory",5,"nice product");
	
	Product p5=new Product(5,"shirt",350,"U.S.POLO","It is a shirt of U.S.POLO","Amar Factory",5,"nice product");
	Product p6=new Product(6,"shirt",1355,"Indigo Nation","It is a shirt of Indigo Nation","Abhijit Factory",3,"nice product");
	Product p7=new Product(7,"shirt",2300,"ZARA","It is a shirt of ZARA","bharati Factory",6,"nice product");
	Product p8=new Product(8,"shirt",1000,"Nike","It is a shirt of nike","snehal Factory",8,"nice product");
	
	Product p9=new Product(9,"trouser",2500,"Nike","It is a shirt of nike","Amar Factory",20,"nice product");
	Product p10=new Product(10,"trouser",1500,"U.S.POLO","It is a shirt of U.S.POLO","bharati Factory",10,"nice product");
	Product p11=new Product(11,"trouser",1350,"Indigo Nation","It is a t-shirt of Indigo Nation","abhijit Factory",11,"nice product");
	Product p12=new Product(12,"trouser",700,"ZARA","It is a t-shirt of ZARA","snehal Factory",13,"nice product");
	
	
	Product p13=new Product(13,"Jacket",600,"Nike","It is a t-shirt of nike","Amar Factory",20,"nice product");
	Product p14=new Product(14,"Jacket",100,"U.S.POLO","It is a t-shirt of U.S.POLO","bharati Factory",20,"nice product");
	Product p15=new Product(15,"Jacket",200,"Indigo Nation","It is a t-shirt of Indigo Nation","abhijit Factory",20,"nice product");
	Product p16=new Product(16,"Jacket",5000,"ZARA","It is a t-shirt of ZARA","Amar Factory",20,"snehal product");
	
	
	Product p17=new Product(17,"Shoes",4000,"Nike","It is a t-shirt of nike","Amar Factory",20,"nice product");
	Product p18=new Product(18,"Shoes",8000,"U.S.POLO","It is a t-shirt of U.S.POLO","bharati Factory",20,"nice product");
	Product p19=new Product(19,"Shoes",1600,"Indigo Nation","It is a t-shirt of Indigo Nation","abhijit Factory",20,"nice product");
	Product p20=new Product(20,"Shoes",2400,"ZARA","It is a t-shirt of ZARA","Amar Factory",20,"snehal product");
	
	
	
	hmap.put(p1.getProductId(), p1);
	hmap.put(p2.getProductId(), p2);
	hmap.put(p3.getProductId(), p3);
	hmap.put(p4.getProductId(), p4);
	hmap.put(p5.getProductId(), p5);
	hmap.put(p6.getProductId(), p6);
	hmap.put(p7.getProductId(), p7);
	hmap.put(p8.getProductId(), p8);
	hmap.put(p9.getProductId(), p9);
	hmap.put(p10.getProductId(), p10);
	hmap.put(p11.getProductId(), p11);
	hmap.put(p12.getProductId(), p12);
	hmap.put(p13.getProductId(), p13);
	hmap.put(p14.getProductId(), p14);
	hmap.put(p15.getProductId(), p15);
	hmap.put(p16.getProductId(), p16);
	hmap.put(p17.getProductId(), p17);
	hmap.put(p18.getProductId(), p18);
	hmap.put(p19.getProductId(), p19);
	hmap.put(p20.getProductId(), p20);
	
	return hmap;
	//hmap.forEach((i)->System.out.Println(i));
	
	}
	
}
