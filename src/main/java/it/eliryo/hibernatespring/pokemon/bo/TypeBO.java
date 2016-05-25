package it.eliryo.hibernatespring.pokemon.bo;

import it.eliryo.hibernatespring.pokemon.tables.Type;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dario
 */

@Transactional
public interface TypeBO {
    
    public void save(Type type) throws Exception;
    
    public void update(Type type) throws Exception;
    
    public void delete(String nameType) throws Exception;
    
    public List<Type> findAllTypes() throws Exception;
    
    public Type findByName(String nameT) throws Exception;
    
}
