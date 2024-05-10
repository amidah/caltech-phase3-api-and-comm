package com.spring.jdbc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.demo.db.DB;
import com.spring.jdbc.demo.model.Dish;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Spring JDBC");
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        DB db = (DB)context.getBean("db");
        
        Dish dish1 = new Dish(0, "Chicken Salad", 500);
        Dish dish2 = new Dish(0, "Mutton Salad", 800);
        Dish dish3 = new Dish(0, "Cheese Pasta", 700);
        
        db.insertDish(dish1);
        db.insertDish(dish2);
        db.insertDish(dish3);
        
        db.getAllDishes();
    }
}
