package com.axial.spring.modules.openapi_tools_examples.legacy.basic_usage.extension.openapi;

import com.axialworks.modules.legacy.openapi_tools.ApiCustomizer;
import com.axialworks.modules.legacy.openapi_tools.model.ApiHeader;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created on December 2022
 */
@Component
public class DemoAppApiConfig implements ApiCustomizer {

    @Override
    public List<ApiHeader> getHeaders() {

        final List<ApiHeader> headers = ApiCustomizer.super.getHeaders();

        headers.addAll(
                Arrays.asList(
                        ApiHeader
                                .builder()
                                .key("ApiKeyAuth")
                                .name("X-ApiKey")
                                .defaultValue("ABCD123456")
                                .required(true)
                                .description("Enter your apikey")
                                .defaultApiHeader(false)
                                .defaultSecurityHeader(true)
                                .build(),

                        ApiHeader
                                .builder()
                                .key("Username")
                                .name("X-Username")
                                .defaultValue("dummyUser")
                                .required(false)
                                .description("Enter your username")
                                .defaultApiHeader(false)
                                .defaultSecurityHeader(false)
                                .build(),

                        ApiHeader
                                .builder()
                                .key("AcceptLanguage")
                                .name("Accept-Language")
                                .defaultValue("en")
                                .required(false)
                                .description("Requested language")
                                .defaultApiHeader(true)
                                .defaultSecurityHeader(false)
                                .build(),

                        ApiHeader
                                .builder()
                                .key("ClearCachedData")
                                .name("X-ClearCachedData")
                                .defaultValue("false")
                                .required(false)
                                .description("Clear cached data")
                                .defaultApiHeader(false)
                                .defaultSecurityHeader(false)
                                .build()
                )
        );

        return headers;
    }

}
