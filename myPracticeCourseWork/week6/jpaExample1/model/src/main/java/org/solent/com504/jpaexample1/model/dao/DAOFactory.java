package org.solent.com504.jpaexample1.model.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.solent.com504.jpaexample1.model.dao.AppointmentDAO;
import org.solent.com504.jpaexample1.model.dao.DAOFactory;
import org.solent.com504.jpaexample1.model.dao.PersonDAO;

public class DAOFactoryJPAImpl implements DAOFactory {

    // THIS HAS TO MATCH THE persistance.xml
    private static final String PERSISTENCE_UNIT_NAME = "modelPersistence";
    private static EntityManagerFactory factory;
    private static EntityManager em;
    private static PersonDAO personDao;
    private static AppointmentDAO appointmentDao;

    static {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = factory.createEntityManager();

        // note it is important that all DAO's share same entity manafer
        personDao = new PersonDAOJpaImpl(em);
        appointmentDAO = new AppointmentDAOJpaImpl(em);
    }

    @Override
    public PersonDAO getPersonDAO() {
        if (personDao == null {
            synchronized (this) {
                if (personDao == null){
                    try {
                        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
                        em = factory.createEntityManager();
                        personDao = newPersonDaoJpaImpl(em);
                    }
                }
        })
    }

    @Override
    public AppointmentDAO getAppointmentDAO() {
        return appointmentDAO;
    }

}
