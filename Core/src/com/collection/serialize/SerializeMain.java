package com.collection.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeMain {

	public static void main(String[] args){
		try{
			Employee em  = new Employee("sumit","lname");
			SerializeMain se = new SerializeMain();
			se.serilaizeMe(em);
			se.deserialize();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void serilaizeMe(Employee me){
		try{
			FileOutputStream f = new FileOutputStream(new File("./emp.txt"));
			ObjectOutputStream os = new ObjectOutputStream(f);
			os.writeObject(me);
			os.close();
			f.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	
	public void deserialize(){
		try{
			FileInputStream fin = new FileInputStream(new File("./emp.txt"));
			ObjectInputStream oin = new ObjectInputStream(fin);
			Employee em = (Employee) oin.readObject();
			System.out.println(em.getFname()+" : "+em.getLname());
			oin.close();
			fin.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	
	
}
