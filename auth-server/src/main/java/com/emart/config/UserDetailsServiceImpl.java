package com.emart.config;

import com.emart.Controller.UserController;
import com.emart.Entity.UserEntity;
import com.emart.Repository.UserRepository;
import com.emart.Service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    private BCryptPasswordEncoder encoder;
    @Autowired
    UserDetailsServiceImpl(BCryptPasswordEncoder encoder){
        this.encoder = encoder;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 硬编码用户，所有密码都必须加密

        List<UserEntity> users=userRepository.getUsers();

        System.out.println("users:"+users);
//        final List<AppUser> users = Arrays.asList(
//                new AppUser(1, "omar", encoder.encode("12345"), "USER"),
//                new AppUser(2, "admin", encoder.encode("12345"), "ADMIN")
//        );


        for(UserEntity appUser: users) {
            if(appUser.getUsername().equals(username)) {
                List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                        .commaSeparatedStringToAuthorityList("ROLE_USER" );

                return new User(appUser.getUsername(), encoder.encode(appUser.getPassword()), grantedAuthorities);
            }
        }

        throw new UsernameNotFoundException("Username: " + username + " not found");
    }

    @Data
    private static class AppUser {
        private Integer id;
        private String username, password;
        private String role;

        public AppUser(Integer id, String username, String password, String role) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.role = role;
        }
    }
}
