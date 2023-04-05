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
//        System.out.println( "Hello World!" );
        ApplicationContext cont = new ClassPathXmlApplicationContext("Spring.xml");
        Student stu = (Student) cont.getBean("Student");
        System.out.println(stu.toString());
    }
}
