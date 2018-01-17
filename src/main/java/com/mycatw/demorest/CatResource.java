package com.mycatw.demorest;

import java.util.Arrays;

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
	@Path("cat/100")
	@Produces(MediaType.APPLICATION_XML)

	public Cat getCat1() {
		System.out.println("inside /100");
		return d1.getCat("ChinChin");
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
