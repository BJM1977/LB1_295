package ch.csbe.productmanager.resources.users.login;

import ch.csbe.productmanager.resources.users.User;
import ch.csbe.productmanager.resources.users.UserRepository;
import ch.csbe.productmanager.resources.users.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {
    // Schritt 1
    @Autowired
    private UserService userService;

    private final String SECRET_KEY = "yourSecretKey";
    @Autowired
    private LoginService loginService;
    @Autowired
    private UserRepository userRepository;

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain chain
    ) throws ServletException, IOException, java.io.IOException {
        // Schritt 2
        final String authorizationHeader = request.getHeader("Authorization");

        String email = null;
        String jwt = null;

        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            jwt = authorizationHeader.substring(7);
            Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(jwt).getBody().getSubject();
        }
        // Schritt 3
        if (email != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            User user = userRepository.findUserByEmail(email);
            MyUserPrincipal userPrincipal = new MyUserPrincipal();
            userPrincipal.setUserEmailAdress(user.getUserEmailAdress());
            userPrincipal.setUser(user);
            UsernamePasswordAuthenticationToken authenticationToken = new
                    UsernamePasswordAuthenticationToken(userPrincipal, null, userPrincipal.getAuthorities());
            // Schritt 4
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        }
        chain.doFilter(request, response);

    }
}