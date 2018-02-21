package org.testproject.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ConfigA.class)
public class ConfigA2 {
   @Bean
   public Bar bar() {
      return new Bar(); 
   }
}