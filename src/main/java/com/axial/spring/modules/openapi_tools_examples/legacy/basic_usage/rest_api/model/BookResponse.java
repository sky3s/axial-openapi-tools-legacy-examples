package com.axial.spring.modules.openapi_tools_examples.legacy.basic_usage.rest_api.model;

import com.axial.spring.modules.openapi_tools_examples.legacy.basic_usage.model.Book;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class BookResponse {

    private List<Book> books;

}
