/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.eliryo.hibernatespring.pokemon.dao;

import it.eliryo.hibernatespring.pokemon.tables.Category;
import java.util.List;

/**
 *
 * @author dario
 */
public interface CategoryDAO {
    
    public void save(Category c) throws Exception;
    
    public void update(Category c) throws Exception;
    
    public void delete(String catName) throws Exception;
    
    public List<Category> findAllCategories() throws Exception;
    
    public Category findByName(String name) throws Exception;
    
    public Category find(Category category) throws Exception;
    
}
