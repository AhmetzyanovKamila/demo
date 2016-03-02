package idol;

import idol.performers.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IdolMain {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("idol-config.xml");
        context.getBean(AppContext.class);
//        Performer performer = (Performer) context.getBean("d");
//        performer.perform();

    }
}
