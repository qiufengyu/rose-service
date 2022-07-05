package com.pure.rose;

import com.pure.rose.utils.ExternalController;
import com.pure.rose.utils.InternalController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
        basePackages = "com.pure.rose.*",
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = InternalController.class)
        }
)
public class RoseExternalApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoseExternalApplication.class, args);
    }

}
