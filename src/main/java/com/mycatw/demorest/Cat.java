package com.mycatw.demorest;

import javax.xml.bind.annotation.XmlRootElement;
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


}