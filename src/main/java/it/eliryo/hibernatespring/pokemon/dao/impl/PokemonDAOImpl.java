package it.eliryo.hibernatespring.pokemon.dao.impl;

import it.eliryo.hibernatespring.pokemon.dao.PokemonDAO;
import it.eliryo.hibernatespring.pokemon.tables.Category;
import it.eliryo.hibernatespring.pokemon.tables.Pokemon;
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
public class PokemonDAOImpl implements PokemonDAO {

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public void save(Pokemon pokemon) throws Exception {
        sessionFactory.getCurrentSession().save(pokemon);
    }

    @Override
    public void update(Pokemon pokemon) throws Exception {
        sessionFactory.getCurrentSession().saveOrUpdate(pokemon);
    }

    @Override
    public void deleteByName(String pokemon_name) throws Exception {
        Pokemon pokemon = (Pokemon) sessionFactory.getCurrentSession().get(Pokemon.class, pokemon_name);
        sessionFactory.getCurrentSession().delete(pokemon);
    }

    @Override
    public void delete(Pokemon pokemon) throws Exception {
        sessionFactory.getCurrentSession().delete(pokemon);
    }

    @Override
    public List<Pokemon> findAllPokemons() throws Exception {
        return (List<Pokemon>) sessionFactory.openSession().createQuery("FROM Pokemon").list();
    }

    @Override
    public List<Pokemon> findByType(String type_name) throws Exception {
        Query query = sessionFactory.getCurrentSession().createQuery("FROM Pokemon p JOIN p.Type t WHERE t.nomeT = :type");
        query.setParameter("type", type_name);
        List<Pokemon> pokemons = query.list();
        return pokemons;
    }

    @Override
    public List<Pokemon> findByMaxPs(int maxPs) throws Exception {
        Query query = sessionFactory.getCurrentSession().createQuery("FROM Pokemon p WHERE p.maxPs=:maxPs");
        query.setParameter("maxPs", maxPs);
        return (List<Pokemon>)query.list();
    }

    @Override
    public List<Pokemon> findBymaxAtk(int maxAtk) throws Exception {
        Query query = sessionFactory.getCurrentSession().createQuery("FROM Pokemon p WHERE p.maxAtk=:maxAtk");
        query.setParameter("maxAtk", maxAtk);
        return (List<Pokemon>)query.list();
    }

    @Override
    public List<Pokemon> findBymaxDef(int maxDef) throws Exception {
        Query query = sessionFactory.getCurrentSession().createQuery("FROM Pokemon p WHERE p.maxPs=:maxDef");
        query.setParameter("maxDef", maxDef);
        return (List<Pokemon>)query.list();
    }

    @Override
    public List<Pokemon> findBymaxSpAtk(int maxSpAtk) throws Exception {
        Query query = sessionFactory.getCurrentSession().createQuery("FROM Pokemon p WHERE p.maxSpAtk=:maxSpAtk");
        query.setParameter("maxSpAtk", maxSpAtk);
        return (List<Pokemon>)query.list();
    }

    @Override
    public List<Pokemon> findBymaxSpDef(int maxSpDef) throws Exception {
        Query query = sessionFactory.getCurrentSession().createQuery("FROM Pokemon p WHERE p.maxSpDef=:maxSpDef");
        query.setParameter("maxSpDef", maxSpDef);
        return (List<Pokemon>)query.list();
    }

    @Override
    public List<Pokemon> findBymaxSpd(int maxSpd) throws Exception {
        Query query = sessionFactory.getCurrentSession().createQuery("FROM Pokemon p WHERE p.maxSpd=:maxSpd");
        query.setParameter("maxSpd", maxSpd);
        return (List<Pokemon>)query.list();
    }

    @Override
    public List<Pokemon> findByOverall(int overall) throws Exception {
        Query query = sessionFactory.getCurrentSession().createQuery("FROM Pokemon p WHERE p.overall=:overall");
        query.setParameter("overall", overall);
        return (List<Pokemon>)query.list();
    }

    @Override
    public List<Pokemon> findByAnalogy(String analogy) throws Exception {
        Query query = sessionFactory.getCurrentSession().createQuery("FROM Pokemon p JOIN p.Category c WHERE c.analogy = :analogy");
        query.setParameter("analogy", analogy);
        return query.list();
    }

    @Override
    public Pokemon find(Pokemon pokemon) throws Exception {
        return (Pokemon)sessionFactory.getCurrentSession().get(Pokemon.class, pokemon);
    }

    @Override
    public List<Pokemon> findByStats(int maxPs, int maxAtk, int maxDef, int maxSpAtk, int maxSpDef, int maxSpd)
            throws Exception {
        String hql = "FROM Pokemon p "
                + "   WHERE p.maxPs = :maxPs AND p.maxAtk = :maxAtk AND maxDef = :maxDef "
                + "AND maxSpAtk = :maxSpAtk AND maxSpDef = :maxSpDef AND maxSpd = :maxSpd";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("maxPs", maxPs);
        query.setParameter("maxAtk", maxAtk);
        query.setParameter("maxDef", maxDef);
        query.setParameter("maxSpAtk", maxSpAtk);
        query.setParameter("maxSpDef", maxSpDef);
        query.setParameter("maxSpd", maxSpd);
        return query.list();
    }
    
}
