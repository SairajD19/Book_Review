package com.example.Book_Review.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int review_id;

    private int ratings;

    private String comment;

    @CreationTimestamp
    private Date created_at;

    @ManyToOne
    @JoinColumn
    private Books book;

    @ManyToOne
    @JoinColumn
    private Users user;
}
