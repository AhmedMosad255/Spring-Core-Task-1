package com.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        PersonService personService = context.getBean("personService", PersonService.class);
        personService.save("Ahmed");
        personService.update("Ahmed");
        System.out.println("---------------------------------");
        MangerService mangerService = context.getBean("mangerService", MangerService.class);
        mangerService.save("Mohamed");
        mangerService.update("Mohamed");
        context.close();
    }
}
