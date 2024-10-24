package com.dev.delta.dto;

import com.dev.delta.entities.Role;
import com.dev.delta.entities.User;
import com.dev.delta.repositories.RoleRepository;
import com.dev.delta.repositories.UserRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDTO implements DTO {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository; // Assuming you have a RoleRepository for handling roles

    @Autowired
    private PasswordEncoder passwordEncoder;

    private final Faker faker = new Faker(); // Initialize Faker

    @Override
    public void populate() {
        Role r=new Role();
        r.setName("ROLE_ADMIN");
        roleRepository.save(r);
        // Implementation for populating user data if needed
        insertFakeUsers(6);
        User userEntity = new User();
        userEntity.setUsername("admin");
        userEntity.setPassword("admin"); // Encode the password
        userEntity.setEmail("kchaouanis20@gmail.com");
        userEntity.setFirstName("admin");
        userEntity.setLastName("admin");
        userEntity.setActive(true); // Set user as active by default

        // Assign random roles (for example, all users will have "ROLE_USER")
        Set<String> roles = new HashSet<>();
         // Randomly add admin role
            roles.add("ROLE_ADMIN");
        userEntity.setAbout(faker.lorem().paragraph());
        // Set user as active by default
        userEntity.setAddress(faker.address().fullAddress());
        userEntity.setRoles(roles);

        // Save user to the database
        userRepository.save(userEntity);
    }

    // Method to generate and insert fake users
    public void insertFakeUsers(int count) {
        for (int i = 0; i < count; i++) {
            User userEntity = new User();
            userEntity.setUsername(faker.internet().emailAddress());
            userEntity.setPassword(faker.internet().password()); // Encode the password
            userEntity.setEmail(faker.internet().emailAddress());
            userEntity.setFirstName(faker.name().firstName());
            userEntity.setLastName(faker.name().lastName());
            userEntity.setActive(true);
            userEntity.setAbout(faker.lorem().paragraph());
            // Set user as active by default
            userEntity.setAddress(faker.address().fullAddress());
            System.out.println(userEntity.toString());
            // Assign random roles (for example, all users will have "ROLE_USER")
            Set<String> roles = new HashSet<>();
            roles.add("ROLE_USER"); // Default role
            if (faker.bool().bool()) { // Randomly add admin role
                roles.add("ROLE_ADMIN");
            }
            userEntity.setRoles(roles);

            // Save user to the database
            userRepository.save(userEntity);
        }
    }
}
