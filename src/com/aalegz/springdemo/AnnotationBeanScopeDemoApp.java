package com.aalegz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        //load spring config file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        //check if they are the same

        boolean result = (theCoach == alphaCoach);

        System.out.println("\nPrinting to the same object: " + result);
        System.out.println("Is equals: " + (theCoach.equals(alphaCoach)));

        System.out.println("Memmory location theCoach: " + theCoach);
        System.out.println("Memmory location alphaCoach: " + alphaCoach);

        context.close();
    }
}
