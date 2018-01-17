package com.mycatw.demorest;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
//import javax.xml.blind.annotation.XmlRootElemant;

@XmlRootElement
public class Cat {
	private String name;
	private int points;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getId() {
		return this.points;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", points=" + points + "]";
	}

}
