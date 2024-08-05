package com.eath.web;

import com.eath.Service.Implement.UserAuthService;
import com.eath.entite.UserView;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class UserAuthController {
    private final UserAuthService userAuthService;

    @PostMapping("/login")
    public ResponseEntity<UserView> login(@RequestParam String email, @RequestParam String password) {
        try {
            UserView user = userAuthService.authenticate(email, password);
            return ResponseEntity.ok(user);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
    }

    @GetMapping("/logout")
    public ResponseEntity<Void> logout() {
        // 
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
