package srsec.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import srsec.entity.Account;
import srsec.entity.Customer;
import srsec.entity.entityenums.Role;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerRepositoryTest {
    @Autowired
    private CustomerRepository customerRepository;

    @Test public void addCustomer() {
        Account account = Account.builder()
                .userName("c")
                .password("c")
                .role(Role.CUSTOMER)
                .build();
        Customer customer = Customer.builder()
                .name("Home")
                .account(account)
                .build();
        customerRepository.save(customer);
    }

    @Test public void printAll() {
        System.out.println("All customer: " + customerRepository.findAll());
    }
}