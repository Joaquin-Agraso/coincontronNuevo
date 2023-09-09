package tup.coincontrol.services;


import tup.coincontrol.dto.SignupRequest;
import tup.coincontrol.dto.UserDTO;

public interface AuthService {

    UserDTO createUser(SignupRequest signupRequest);
    
    
}
