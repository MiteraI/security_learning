package srsec.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import srsec.entity.Account;
import srsec.entity.Admin;
import srsec.entity.entityenums.Role;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdminRepositoryTest {
    @Autowired
    private AdminRepository adminRepository;

    @Test public void createAdmin() {
        Account account = Account.builder()
                .userName("a")
                .password("a")
                .role(Role.ADMIN)
                .build();
        Admin admin = Admin.builder()
                .salary(100)
                .level(2)
                .build();
        adminRepository.save(admin);
    }
}