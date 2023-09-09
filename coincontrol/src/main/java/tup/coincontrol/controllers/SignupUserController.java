package tup.coincontrol.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tup.coincontrol.dto.SignupRequest;
import tup.coincontrol.dto.UserDTO;
import tup.coincontrol.services.AuthService;

@RestController
public class SignupUserController {
    
    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> createUser(@RequestBody SignupRequest signupRequest){
        UserDTO createdUser = authService.createUser(signupRequest);
        if(createdUser==null)
            return new ResponseEntity<>("Usuario no encontrado, pruebe nuevamente", HttpStatus.BAD_REQUEST);
            return new ResponseEntity<>(createdUser,HttpStatus.CREATED);
        
    }

}
