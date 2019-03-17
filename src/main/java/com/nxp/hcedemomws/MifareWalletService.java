package com.nxp.hcedemomws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.nxp.hcedemomws"})
public class MifareWalletService {

  public static void main(String[] args) {
    SpringApplication.run(MifareWalletService.class, args);
  }
}
