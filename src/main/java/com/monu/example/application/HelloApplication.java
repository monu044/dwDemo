package com.monu.example.application;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.monu.example.configuration.DemoConfiguration;
import com.monu.example.module.HelloModule;
import com.monu.example.resource.HelloResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class HelloApplication extends Application<DemoConfiguration> {


    public static void main(String[] args) throws Exception {
        new HelloApplication().run(args);
    }
    @Override
    public void run(DemoConfiguration demoConfiguration, Environment environment) throws Exception {
        Injector injector = Guice.createInjector(new HelloModule(demoConfiguration));
        environment.jersey().register(injector.getInstance(HelloResource.class));
    }
}
