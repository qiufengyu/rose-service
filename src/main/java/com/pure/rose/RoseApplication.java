package com.pure.rose;

import com.pure.rose.utils.ExternalController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
        basePackages = "com.pure.rose.*",
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = ExternalController.class)
        }
)
public class RoseApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoseApplication.class, args);
    }

}
