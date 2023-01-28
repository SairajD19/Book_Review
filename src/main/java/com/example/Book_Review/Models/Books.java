package com.example.Book_Review.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int book_id;

    private String title;

    private String description;

    private LocalDate publication_date;

    private String image_url;

    @ManyToOne
    @JoinColumn
    private Authors author;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Reviews> reviews = new ArrayList<>();

}
