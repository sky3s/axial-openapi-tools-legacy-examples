package com.axial.spring.modules.openapi_manager_examples.basic_usage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = {
        PackageMarker.class,
        com.axial.modules.openapi_manager.PackageMarker.class
})
@SpringBootApplication
public class BasicUsageApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(BasicUsageApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BasicUsageApplication.class);
    }

}
