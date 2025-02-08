package com.example.demo.repsoitory;

import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findByNameLike(String name);

    Customer findByEmailAndName(String email, String name);

    Customer findByEmailLike(String email);

    Customer findByIdIn(List<Integer> ids);

}
