package com.mycatw.demorest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatsDA {

	List<Cat> cc;

	public CatsDA() {
		cc = new ArrayList<>();

		Cat c1 = new Cat();
		c1.setName("aa");
		c1.setPoints(11);

		Cat c2 = new Cat();
		c2.setName("bb");
		c2.setPoints(12);

		cc.add(c1);
		cc.add(c2);
		List<Cat> cats = Arrays.asList(c1, c2);

	}

	public List<Cat> getCats() {
		return cc;
	}

	public Cat getCat(int id) {
		
			
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

	/*
	public Cat getCat1(String a) {
		// TODO Auto-generated method stub
		
		Cat c4 = null;
		return  c4;
	}
	*/
	

}
