package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        Student student = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("std1");
        Student student1 = (Student) context.getBean("std2");
//        System.out.println(student);
        System.out.println(student2);
        System.out.println(student1);
    }
}
