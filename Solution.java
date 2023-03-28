package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {

	public static void main(String[] args) {
ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("com/NewFile.xml");
Customer c2=(Customer)c1.getBean("customer");
System.out.println(c2);

	}

}
