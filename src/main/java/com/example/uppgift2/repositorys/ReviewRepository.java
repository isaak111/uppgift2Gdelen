package com.example.uppgift2.repositorys;

import com.example.uppgift2.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
