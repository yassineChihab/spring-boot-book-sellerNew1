package com.chihab.springbootbooksellerNew1.service;

import com.chihab.springbootbooksellerNew1.model.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBook();
}
