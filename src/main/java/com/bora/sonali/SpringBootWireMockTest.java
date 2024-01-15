package com.bora.sonali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;

@SpringBootApplication
@AutoConfigureWireMock
public class SpringBootWireMockTest {
  public static void main(String[] args) {
    SpringApplication.run(SpringBootWireMockTest.class, args);
  }
}
