package p2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldMain
{
 public static void main(String[] args) 
 {
  ApplicationContext ct= 
		  new AnnotationConfigApplicationContext(HelloWorldConfig1.class);
  HelloWorld hw= ct.getBean(HelloWorld.class);
  hw.setMessage("Welcome to Annotaion Configs");
  System.out.println(hw.getMessage()); 
	}

}

