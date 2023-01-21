package com.axial.spring.modules.openapi_tools_examples.legacy.basic_usage.rest_api;

import com.axial.spring.modules.openapi_tools_examples.legacy.basic_usage.model.Book;
import com.axial.spring.modules.openapi_tools_examples.legacy.basic_usage.rest_api.model.BookResponse;
import com.axial.spring.modules.openapi_tools_examples.legacy.basic_usage.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = {""})
public class DemoController {

    private final BookService bookService;

    @GetMapping(value = "basic/api/v1/books", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BookResponse> getAllBooks() {

        final List<Book> books = bookService.getAllBooks();
        final BookResponse response = BookResponse.builder().books(books).build();

        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "advanced/api/v1/books", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BookResponse> getBooksByName(@RequestParam(name = "name") String bookName) {

        final List<Book> books = bookService.getBooksByName(bookName);
        final BookResponse response = BookResponse.builder().books(books).build();

        return ResponseEntity.ok(response);
    }

}
