package com.book.app.book_store_spring_boot.entity;

import jakarta.persistence.*;

@Entity
public class OrderItem {
    @Id
    private Long order_item_id;
    @Column(nullable = false)
    private int uni_price;
    @Column(nullable = false)
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private book book;
    @ManyToOne
    @JoinColumn(name ="order_id")
    private Order order;

}
