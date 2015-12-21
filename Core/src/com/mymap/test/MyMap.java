package com.mymap.test;

public class MyMap {

	public final int MAX = 16;
	MyMapS[] m = new MyMapS[MAX];
	class MyMapS
	{
		public int val;
		final String key;
		MyMapS next;
		public MyMapS(int val, String key) {
			super();
			this.val = val;
			this.key = key;
		}
		public int getVal() {
			return val;
		}
		public void setVal(int val) {
			this.val = val;
		}
		public MyMapS getNext() {
			return next;
		}
		public void setNext(MyMapS next) {
			this.next = next;
		}
		public String getKey() {
			return key;
		}
	}
	
	
	public void put(String key,Integer val){
		int size = key.hashCode() % MAX;
		MyMapS mp = m[size];
		if(mp == null){
			mp = new MyMapS(val, key);
			m[size] = mp;
		}else{
			if(mp != null){
				if(mp.key.equals(key)){
					mp.val = val;
				}else{
					while(mp != null){
						mp = mp.next;
					}
					MyMapS mp1 = new MyMapS(val, key);
					mp1.next = mp;
				}
			}
		}
	}

	public MyMapS get(String key){
		int size = key.hashCode() % MAX;
		MyMapS m1 = m[size];
		while(m1 != null){
			if(m1.key.equals(key)){
				return m1;
			}
		}
		return null;
		
	}
	
	
}
