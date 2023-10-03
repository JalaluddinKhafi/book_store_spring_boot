package com.book.app.book_store_spring_boot.service;

import com.book.app.book_store_spring_boot.entity.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.book.app.book_store_spring_boot.repository.bookRepository;

import java.util.List;

@Service
public class bookService {


    @Autowired
    bookRepository repository;
    public void saveBook(book b){
        repository.save(b);

    }
    public List<book> getAllBooks(){
    return repository.findAll();
    }
    public book getBookById(long id){
        return repository.findById(id).get();
    }
    public void deletBookById(long id){
        repository.deleteById(id);
    }
}
