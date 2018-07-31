package com.kg.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
       @SuppressWarnings("resource")
       ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
     // ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
    //    GeometryExample1 geometryBean1=context.getBean("geometryExample1", GeometryExample1.class);
    //    geometryBean1.drawShape();
       GeometryExample2 geometryBean2=context.getBean("geometryExample2", GeometryExample2.class);
       geometryBean2.drawShape();
    }
 }