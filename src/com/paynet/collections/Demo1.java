package com.paynet.collections;

import java.util.ArrayList;
import java.util.List;
//collections demo
public class Demo1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> listObj=new ArrayList<String>();
		
//		List<String> listObj=new ArrayList<String>();
		
		listObj.add("red");
		listObj.add("green");
		listObj.add("yellow");
		listObj.add("blue");
		
		System.out.println(listObj.size());
		System.out.println(listObj.get(1));
		
		for(int i=0;i<listObj.size();i++)
		{
			System.out.println(listObj.get(i));
		}
		System.out.println("---------------------");
		for(String col : listObj)
		{
			System.out.println(col);
		}
		System.out.println("---------------------");
		listObj.remove("blue");
		
		listObj.remove(0);
		for(String col : listObj)
		{
			System.out.println(col);
		}
		
		
		
	}

}
