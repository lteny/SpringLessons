package ru.reuckiy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.reuckiy.spring.config.AppConfig;

public class AppRun
{
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        User user = context.getBean(User.class);
        System.out.println("ID: " + user.getId() + ", " + "Name: " + user.getName());
        Message message = context.getBean(Message.class);
        message.setMessage("The Message");

        System.out.println(message);
    }
}
