
		 package com.tnsif.collectionEx;

		import java.util.Collections;
		import java.util.Iterator;
		import java.util.LinkedList;
		import java.util.ListIterator;

		public class ListIterator1{
			
			void display(LinkedList<String> list) {
				
				ListIterator<String> it=list.listIterator();
				
				while(it.hasNext())
				{
					System.out.println("Player name is:"+it.next());
				}

				}
		void display1(LinkedList<String> list1) {
				
				ListIterator<String> it1=list1.listIterator(list1.size());
				
				while(it1.hasPrevious())
				{
					System.out.println("Player name is:"+it1.previous());
				}

				}
			public static void main(String[] args) {
		 
				LinkedList<String> player=new LinkedList<String>();
				
				player.add("Dhoni");
				player.add("Virat");
				player.add("Rohit");
				player.add("Yuvraj");
				player.add("Surya");
				
				System.out.println(player); //[Dhoni, Virat, Rohit, Yuvraj, Surya]

				System.out.println("****");
				System.out.println(player.size());
		        System.out.println(player.contains("Hardik"));
		      
			
		        ListIterator1 im=new ListIterator1()	;
				player.sort(null);
				
				//im.display(player);
				
				System.out.println("****");
				//Collections.reverse(player);
				im.display(player);
				
				
				
				System.out.println("****");
				im.display1(player);



			}

		
		// TODO Auto-generated method stu

	}

