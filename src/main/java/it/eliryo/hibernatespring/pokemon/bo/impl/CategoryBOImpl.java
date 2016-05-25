package it.eliryo.hibernatespring.pokemon.bo.impl;

import it.eliryo.hibernatespring.pokemon.bo.CategoryBO;
import it.eliryo.hibernatespring.pokemon.dao.CategoryDAO;
import it.eliryo.hibernatespring.pokemon.tables.Category;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dario
 */

@Service
public class CategoryBOImpl implements CategoryBO {

    @Autowired
    private CategoryDAO categoryDao;
    
    @Override
    public void save(Category c) throws Exception {
        try
        {
            categoryDao.save(c);
        }
        catch(Exception e)
        {
            System.err.println("Error in CategoryBOImpl-save() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(Category c) throws Exception {
        try
        {
            categoryDao.update(c);
        }
        catch(Exception e)
        {
            System.err.println("Error in CategoryBOImpl-update() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void delete(String catName) throws Exception {
        try
        {
            categoryDao.delete(catName);
        }
        catch(Exception e)
        {
            System.err.println("Error in CategoryBOImpl-delete() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Category> findAllCategories() throws Exception {
        try
        {
            return categoryDao.findAllCategories();
        }
        catch(Exception e)
        {
            System.err.println("Error in CategoryBOImpl-findAllCategories() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Category findByName(String name) throws Exception {
        try
        {
            return categoryDao.findByName(name);
        }
        catch(Exception e)
        {
            System.err.println("Error in CategoryBOImpl-findByName() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Category find(Category category) throws Exception {
        try
        {
            return categoryDao.find(category);
        }
        catch(Exception e)
        {
            System.err.println("Error in CategoryBOImpl-find() Method");
            e.printStackTrace();
            throw e;
        }
    }
    
}
