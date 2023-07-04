package com.probles.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
public class ListOfProduct {
public static void main(String[] args) {
	Product p1 = new Product("RichDAD","Books",300);
	Product p2 = new Product("Car","Toy",250);
	Product p3 = new Product("soap","Baby",90);
	Product p5 = new Product("phone","Toy",240);
	Product p4 = new Product("Panipat","Books",450);
	Product p6 = new Product("Dhananjay","Books",600);
	Product p7 = new Product("powder","Baby",600);
	
	List<Product>list=Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
	//books with condition
	List<Product>books=list.stream().filter(a->a.getCategory()=="Books"&& a.getPrice()<500).collect(Collectors.toList());
	System.out.println(books);
	//baby category
	System.out.println("");
	List <Product>babycatgr=list.stream().filter(a->a.getCategory()=="Baby").collect(Collectors.toList());
	System.out.println(babycatgr);
	System.out.println("");
	
	//product discount by filtering
	List<Product>disc_product=list.stream().filter(a->a.getCategory()=="Toy").map(a->{a.setPrice(a.getPrice()-a.getPrice()/10);return a;}).collect(Collectors.toList());
	System.out.println(disc_product);
	
	Product min_price_prod=list.stream().filter(a->a.getCategory()=="Books").min(Comparator.comparingInt(Product::getPrice)).get();
	System.out.println(min_price_prod);
	System.out.println(">>>>>>>>");
	Map<String,Optional<Product>> map = list.stream().collect(Collectors.groupingBy(Product::getCategory,Collectors.maxBy(Comparator.comparing(Product:: getPrice))));
	System.out.println(map);
	List<Product>skiped_list=list.stream().skip(list.size()-3).collect(Collectors.toList());
System.out.println(skiped_list);
}}