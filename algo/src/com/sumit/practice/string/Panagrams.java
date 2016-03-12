package com.sumit.practice.string;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;
public class Panagrams {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try
	{
	    Scanner in = new Scanner(System.in);
	    String line = in.nextLine();
	    Panagrams p = new Panagrams();
	    if(p.isPanagram(line)) 
	    {
		System.out.println("pangram");
	    }
	    else
	    {
		System.out.println("not pangram");
	    }
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
    }
    
    private HashMap<Character,Character>  storeChar(String s)
    {
	try
	{
	    s=s.toUpperCase();
	    HashMap<Character,Character> map = new HashMap<Character, Character>();
	    for(int i=0;i<s.length();i++)
	    {
		if(s.charAt(i)!=' ')
		{
        		if(map.containsKey(s.charAt(i))==false) 
        		{
        		    map.put(s.charAt(i),s.charAt(i));
        		}
		}
	    }
	    return map;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return null;
    }

    private boolean isPanagram(String s)
    {
	try
	{
	    HashMap<Character,Character> map = storeChar(s);
	    boolean flag=false;
	    for(char c='A';c<='Z';c++)
	    {
		if(map.containsKey(c))
		{
		   flag=true;
		}
		else
		{
		   flag=false;
		   break;
		}
	    }
	    return flag;
	}
	catch(Exception ex)
	{
	    ex.printStackTrace();
	}
	return false;
    }
    
    
}