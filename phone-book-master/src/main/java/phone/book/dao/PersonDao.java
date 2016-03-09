package phone.book.dao;

import phone.book.model.Person;

import java.util.List;


public interface PersonDao {
    public void save(Person p);

    public List<Person> getPersonList();
}
