package ch.csbe.productmanager.resources.users.login;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class EncoderConfiguration {

    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }

}

