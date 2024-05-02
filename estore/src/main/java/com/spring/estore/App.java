package com.spring.estore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.estore.bean.Connection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Spring Core BeanFactory IOC" );
        
        //Traditional Approach
//        Connection con1 = new Connection();
//        con1.setUrl("jdbc:mysql://localhost/estore");
//        con1.setUsername("root");
//        con1.setPassword("Root@1234");
        //System.out.println(con1);
        
//        Connection con2 = new Connection();
//        con2.setUrl("jdbc:mysql://localhost/fooddelivery");
//        con2.setUsername("root");
//        con2.setPassword("Root@1234");
        //System.out.println(con2);
        
        // IOC: Inversion of control
        // Let's the objects be created and managed by Spring IOC container - BeanFactory
        
        BeanFactory factory = new ClassPathXmlApplicationContext("context.xml");
        Connection conn1 = (Connection) factory.getBean("con1");
        Connection conn2 = (Connection) factory.getBean("con2");
        System.out.println(conn1 + " " + conn1.hashCode());
        System.out.println(conn2 + " " + conn2.hashCode());
       
    }
}
