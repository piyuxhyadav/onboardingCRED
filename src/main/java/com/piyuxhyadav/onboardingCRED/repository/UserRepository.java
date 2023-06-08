package com.piyuxhyadav.onboardingCRED.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.piyuxhyadav.onboardingCRED.entity.User;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer> {
//    List<User> findByFirstNameStartingWith(String prefix);

    List<User> findByFirstNameStartingWith(String prefix);
    List<User> findByLastNameStartingWith(String prefix);
    List<User> findByPhoneNumberStartingWith(String prefix);
	

}
