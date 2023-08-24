package com.naveen.repository;

import com.naveen.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface BookRepository extends JpaRepository<Book,Long> {
}
