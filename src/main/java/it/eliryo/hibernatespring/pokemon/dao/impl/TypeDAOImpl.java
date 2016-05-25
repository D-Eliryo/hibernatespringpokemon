package it.eliryo.hibernatespring.pokemon.dao.impl;

import it.eliryo.hibernatespring.pokemon.dao.TypeDAO;
import it.eliryo.hibernatespring.pokemon.tables.Type;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dario
 */

@Repository
public class TypeDAOImpl implements TypeDAO{
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Type type) throws Exception {
        sessionFactory.getCurrentSession().save(type);
    }

    @Override
    public void update(Type type) throws Exception {
        sessionFactory.getCurrentSession().saveOrUpdate(type);
    }

    @Override
    public void delete(String nameType) throws Exception {
        Type type = (Type)sessionFactory.getCurrentSession().get(Type.class, nameType);
        sessionFactory.getCurrentSession().delete(type);
    }

    @Override
    public List<Type> findAllTypes() throws Exception {
        return sessionFactory.openSession().createQuery("FROM Type").list();
    }

    @Override
    public Type findByName(String nameT) throws Exception {
        return (Type)sessionFactory.getCurrentSession().get(Type.class, nameT);
    }
    
}
