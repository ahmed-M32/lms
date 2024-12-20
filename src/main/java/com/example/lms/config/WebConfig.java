package com.example.lms.config;

import com.example.lms.Repositories.UserRepo;
import com.example.lms.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@RequiredArgsConstructor
public class WebConfig {
    private final UserRepo userRepository;

    @Bean
    public UserDetailsService userDetailsService() {
        return userEmail -> {
            User user = userRepository
                    .findByEmail(userEmail)
                    .orElseThrow(() -> new UsernameNotFoundException("User not found"));
            return user;
        };
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
