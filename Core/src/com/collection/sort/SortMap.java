package com.collection.sort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"sumit");
		map.put(12,"Abhi");
		map.put(19,"Rahu");
		map.put(5,"Ketu");
		map.put(2,"mangal");
		Map<Integer,String> sortedMapByKey = new TreeMap<Integer, String>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		sortedMapByKey.putAll(map);
		for(Map.Entry e : sortedMapByKey.entrySet()){
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}

}
