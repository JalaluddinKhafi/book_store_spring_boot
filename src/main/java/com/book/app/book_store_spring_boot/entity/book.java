package com.book.app.book_store_spring_boot.entity;

import jakarta.persistence.*;
import lombok.*;

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
    private String name;
    private String author;
    private int price;

}
