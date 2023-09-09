package tup.coincontrol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import tup.coincontrol.dto.SignupRequest;
import tup.coincontrol.dto.UserDTO;
import tup.coincontrol.models.User;
import tup.coincontrol.repositories.UserRepository;

@Service
public class AuthServiceImpl implements AuthService{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO createUser(SignupRequest signupRequest) {
        User user= new User();
        user.setUsername(signupRequest.getUsername());
        user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
        user.setName(signupRequest.getName());
        user.setEmail(signupRequest.getEmail());
        User createdUser=userRepository.save(user);
        
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(createdUser.getUsername());
        userDTO.setPassword(createdUser.getPassword());
        userDTO.setName(createdUser.getName());
        userDTO.setEmail(createdUser.getEmail());
        return userDTO;
    }
}
