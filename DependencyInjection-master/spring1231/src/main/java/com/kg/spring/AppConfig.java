package com.kg.spring;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.kg.spring")
public class AppConfig {
//    @Bean("company1")
@Bean
//    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
  @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//    public Company1 getEmployee() {
//       return new Company1();
//    }
   public Employee getEmployee1()
   {
       return  new EmployeeImp();
   }
}