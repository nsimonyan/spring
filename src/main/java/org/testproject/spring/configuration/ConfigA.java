package org.testproject.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {
   @Bean
   //   @Bean(initMethod = "init", destroyMethod = "cleanup" )
   //    @Scope("prototype")
   public Foo foo() {
      return new Foo(); 
   }
}