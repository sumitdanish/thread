package com.collection.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;



public class SortMapByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"S");
		map.put(12,"A");
		map.put(19,"R");
		map.put(5,"K");
		map.put(2,"M");
		List<Map.Entry<Integer,String>> list = new LinkedList<Map.Entry<Integer,String>>(map.entrySet());
		Map<Integer,String>  sorteMap = new HashMap<Integer, String>();
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1,
					Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		for(Map.Entry<Integer, String> l1 : list){
			sorteMap.put(l1.getKey(), l1.getValue());
		}
		System.out.println("Map After Sorting ........");
		for(Map.Entry<Integer, String> m : sorteMap.entrySet()){
			System.out.println(m.getKey()+" > "+m.getValue());
		}
		
	}

}
