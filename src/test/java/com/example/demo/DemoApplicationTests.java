package com.example.demo;

import com.example.demo.entity.Customer;
import com.example.demo.repsoitory.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void create(){
		Customer customer = new Customer();
		customer.setName("Amritpal Singh");
		customer.setEmail("abc@gmail.com");
		customerRepository.save(customer);

		Customer customer2 = new Customer();
		customer2.setName("Gojo Satoru");
		customer2.setEmail("jjk@gmail.com");
		customerRepository.save(customer2);

		Customer customer3 = new Customer();
		customer3.setName("Baki Hanma");
		customer3.setEmail("baki%^#Grappler@gmail.com");
		customerRepository.save(customer3);
	}

	@Test
	void findCustomerByEmailAndName(){
		Customer gojoSatoru = customerRepository.findByEmailAndName("jjk@gmail.com", "Gojo Satoru");
		System.out.println(gojoSatoru);
	}

	@Test
	void findCustomerByEmailLike(){
		Customer byEmailLike = customerRepository.findByEmailLike("abc%");
		System.out.println(byEmailLike);
	}

	@Test
	void findCustomerByIdIn(){
		System.out.println(customerRepository.findByIdIn(Arrays.asList(1,2,3,54)));
	}
}
