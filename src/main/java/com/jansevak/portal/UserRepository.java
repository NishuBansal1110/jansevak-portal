package com.jansevak.portal;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmailAndPassword(String email, String password);

}