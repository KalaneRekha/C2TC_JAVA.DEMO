package com.capgemini.genericsdemo;

import java.util.LinkedList;
import java.util.List;

class Test1<T>
{
	
	private T myvariable;

	public Test1(T myvariable) {
		this.myvariable = myvariable;
	}

	public T getMyvariable() {
		return myvariable;
	}

	@Override
	public String toString() {
		return "Test [myvariable=" + myvariable + "]";
	}
	
	}
class GenericDemo1 {

	public static void main(String[] args) {
		
		List<Test1<Object>> obj=new LinkedList<>();
		
		obj.add(new Test1<Object>("Hello"));
		obj.add(new Test1<Object>("All"));
		obj.add(new Test1<Object>(19));
		obj.add(new Test1<Object>(16.5f));
		obj.add(new Test1<Object>('T'));
		obj.add(new Test1<Object>(12.66));
		
		
		System.out.println(obj);
	}
}