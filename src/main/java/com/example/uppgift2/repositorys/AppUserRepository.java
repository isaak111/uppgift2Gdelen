package com.example.uppgift2.repositorys;

import com.example.uppgift2.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository <AppUser, Integer> {
}
