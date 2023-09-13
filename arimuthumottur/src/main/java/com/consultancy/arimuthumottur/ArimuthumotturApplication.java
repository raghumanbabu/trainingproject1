package com.consultancy.arimuthumottur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ArimuthumotturApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArimuthumotturApplication.class, args);
		/*
		OverviewController oc = new OverviewController();
		ContactusService cs = new ContactusServiceImpl();
		oc.setContactusService(cs);
		oc.loadContactus(null);
		 */
	}

}
