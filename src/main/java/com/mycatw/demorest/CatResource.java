package com.mycatw.demorest;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

@Path("mycats")
public class CatResource {

	CatsDA d1 = new CatsDA();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Cat> getCat() {

		System.out.println("getCat method calles!!");

		return d1.getCats();

	}
	
	@POST
	@Path("cat")
	public Cat createCat(Cat c3){
	
		System.out.println(c3);
		d1.create(c3);
		return c3;
	}

}
