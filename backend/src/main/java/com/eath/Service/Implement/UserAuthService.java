package com.eath.Service.Implement;

import com.eath.dao.UserViewRepository;
import com.eath.entite.UserView;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserAuthService {
    private final UserViewRepository userViewRepository;
    private final PasswordEncoder passwordEncoder;

    public UserView authenticate(String email, String password) {
        UserView user = userViewRepository.findByEmail(email);
        if (user != null && passwordEncoder.matches(password, user.getMotDePasse())) {
            return user;
        }
        throw new RuntimeException("Invalid credentials");
    }
}
