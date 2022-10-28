package com.liviaaniely.bookstoremanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.liviaaniely.bookstoremanager.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
