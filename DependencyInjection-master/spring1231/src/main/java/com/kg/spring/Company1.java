package com.kg.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Company1 {

   private String employee;

   // Setter method 

   public void setEmployee(String employee)
    {
      this.employee = employee;
   }
   public String getEmployee()
   {
       return employee;
   }

   
}