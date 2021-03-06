package phone.book.main;

import phone.book.dao.PersonDao;
import phone.book.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import phone.book.model.Phone;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/beans.xml");

        PersonDao personDAO = context.getBean(PersonDao.class);

        ArrayList<Phone> personArrayList = new ArrayList<Phone>();
        personArrayList.add(new Phone("89856321172"));

        Person person = new Person("����", personArrayList);

        personDAO.save(person);

        System.out.println("Person::"+person);

        List<Person> list = personDAO.getPersonList();

        for(Person p : list){
            System.out.println("Person List::"+p);
        }
        //close resources
        context.close();
    }
}
