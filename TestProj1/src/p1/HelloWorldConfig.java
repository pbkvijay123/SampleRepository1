package p1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig 
{
   @Bean
   public HelloWorld method1()
   { return new HelloWorld("Welcome");
    }	
}