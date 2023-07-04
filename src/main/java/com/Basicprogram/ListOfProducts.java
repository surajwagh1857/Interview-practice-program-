package com.Basicprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.probles.java8.Product;

public class ListOfProducts {
public static void main(String[] args) {
	Product p1 = new Product("RichDAD","Books",300);
	Product p2 = new Product("Car","Toy",250);
	Product p3 = new Product("soap","Baby",90);
	Product p5 = new Product("phone","Toy",240);
	Product p4 = new Product("Panipat","Books",450);
	Product p6 = new Product("Dhananjay","Books",600);
	Product p7 = new Product("powder","Baby",600);
	
	List<Product> list=Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
	List listOfBooks=list.stream().filter(a->a.getCategory()=="Books"&& a.getPrice()<500).collect(Collectors.toList());
	System.out.println(listOfBooks);
	
	List baby=list.stream().filter(a->a.getCategory()=="Baby").collect(Collectors.toList());
	System.out.println(baby);
	
	//giving discount to toys
List disc_Product=list.stream().filter(a->a.getCategory()=="Toy").map(a->{a.setPrice(a.getPrice()-a.getPrice()/10);return a ;}).collect(Collectors.toList());
	System.out.println(disc_Product);
	
	Product min_price_prod=list.stream().min(Comparator.comparingInt(Product::getPrice)).get();
	System.out.println(min_price_prod);
	
	
	
	
	
	
	
	
	
}
}
