package com.kg.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Company company = context.getBean(Company.class);
        company.showEmployeeInfo();
        Company company1 = context.getBean(Company.class);
        company1.showEmployeeInfo();
        System.out.println(company+"  "+company1);
        // Company1 company1 = context.getBean(Company1.class);
        // company1.setEmployee("guna");
        // System.out.println(company1.getEmployee());

        // Company1 company2 = context.getBean(Company1.class);
        
        // System.out.println(company2.getEmployee());
        context.close();
    }
}