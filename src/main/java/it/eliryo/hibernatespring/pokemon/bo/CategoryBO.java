package it.eliryo.hibernatespring.pokemon.bo;

import it.eliryo.hibernatespring.pokemon.tables.Category;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dario
 */

@Transactional
public interface CategoryBO {
    
    public void save(Category c) throws Exception;
    
    public void update(Category c) throws Exception;
    
    public void delete(String catName) throws Exception;
    
    public List<Category> findAllCategories() throws Exception;
    
    public Category findByName(String name) throws Exception;
    
    public Category find(Category category) throws Exception;
    
    
}
