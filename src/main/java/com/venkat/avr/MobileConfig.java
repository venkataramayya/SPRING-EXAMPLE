package com.venkat.avr;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class MobileConfig {
    @Bean
    public ModelAndColor getOneplusobject(){
        return new Oneplus();
    }
    @Bean
    public ModelAndColor getIphoneobject(){
        return new Iphone(null);
    }
  
}
