package com.sdsoon;

import com.sdsoon.test.tio.starter.ServerStarter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class TioChrHelloworldApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(TioChrHelloworldApplication.class, args);
		//
		ServerStarter.start();
	}

}
