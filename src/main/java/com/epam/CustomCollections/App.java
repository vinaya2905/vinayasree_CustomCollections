package com.epam.CustomCollections;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	CustomCollection<String> list=new CustomCollection<String>(11);
    	Scanner sc=new Scanner(System.in);
    	int index=sc.nextInt();
    	System.out.println("ADD COMPANIES TO THE LIST");
    		list.add("Google");
    		list.add("Epam");
    		list.add("Wipro");
    		list.add("Amazon");
    		list.add("Adobe");
    		list.add("Accenture");
    		list.add("Facebook");
    		list.add("Infosys");
    		list.add("TCS");
    		System.out.println("PRINTING THE LIST");
    		list.print();
    		System.out.println("REMOVED COMPANY IS : "+list.remove(2));
    		//System.out.println(list.print());
    		System.out.println("FETCHING THE COMPANY AT GIVEN INDEX");
    		System.out.println(list.get(index));
    	
    }
}
