package p2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig1 
{
   @Bean
   public HelloWorld method1()
   { return new HelloWorld();
    }	
}