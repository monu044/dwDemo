package com.monu.example.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.Resource;
import javax.validation.constraints.NotEmpty;

@NoArgsConstructor
@Getter
@Setter
public class DemoConfiguration extends Configuration {

    @NotEmpty
    private String name;

    @NotEmpty
    private String defaultTemplate;
}
