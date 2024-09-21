package ru.kiomaru;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        bean.setMessage("Hello World");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        bean2.setMessage("Hello World2");

        Cat cat = (Cat) applicationContext.getBean("cat");
        cat.setName("Артемка");
        Cat cat2 = (Cat) applicationContext.getBean("cat2");
        cat2.setName("Бобик");

        if (bean == bean2) {
            System.out.println("Бины HelloWorld имеют одну ссылку.");
        } else {
            System.out.println("У бинов HelloWorld разные ссылки.");
        }
        if (cat == cat2) {
            System.out.println("Бины Cat имеют одну ссылку.");
        } else {
            System.out.println("У бинов Cat разные ссылки.");
        }
    }
}