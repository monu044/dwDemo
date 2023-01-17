package com.monu.example.service;

import com.google.inject.Inject;
import com.monu.example.configuration.DemoConfiguration;
import lombok.AllArgsConstructor;

public class HelloService {
    private String template;

    private String defaultName;


    @Inject
    public HelloService(String template, String name) {
        this.template = template;
        this.defaultName = name;
    }

    public String getMessage(String name) {
        if (null == name) {
            return String.format(template, defaultName);
        }
        else {
            return String.format(template, name);
        }
    }
}
