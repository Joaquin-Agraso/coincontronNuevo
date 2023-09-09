package tup.coincontrol.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tup.coincontrol.models.User;
import tup.coincontrol.repositories.UserRepository;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:8080" })
public class AuthController {
     @Autowired
    private AuthenticationManager authenticationManager; 
    
}