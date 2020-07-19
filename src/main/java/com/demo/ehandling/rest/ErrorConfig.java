package com.demo.ehandling.rest;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Configuration
public class ErrorConfig {

    @Bean
    public DefaultErrorAttributes overrideErrorAttributes() {
        return new DefaultErrorAttributes() {
            @Override
            public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
                Map<String, Object> unfilteredAttributes = getErrorAttributes(webRequest, options.isIncluded(ErrorAttributeOptions.Include.STACK_TRACE));

                Map<String, Object> filteredAttributes = super.getErrorAttributes(webRequest, options);

                if (unfilteredAttributes.get("message") != null) {
                    filteredAttributes.put("message", unfilteredAttributes.get("message"));
                }

                filteredAttributes.put("causedby", "gosho");

                return filteredAttributes;
            }
        };
    }
}
