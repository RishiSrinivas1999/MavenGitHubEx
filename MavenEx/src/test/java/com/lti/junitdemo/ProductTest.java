package com.lti.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Product;

class ProductTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void pname()
	{
		Product p =new Product(101,"mobile",3000);
		Assertions.assertEquals("DMART", p.getCompanyName());
	}

}
