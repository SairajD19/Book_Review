package com.example.Book_Review.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "authors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Authors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int author_id;

    private String name;

    private String bio;

    @CreationTimestamp
    private Date created_at;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Books> books = new ArrayList<>();
}
