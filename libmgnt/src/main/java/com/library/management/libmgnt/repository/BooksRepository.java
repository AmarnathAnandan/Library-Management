package com.library.management.libmgnt.repository;
import org.springframework.data.repository.CrudRepository;

import com.library.management.libmgnt.model.Book;
//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Book, Integer>  
{  
}  