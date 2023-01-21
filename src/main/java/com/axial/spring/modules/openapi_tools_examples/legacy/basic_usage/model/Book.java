package com.axial.spring.modules.openapi_tools_examples.legacy.basic_usage.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Book {

    private String name;

    private String author;

}
