package tup.coincontrol.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tup.coincontrol.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    void deleteUserById(Long id);
    Optional<User> findUserById(Long id);
    
}
