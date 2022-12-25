package com.axial.spring.modules.openapi_manager_examples.basic_usage.service;

import com.axial.spring.modules.openapi_manager_examples.basic_usage.model.Book;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BookService {

    public List<Book> getAllBooks() {

        return Arrays.asList(
                Book.builder().name("20,000 Leagues Under The Sea")
                        .author("Jules Verne").build(),
                Book.builder().name("Harry Potter and the Philosopher's Stone")
                        .author("J. K. Rowling").build()
        );
    }

    public List<Book> getBooksByName(String bookName) {

        final List<Book> allBooks = getAllBooks();
        return allBooks.stream().filter(book -> StringUtils.containsIgnoreCase(book.getName(), bookName)).collect(Collectors.toList());
    }

}
