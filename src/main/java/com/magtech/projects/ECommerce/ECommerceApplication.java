package com.magtech.projects.ECommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication @RestController
public class ECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

	@GetMapping
	public static String home(){
		return """
              <html>
                  <body>
                      <h1>Hello, Welcome to the E-commerce application</h1>
                  </body>
              </html>
              """;
	}
}
