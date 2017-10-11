package br.com.nosso.sushi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "br.com.nosso.sushi")
public class SushiApplication {
    public static void main(final String[] args) {
        SpringApplication.run(SushiApplication.class, args);
    }

}
