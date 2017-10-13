package br.com.nosso.sushi;

import br.com.nosso.sushi.gateways.mongo.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@AllArgsConstructor
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "br.com.nosso.sushi")
public class SushiApplication implements CommandLineRunner {

    private final CustomerRepository repository;

    public static void main(final String[] args) {
        SpringApplication.run(SushiApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        repository.deleteAll();
    }
}
