package com.tnsif.collectionEx;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo  {
	
	void display(LinkedList<String> list) {
		
		ListIterator<String> it=list.listIterator();
		
		while(it.hasNext())
		{
			System.out.println("Player name is:"+it.next());
		}

		}

	
void display1(LinkedList<String> list1) {
		
		ListIterator<String> it1=list1.listIterator();
		
		while(it1.hasPrevious())
		{
			System.out.println("Player name is:"+it1.previous());
		}

		}
		
		// TODO Auto-generated method stub

	}


