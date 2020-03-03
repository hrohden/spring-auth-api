package br.com.henriquerohden.springauthapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @PostMapping
    public ResponseEntity<?> authenticate() {
        return ResponseEntity.ok().build();
    }
}