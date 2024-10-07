package com.logistics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class LogisticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogisticsApplication.class, args);
	}

}

@Controller
public class WebController {
    @GetMapping("/")
    public String index() {
        return "index";  // Automatically resolves to index.html in the static folder
    }
}
