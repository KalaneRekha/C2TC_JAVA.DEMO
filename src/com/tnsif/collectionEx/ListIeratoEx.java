package com.tnsif.collectionEx;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIeratoEx {

			
			public static void main(String[] args) {
			 List<String> list = new ArrayList<String>();
		  
		        
		        list.add("hello");
		        list.add("ok");
		        list.add("bye");
		  
		        ListIterator<String> itr= list.listIterator(list.size());
		  
		        while (itr.hasPrevious()) 
		        {
		            
		            System.out.println(itr.previous());
		        }
		  
		        
			}
		}

