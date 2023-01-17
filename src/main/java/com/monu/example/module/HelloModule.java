package com.monu.example.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.monu.example.configuration.DemoConfiguration;
import com.monu.example.service.HelloService;

public class HelloModule extends AbstractModule {

    private final DemoConfiguration configuration;

    public HelloModule(DemoConfiguration configuration) {
        this.configuration = configuration;
    }

    @Provides
    @Singleton
    public HelloService getHelloService() {
        return new HelloService(configuration.getDefaultTemplate(), configuration.getName());
    }

}
