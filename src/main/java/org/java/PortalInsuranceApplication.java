package org.java;

//import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

//@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@MapperScan(basePackages = "org.java.dao")
@SpringBootApplication
public class PortalInsuranceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalInsuranceApplication.class, args);
    }

}
