package com.example.Book_Review.Repository;

import com.example.Book_Review.Models.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Reviews, Integer> {
}
