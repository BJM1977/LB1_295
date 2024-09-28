package ch.csbe.productmanager.resources.users.login;

import ch.csbe.productmanager.resources.users.dto.UserDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
public class SecurityConfiguration {
    @Autowired
    private JwtRequestFilter jwtRequestFilter;




    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);

        http
                .httpBasic(AbstractHttpConfigurer::disable)
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests((authz)->
                        authz.requestMatchers("/users/login").permitAll()
                                .requestMatchers("/swagger-ui/index.html").permitAll()
                                .requestMatchers("/error").permitAll()
                                .requestMatchers("swagger-ui").permitAll()
                                .requestMatchers("/v3/api-docs").permitAll()
                                .requestMatchers("/v3/api-docs/api-docs/swagger-config").permitAll()
                                .requestMatchers(HttpMethod.GET,"/users").permitAll()
                                .requestMatchers(HttpMethod.POST,"/users").permitAll()
                                .requestMatchers(HttpMethod.GET,"/users/login").permitAll()
                                .requestMatchers(HttpMethod.POST,"/users/login").permitAll()
                                .requestMatchers(HttpMethod.GET,"/products").permitAll()
                                .requestMatchers(HttpMethod.POST,"/products").authenticated()
                                .requestMatchers(HttpMethod.GET,"/categories").permitAll()
                                .requestMatchers(HttpMethod.POST,"/categories").authenticated()
                        .anyRequest().authenticated()
                );
        return http.build();
    }


    private PasswordEncoder encoder() {
        return null;
    }

}
