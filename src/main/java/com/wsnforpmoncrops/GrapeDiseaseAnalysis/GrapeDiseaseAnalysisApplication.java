package com.wsnforpmoncrops.GrapeDiseaseAnalysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.orm.jpa;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.wsnforpmoncrops.GrapeDiseaseAnalysis")
@EntityScan(basePackages = "com.wsnforpmoncrops.GrapeDiseaseAnalysis.Entities")
@EnableJpaRepositories(basePackages="com.wsnforpmoncrops.GrapeDiseaseAnalysis.Dao")
public class GrapeDiseaseAnalysisApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GrapeDiseaseAnalysisApplication.class, args);
	}
}
