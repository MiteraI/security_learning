package srsec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import srsec.entity.Account;
import srsec.repository.AccountRepository;

@RestController
@RequestMapping("/api/account")
public class ApiController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/{id}")
    public Account getMapping(@PathVariable("id") Long id) {
        return accountRepository.findById(id).get();
    }


}
