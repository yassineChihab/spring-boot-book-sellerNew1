package com.chihab.springbootbooksellerNew1.service;


import com.chihab.springbootbooksellerNew1.model.Book;
import com.chihab.springbootbooksellerNew1.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookServiceImp implements IBookService {
    @Autowired
    private IBookRepository bookRepository;


    @Override
    public Book saveBook(Book book){
        book.setCreateTime(LocalDateTime.now());
        return bookRepository.save(book);
    }

    @Override
    public  void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> findAllBook(){
        return bookRepository.findAll();
    }
}
