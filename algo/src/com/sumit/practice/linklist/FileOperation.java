package com.sumit.practice.linklist;

import java.io.File;
import java.util.Scanner;

public class FileOperation {

	
	public FileOperation() {
		// TODO Auto-generated constructor stub
	}
	
	public String[] getFileData(String fileName){
		
		try{
			String s = null;
			Scanner sc = new Scanner(new File(fileName));
			while(sc.hasNext()){
				s = sc.next();
			}
			return s.split(",");
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}
	
}
