package com;

import org.springframework.stereotype.Component;

@Component
public class Vehicle2  implements vehicle{
	public void start() {
		System.out.println("vehicle2 is started");
		
	}
	public void stop() {
		System.out.println("vehicle is stoped");
	}

}
