package com.mycatw.demorest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatsDA {

	List<Cat> cc;

	public CatsDA() {
		cc = new ArrayList<>();

		Cat c1 = new Cat();
		c1.setName("Adaykshaka");
		c1.setPoints(100);

		Cat c2 = new Cat();
		c2.setName("ChinChin");
		c2.setPoints(200);

		cc.add(c1);
		cc.add(c2);
		List<Cat> cats = Arrays.asList(c1, c2);

	}

	public List<Cat> getCats() {
		return cc;
	}

	public Cat getCat(String id) {
		
			
		for (Cat c : cc) {
			if (c.getId() == id)
				return c;
		                 }		
		return new Cat();
	}

	public void create(Cat c3) {
		// TODO Auto-generated method stub
		cc.add(c3);
	}

}
