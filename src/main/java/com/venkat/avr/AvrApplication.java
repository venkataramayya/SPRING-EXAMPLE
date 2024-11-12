package com.venkat.avr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AvrApplication {

    public static void main(String[] args) {
        // Use AnnotationConfigApplicationContext to load Java-based configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MobileConfig.class);

        // Get the bean by method name "getOnePlusObject" from MobileConfig
        ModelAndColor obj = context.getBean("getOneplusobject", ModelAndColor.class);
        obj.getColorModel();
		ModelAndColor obj1 = context.getBean("getIphoneobject", ModelAndColor.class);
        obj1.getColorModel();
    }
}
