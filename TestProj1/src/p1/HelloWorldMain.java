package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldMain
{
 public static void main(String[] args) 
 {
  ApplicationContext ct= 
		  new AnnotationConfigApplicationContext(HelloWorldConfig.class);
  HelloWorld hw= ct.getBean(HelloWorld.class);
  System.out.println(hw);
  System.out.println(hw.getMessage());
 }
}
