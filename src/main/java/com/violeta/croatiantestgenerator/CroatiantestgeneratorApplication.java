package com.violeta.croatiantestgenerator;

import com.violeta.croatiantestgenerator.service.CroatianTestGeneratorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CroatiantestgeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CroatiantestgeneratorApplication.class, args);
        CroatianTestGeneratorService service = new CroatianTestGeneratorService();
        service.generateTests();
    }

}
