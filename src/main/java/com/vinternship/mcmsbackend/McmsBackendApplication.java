package com.vinternship.mcmsbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class McmsBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(McmsBackendApplication.class, args);
    }

}
