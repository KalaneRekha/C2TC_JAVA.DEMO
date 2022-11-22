package com.tnsif.collectionEx;

import java.util.LinkedList;

public class LinkedList2 {

			
			public static void main(String[]args) {
				
				LinkedList<String> player=new LinkedList<String>();
				
				player.add("Dhoni");
				player.add("Virat");
				player.add("Rohit");
				player.add("Yuvraj");
				player.add("Surya");
				
				System.out.println(player);
				
				System.out.println(player.remove());
				System.out.println(player.remove());
				
				System.out.println(player);
				player.add("Hardik");
				System.out.println(player);
				
				player.addFirst("Sachin");
				player.addLast("KL");
				System.out.println(player);
				
				player.add(2, "Bumrahhhhhhh");
				System.out.println(player);
				
				//modify
				player.set(2, "Bumrah");
				System.out.println(player);
				
				
				System.out.println(player.indexOf("Hardik"));
				
				
				
				
	
				
				
			}

	

	}


