/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.eliryo.hibernatespring.pokemon.bo;

import it.eliryo.hibernatespring.pokemon.tables.Type;
import java.util.List;

/**
 *
 * @author dario
 */
public interface TypeBO {
    
    public void save(Type type) throws Exception;
    
    public void update(Type type) throws Exception;
    
    public void delete(String nameType) throws Exception;
    
    public List<Type> findAllTypes() throws Exception;
    
    public Type findByName(String nameT) throws Exception;
    
}
