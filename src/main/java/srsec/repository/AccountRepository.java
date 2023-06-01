package srsec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import srsec.entity.Account;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUserName(String userName);
}
