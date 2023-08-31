package com.book.app.book_store_spring_boot.repository;

import com.book.app.book_store_spring_boot.entity.book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookRepository extends JpaRepository<book,Long> {


}
