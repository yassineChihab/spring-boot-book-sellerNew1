package com.chihab.springbootbooksellerNew1.repository;

import com.chihab.springbootbooksellerNew1.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Long> {

}
