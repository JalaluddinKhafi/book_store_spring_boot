package com.book.app.book_store_spring_boot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_item")
public class OrderItem {
    @Id
    @Column(name = "order_detail_id")
    private Long order_item_id;
    @Column(nullable = false)
    private int uni_price;
    @Column(nullable = false)
    private int quantity;
    @ManyToOne()
    @JoinColumn(name = "book_id")
    private book books;

}
