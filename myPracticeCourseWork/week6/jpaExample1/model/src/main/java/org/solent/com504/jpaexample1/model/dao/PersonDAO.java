package org.solent.com504.jpaexample1.model.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.solent.com504.jpaexample1.model.dao.PersonDAO;
import org.solent.com504.jpaexample1.model.dto.Person;
import org.solent.com504.jpaexample1.model.dto.Role;

public class PersonDAOJpaImpl implements PersonDAO {

    final static Logger LOG = LogManager.getLogger(PersonDAOJpaImpl.class);

    private EntityManager entityManager;

    public PersonDAOJpaImpl(EntityManager em) {
        this.entityManager = em;
    }

    @Override
    public Person findById(Long id) {
        Person person = entityManager.find(Person.class, id);
        return person;
    }

    @Override
    public Person save(Person person) {
        entityManager.getTransaction().begin();
        entityManager.persist(person);  
        entityManager.getTransaction().commit();
        return person;
    }

    @Override
    public List<Person> findAll() {
        TypedQuery<Person> q = entityManager.createQuery("SELECT p FROM Person p", Person.class);
        List<Person> personList = q.getResultList();
        return personList;
    }

    @Override
    public void deleteById(long id) {
        entityManager.getTransaction().begin();
        Query q = entityManager.createQuery("DELETE FROM Appointment a WHERE a.id=:id");
        q.setParameter("id", id);
        q.executeUpdate();
        entityManager.getTransaction().commit();
    }

    @Override
    public Person delete(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void deleteAll() {
        entityManager.getTransaction().begin();
        entityManager.createQuery("DELETE FROM Animal ").executeUpdate();
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Person> findByRole(Role role) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Person> findByName(String firstName, String secondName) {
        
        Map<String, String> paramMap = new HashMap<String, String>();
        
        String quertString = "select a from Appointment a WHERE TRUE=TRUE ";
        if (appointmentTemplate.getName() != null) {
            queryString = queryString + "AND a.name LIKE :name ";
        }
        
        
    }

}
