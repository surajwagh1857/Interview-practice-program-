package com.BasicProgram2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.probles.java8.Product;

public class ListOfProduct {
public static void main(String[] args) {
	Product p1 = new Product("RichDAD","Books",300);
	Product p2 = new Product("Car","Toy",250);
	Product p3 = new Product("soap","Baby",90);
	Product p5 = new Product("phone","Toy",240);
	Product p4 = new Product("Panipat","Books",450);
	Product p6 = new Product("Dhananjay","Books",600);
	Product p7 = new Product("powder","Baby",600);
	
	List <Product>list=Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
	
	List<Product>book_list=list.stream().filter(a->a.getCategory()=="Books").collect(Collectors.toList());
	System.out.println("List of Books---->"+book_list);
	
	List <Product>discount=list.stream().filter(a->a.getCategory()=="Books").map(a->{a.setPrice(a.getPrice()-a.getPrice()/10);return a;}).collect(Collectors.toList());

System.out.println("List of Discounted Books---->"+discount);

Product min_price=list.stream().min(Comparator.comparingInt(Product::getPrice)).get();

System.out.println("Min price product-->"+min_price);

Product max_price=list.stream().max(Comparator.comparingInt(Product::getPrice)).get();
System.out.println("max price product-->"+max_price);

}
}
