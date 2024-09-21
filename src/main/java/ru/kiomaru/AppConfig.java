package ru.kiomaru;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "cat")
    public Cat getCat() {
        return new Cat();
    }

    @Bean(name = "cat2")
    public Cat getCat2() {
        return new Cat();
    }
}
