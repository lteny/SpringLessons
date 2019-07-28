package ru.reuckiy.spring.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import ru.reuckiy.spring.Message;
import ru.reuckiy.spring.Person;
import ru.reuckiy.spring.User;

@Configurable
public class AppConfig {

@Bean
    public Message printMessage(){
    return new Message();
}
@Bean(name = "person")
    public Person person(@Value("David") String name, @Value("1") int id){
    return new User(name, id);
}
}
