package com.example.demo;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

public class JavaDemoApplication
{
	private static final Logger LOGGER = LoggerFactory.getLogger(JavaDemoApplication.class);
	public static void main(String args[])
	{
		SpringApplication.run(JavaDemoApplication.class,args);
		Scanner sc = new Scanner(System.in);
		
		LOGGER.trace("doStuff needed more information - {}");
	       LOGGER.debug("doStuff needed to debug - {}");
	       LOGGER.info("doStuff took input - {}");
	       LOGGER.warn("doStuff needed to warn - {}");
	       LOGGER.error("doStuff encountered an error with value - {}");
	       System.out.println("Adding logger");
	       
		TreeSet<Emp> nameCompare = new TreeSet<Emp> (new NameCompare());
		nameCompare.add(new Emp("Roy",2000));
		nameCompare.add(new Emp("Chris",10000));
		nameCompare.add(new Emp("John",5000));
		nameCompare.add(new Emp("Tom",7500));
		nameCompare.add(new Emp("Kate",3000));
		nameCompare.add(new Emp("Hailey",1000));
		nameCompare.add(new Emp("Anne",5300));
		nameCompare.add(new Emp("Jade",1000));
		nameCompare.add(new Emp("Aron",11000));
		nameCompare.add(new Emp("Zack",9000));
		nameCompare.add(new Emp("Zee",2000));
		nameCompare.add(new Emp("Zoe",1500));
		for(Emp e:nameCompare)
		{
			System.out.println(e);
		}
	}
}

class NameCompare implements Comparator<Emp>{
 
    public int compare(Emp e1, Emp e2) {
        return e1.getName().compareTo(e2.getName());
    }
} 

class Emp{
     
     String name;
     int salary;
     
    public Emp(String n, int s){
        this.name = n;
        this.salary = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return "Name:- "+this.name+" -> Salary:- "+this.salary;
    }
}