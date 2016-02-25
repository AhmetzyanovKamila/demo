package foo.bar;

import foo.bar.performers.Groups;
import foo.bar.performers.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Groups performer = (Groups) context.getBean("d");
        performer.perform();

    }
}
