package com.mycatw.demorest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("mycats")
public class CatResource {

	
	@GET
	@Produces(MediaType.APPLICATION_XML)
public Cat getCat(){
		
		System.out.println("getCat method calles!!");
	Cat c=new Cat();
	c.setName("Adaykshaka");
	c.setPoints(100);
	return c;
}
	
}
