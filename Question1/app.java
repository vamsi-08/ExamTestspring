package Chipl.Eclipsespring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	Students clg=context.getBean(Students.class);
    	System.out.println(clg);
    	Employee e=context.getBean(Employee.class);
    	System.out.println(e);
    } 
}
