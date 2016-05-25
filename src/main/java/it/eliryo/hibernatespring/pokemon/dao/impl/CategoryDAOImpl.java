/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.eliryo.hibernatespring.pokemon.dao.impl;

import it.eliryo.hibernatespring.pokemon.dao.CategoryDAO;
import it.eliryo.hibernatespring.pokemon.tables.Category;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dario
 */

@Repository
public class CategoryDAOImpl implements CategoryDAO {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void save(Category c) throws Exception {
        sessionFactory.getCurrentSession().save(c);
    }

    @Override
    public void update(Category c) throws Exception {
        sessionFactory.getCurrentSession().saveOrUpdate(c);
    }

    @Override
    public void delete(String catName) throws Exception {
        Category category = (Category) sessionFactory.getCurrentSession().get(Category.class, catName);
        sessionFactory.getCurrentSession().delete(category);
    }

    @Override
    public List<Category> findAllCategories() throws Exception {
        return sessionFactory.getCurrentSession().createQuery("FROM Category").list();
    }

    @Override
    public Category findByName(String name) throws Exception {
        return (Category) sessionFactory.getCurrentSession().get(Category.class, name);
    }

    @Override
    public Category find(Category category) throws Exception {
        return (Category) sessionFactory.getCurrentSession().get(Category.class, category);
    }
    
}
