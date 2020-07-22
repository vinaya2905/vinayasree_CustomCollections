package com.epam.CustomCollections;

import java.util.Arrays;

public class CustomCollection<E> {
	private Object[] obj;
	private static int capacity=10;
	private int size=0;
	public CustomCollection() {
		// TODO Auto-generated constructor stub
		this(10);
	}
	public CustomCollection(int cap) {
		if(cap>0)
			obj=new Object[cap];
		else if(capacity==0)
			obj=new Object[capacity];
		else
			throw new IllegalArgumentException("Invalid capacity:"+cap);
	}
	public void add(E e) {
		checkcapacity();
		obj[size++]=e;
	}
	public void checkcapacity() {
		// TODO Auto-generated method stub
		if(obj.length<=size) {
			int oldval=obj.length;
			int newval=oldval*2;
			obj=Arrays.copyOf(obj, newval);
		}
		
	}
	public E get(int idx) {
		if(idx>=size) {
			throw new ArrayIndexOutOfBoundsException(idx);
		}
		return(E)obj[idx];
	}
	public E remove(int idx) {
		if(idx>=size-1) {
			throw new ArrayIndexOutOfBoundsException(idx);
		}
		E oldvalue=(E)obj[idx];
		int numMoved=size-idx-1;
		if(numMoved>0)
			System.arraycopy(obj,idx+1, obj, idx, numMoved);
		obj[--size]=null;
		return oldvalue;
	}
	public void print() {
		for(int i=0;i<=obj.length-1;i++) {
			System.out.println(obj[i]);
		}
	}

}
