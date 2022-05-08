package com.viv;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplication.class, args);
	}

	@PostConstruct
	public void readUrl() throws Exception {
        URL oracle = new URL("https://jsonmock.hackerrank.com/api/article_users");
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}
