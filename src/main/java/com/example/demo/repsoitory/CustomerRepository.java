package com.example.demo.repsoitory;

import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findByEmail(String email);

    @Modifying
    @Query("update Customer set email= :email where id= :id")
    void updateCustomerEmailById(@Param("id") Integer id, @Param("email") String email);

}
