package it.eliryo.hibernatespring.pokemon.dao.impl;

import it.eliryo.hibernatespring.pokemon.dao.RegionalPokedexDAO;
import it.eliryo.hibernatespring.pokemon.tables.Pokemon;
import it.eliryo.hibernatespring.pokemon.tables.Region;
import it.eliryo.hibernatespring.pokemon.tables.RegionalPokedex;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dario
 */

@Repository
public class RegionalPokedexDAOImpl implements RegionalPokedexDAO {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void save(RegionalPokedex regionalPokedex) throws Exception {
        sessionFactory.getCurrentSession().save(regionalPokedex);
    }

    @Override
    public void delete(RegionalPokedex regionalPokedex) throws Exception {
        sessionFactory.getCurrentSession().delete(regionalPokedex);
    }

    @Override
    public void deleteByName(int posRegPokedex) throws Exception {
        RegionalPokedex regionalPokedex = (RegionalPokedex) sessionFactory.getCurrentSession().get(RegionalPokedex.class, posRegPokedex);
        sessionFactory.getCurrentSession().delete(regionalPokedex);
    }

    @Override
    public void update(RegionalPokedex regionalPokedex) throws Exception {
        sessionFactory.getCurrentSession().saveOrUpdate(regionalPokedex);
    }

    @Override
    public List<RegionalPokedex> findAllRegionalPokedex() throws Exception {
        return sessionFactory.getCurrentSession().createQuery("FROM RegionalPokedex").list();
    }

    @Override
    public List<Pokemon> findByRegionName(String regionName) throws Exception {
        String hql = "FROM Pokemon p join RegionalPokedex rp on p.nomeP = rp.nomeP join ( Region r on rp.nameR  = r.nameR)"
                   + "WHERE r.nameR = :nameR";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("nameR", regionName);
        return query.list();
    }

    @Override
    public List<Region> findByPokemonName(String pokemonName) throws Exception {
        String hql = "FROM Pokemon p join RegionalPokedex rp on p.nomeP = rp.nomeP join ( Region r on rp.nameR  = r.nameR)"
                   + "WHERE r.nomeP = :nomeP";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("nomeP", pokemonName);
        return query.list();
    }

    @Override
    public List<Pokemon> findByRegion(Region region) throws Exception {
        String hql = "FROM Pokemon p join RegionalPokedex rp on p.nomeP = rp.nomeP join ( Region r on rp.nameR  = r.nameR)"
                   + "WHERE r.nameR = :nameR";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("nameR", region.getNameR());
        return query.list();
    }

    @Override
    public List<Region> findByPokemon(Pokemon pokemon) throws Exception {
        String hql = "FROM Pokemon p join RegionalPokedex rp on p.nomeP = rp.nomeP join ( Region r on rp.nameR  = r.nameR)"
                   + "WHERE r.nomeP = :nomeP";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("nomeP", pokemon.getNomeP());
        return query.list();
    }
    
}
