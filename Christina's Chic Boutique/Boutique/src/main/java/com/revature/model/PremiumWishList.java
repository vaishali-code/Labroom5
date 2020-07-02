/*
 * Mariah Thomas
 * Md Abul Kashem
 * Sintayehu Mekonnen
 * Shahana Shamim
 */

package com.revature.model;

import java.util.Date;

public class PremiumWishList {
	
	private int number_object;
	private String name_of_owner;
	private Date date_of_creation;
	private String name_of_wish_list;
	
	public PremiumWishList() {
		this.number_object = 0;
		this.name_of_owner = "";
		this.date_of_creation = new Date();
		this.name_of_wish_list = "";
	}
	
	public PremiumWishList(String owner_name, String list_name) {
		this.number_object = 0;
		this.name_of_owner = owner_name;
		this.date_of_creation = new Date();
		this.name_of_wish_list = list_name;
	}

	public int getNumber_object() {
		return number_object;
	}

	public void setNumber_object(int number_object) {
		this.number_object = number_object;
	}

	public String getName_of_owner() {
		return name_of_owner;
	}

	public void setName_of_owner(String name_of_owner) {
		this.name_of_owner = name_of_owner;
	}

	public String getName_of_wish_list() {
		return name_of_wish_list;
	}

	public void setName_of_wish_list(String name_of_wish_list) {
		this.name_of_wish_list = name_of_wish_list;
	}

	public Date getDate_of_creation() {
		return date_of_creation;
	}
	
	public void removeItem() {
		
	}
	
	public void copyList() {
		
	}
	
//	public static void main(String...args) {
//		PremiumWishList list = new PremiumWishList();
//		
//		PremiumWishList list2 = new PremiumWishList("Mariah Thomas", "First List");
//		
//		list2.setNumber_object(5);
//		System.out.println(list2.getName_of_wish_list() + "\n" + list2.name_of_owner + "\n" + list2.getNumber_object() + "\n" + list2.getDate_of_creation());
//		
//		list.setName_of_owner("Sintayehu Mekonnen");
//		list.setName_of_wish_list("My Favorite List");
//		list.setNumber_object(2);
//		
//		System.out.println(list.getName_of_wish_list() + "\n" + list.name_of_owner + "\n" + list.getNumber_object() + "\n" + list.getDate_of_creation());
//	}

	
	
}
