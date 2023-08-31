package com.book.app.book_store_spring_boot.controller;

import com.book.app.book_store_spring_boot.entity.book;
import com.book.app.book_store_spring_boot.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.book.app.book_store_spring_boot.service.bookService;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    bookService service;

    @RequestMapping("/index")
    public String demo(){
        return "index";
    }
    @GetMapping("/add_book")
    public String addBook(){
        return "add_book";
    }
    @GetMapping("/all_books")
    public ModelAndView allBooks(){
        List<book> list=service.getAllBooks();
//        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.setViewName("all_books");
//        modelAndView.addObject("book", list);
        return new ModelAndView("all_books","book",list);
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/create_account")
    public String createAccount(){
        return "create_account";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("/save")
    public String addBook(@ModelAttribute book b){
        service.saveBook(b);
        return "redirect:all_books";
    }
}
