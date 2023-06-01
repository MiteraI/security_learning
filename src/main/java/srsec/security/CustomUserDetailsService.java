package srsec.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import srsec.entity.Account;
import srsec.entity.entityenums.Role;
import srsec.repository.AccountRepository;

import java.util.Collection;
import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findByUserName(username).orElseThrow(
                () -> new UsernameNotFoundException("Username not found")
        );
        return new User(account.getUserName(), account.getPassword(), roleToAuthority(account.getRole()));
    }
    private Collection<GrantedAuthority> roleToAuthority(Role role) {
        GrantedAuthority authority = new SimpleGrantedAuthority(role.toString());
        Collection<GrantedAuthority> authorities = Collections.singleton(authority);
        return authorities;
    }
}
