package it.eliryo.hibernatespring.pokemon.dao.impl;

import it.eliryo.hibernatespring.pokemon.dao.RegionDAO;
import it.eliryo.hibernatespring.pokemon.tables.Region;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dario
 */
@Repository
public class RegionDAOImpl implements RegionDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Region> findAllRegions() throws Exception {
        Session session = sessionFactory.openSession();
        List<Region> regions=null;
        session.createQuery("FROM Region");
        return regions;
    }

    @Override
    public Region findByName(String regionName) throws Exception {
        return (Region)sessionFactory.getCurrentSession().get(Region.class, regionName);
    }
    
    @Override
    public Region findBySimiliarity(String looksLike) throws Exception {
        return (Region)sessionFactory.getCurrentSession().get(Region.class, looksLike);
    }
    
    @Override
    public void save(Region region) throws Exception {
        sessionFactory.getCurrentSession().save(region);
    }

    @Override
    public void update(Region region) throws Exception {
        sessionFactory.getCurrentSession().saveOrUpdate(region);
    }
    
    @Override
    public void delete(Region region) throws Exception {
        sessionFactory.getCurrentSession().delete(region);
    }

    @Override
    public void deleteByName(String regionName) throws Exception {
        Region region = (Region)sessionFactory.getCurrentSession().get(Region.class, regionName);
        sessionFactory.getCurrentSession().delete(region);
    }

}
