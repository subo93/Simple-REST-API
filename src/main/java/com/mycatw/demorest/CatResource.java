package com.mycatw.demorest;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

@Path("mycats")
public class CatResource {

	
	@GET
	@Produces(MediaType.APPLICATION_XML)
public List<Cat> getCat(){
		
		System.out.println("getCat method calles!!");
	Cat c=new Cat();
	c.setName("Adaykshaka");
	c.setPoints(100);
	
	Cat c1=new Cat();
	c1.setName("ChinChin");
	c1.setPoints(200);
	
	
	List<Cat> cats = Arrays.asList(c,c1);
	
	return cats;
}
	
}
