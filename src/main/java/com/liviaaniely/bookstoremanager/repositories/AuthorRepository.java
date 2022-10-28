package com.liviaaniely.bookstoremanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.liviaaniely.bookstoremanager.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

}
