package com.mam;

import com.mam.mapper.BookMapper;
import com.mam.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        /*//1.获取ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookMapper bookMapper = (BookMapper)applicationContext.getBean("bookMapper");
        BookService bookService = (BookService)applicationContext.getBean("bookService");
        bookService.save();*/
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource)context.getBean("dataSource");
        System.out.println(dataSource);
    }

}
