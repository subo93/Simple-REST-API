package com.mycatw.demorest;

import java.util.Arrays;

//import javax.websocket.server.PathParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("mycats")
public class CatResource {
	
	CatsDA d1 = new CatsDA();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Cat> getCats() {
		System.out.println("inside mycats PAth started!");

		System.out.println("getCat method calles!!");

		return d1.getCats();

	}

	@GET
	@Path("cat/{value}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Cat getCat1(@PathParam("value")int id) {
		
		System.out.println("inside /100");
		System.out.println("id value is "+id);
		System.out.println("after value");
		return d1.getCat(id);
	}

	@POST
	@Path("cat")
	public Cat createCat(Cat c3) {

		System.out.println("createCat started!");
		System.out.println("New CAt!1!    " + c3);
		d1.create(c3);
		return c3;
	}

}
