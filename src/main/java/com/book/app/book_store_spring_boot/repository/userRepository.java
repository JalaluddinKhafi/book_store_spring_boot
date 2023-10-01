package com.book.app.book_store_spring_boot.repository;

import com.book.app.book_store_spring_boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User,Long> {
    User findByUserName(String username);
}
