package com.book.app.book_store_spring_boot.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "orders")
public class Order {
    @Id
private Long order_id;
private Date order_date;
private double order_total_price;
    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;
}
