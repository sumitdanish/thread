package com.mymap.test;

public class MyMapImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMap map = new MyMap();
		map.put("1",1);
		map.put("2",2);
		map.put("3",3);
		map.put("4",4);
		map.put("5",5);
		
		System.out.println(map.get("5").getVal());
	}

}
