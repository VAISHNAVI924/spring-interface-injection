package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
@Value("12435")
private int id;
@Value("6278289")
private int name;
@Autowired
@Qualifier("vehicle2")
private vehicle vehicle;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getName() {
	return name;
}
public void setName(int name) {
	this.name = name;
}
public vehicle getVehicle() {
	return vehicle;
}
public void setVehicle(vehicle vehicle) {
	this.vehicle = vehicle;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + "]";
}





}
