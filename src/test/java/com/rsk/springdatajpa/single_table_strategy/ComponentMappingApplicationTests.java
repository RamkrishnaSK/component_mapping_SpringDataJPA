package com.rsk.springdatajpa.single_table_strategy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rsk.springdatajpa.single_table_strategy.entities.Address;
import com.rsk.springdatajpa.single_table_strategy.entities.Customer;
import com.rsk.springdatajpa.single_table_strategy.repos.CustomerRepository;

@SpringBootTest
class ComponentMappingApplicationTests {
	
	@Autowired
	private CustomerRepository repo; 

	@Test
	public void testInsert() { 
		
		Address addr = new Address();
		addr.setFlat(203);
		addr.setCity("New Delhi");
		addr.setCountry("India"); 
		
		Customer c1 = new Customer();
		c1.setName("Virat Kohli");
		c1.setEmail("viratkohli9090@gmail.com");
		c1.setRating(9.8);
		c1.setMarried(true);
		c1.setAddress(addr);  
		
		repo.save(c1);   
	} 

}
