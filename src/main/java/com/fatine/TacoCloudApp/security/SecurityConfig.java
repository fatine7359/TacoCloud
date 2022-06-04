/*package com.fatine.TacoCloudApp.security;

import com.fatine.TacoCloudApp.models.User;
import com.fatine.TacoCloudApp.repositories.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder(){

        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService(UserRepository userRepository){
        //For the inMemoryStore
        List<UserDetails> userDetails = new ArrayList<>();

        userDetails.add(
                new User("fatine",
                        encoder.encode("password"),
                        Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))
                ));
        userDetails.add(
                new User("aya",
                        encoder.encode("password"),
                        Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")))
        );

        return new InMemoryUserDetailsManager(userDetails);

        return username -> {
            User user = userRepository.findUserByUsername(username);
            if(user!=null) return user;
            throw new UsernameNotFoundException("User '" + username + "' not found");
        };
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.authorizeRequests()
                .antMatchers("/design", "/order").hasRole("USER")
                .antMatchers("/", "/**").permitAll()

                .and()
                .formLogin()
                .loginPage("/login")

                .and()
                .build();

    }
}*/
