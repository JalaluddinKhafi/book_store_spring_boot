package com.book.app.book_store_spring_boot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name ="userName", unique = true, nullable = false)
    private String userName;
    @Column(nullable = false)
    private String password;
    @OneToMany(mappedBy = "orders",cascade = CascadeType.ALL)
    private List<Order> orders;

}
