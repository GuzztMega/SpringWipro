package org.examples;

import org.examples.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoController implements CommandLineRunner {

    @Autowired
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(DemoController.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Integer sum: "+demoService.sum(1,15) );
        System.out.println("Spring concat: "+demoService.concat("Uma     linha","de texto") );
    }
}
