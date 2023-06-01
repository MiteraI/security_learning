package srsec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import srsec.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
