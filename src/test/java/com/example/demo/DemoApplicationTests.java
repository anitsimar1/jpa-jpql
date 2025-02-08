package com.example.demo;

import com.example.demo.entity.Address;
import com.example.demo.entity.Customer;
import com.example.demo.repsoitory.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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

		Address address = new Address();
		address.setCity("New Delhi");
		address.setCountry("India");
		address.setState("Delhi");
		address.setZipcode("110018");

		customer.setAddress(address);
		customerRepository.save(customer);

		Customer customer2 = new Customer();
		customer2.setName("Gojo Satoru");

		Address address2 = new Address();
		address2.setCity("Shinjuku City");
		address2.setCountry("Japan");
		address2.setState("Tokyo");
		address2.setZipcode("163-8001");

		customer2.setAddress(address2);

		customerRepository.save(customer2);
	}

	@Test
	void read(){
		List<Customer> all = customerRepository.findAll();
		all.forEach(System.out::println);
	}

	@Test
	void update(){
		Customer customer = customerRepository.findByNameLike("%Amrit%");
		customer.setName("Amrit Singh");
		customerRepository.save(customer);
	}

	@Test
	void delete(){
		customerRepository.deleteById(1);
	}

	@Test
	void deleteAll(){
		customerRepository.deleteAll();
	}
}
