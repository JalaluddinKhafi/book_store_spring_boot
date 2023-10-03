package com.book.app.book_store_spring_boot.controller;

import com.book.app.book_store_spring_boot.entity.book;
import com.book.app.book_store_spring_boot.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    @GetMapping("/adminHomePage")
    public String adminHome(){
        return "adminHomePage";
    }
    @GetMapping("/add_book")
    public String addBook(){
        return "add_book";
    }
    @RequestMapping("/save")
    public String addBook(@ModelAttribute book b){
        service.saveBook(b);
        return "redirect:admin_all_books";
    }
    @GetMapping("/editBook/{id}")
    public String editbook(@PathVariable("id") long id, Model model){
    book b=service.getBookById(id);
    model.addAttribute("book",b);
    return"editBook";
    }
    @GetMapping("/deleteBook/{id}")
    public String deleBook(@PathVariable long id){
        service.deletBookById(id);
        return "redirect:/admin_all_books";
    }
    @GetMapping("/admin_all_books")
    public String admin_allbooks(Model model){
        List<book> bookList=service.getAllBooks();
        model.addAttribute("book",bookList);
        return "admin_all_books";
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

}
