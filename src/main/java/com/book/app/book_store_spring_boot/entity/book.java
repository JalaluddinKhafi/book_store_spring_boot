package com.book.app.book_store_spring_boot.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class book {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private int price;
    @OneToMany(mappedBy = "books", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

}
