/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.eliryo.hibernatespring.pokemon.bo;

import it.eliryo.hibernatespring.pokemon.tables.Region;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dario
 */

@Transactional
public interface RegionBO {
    
    public List<Region> findAllRegions() throws Exception;
    
    public Region findByName(String regionName) throws Exception;
    
    public Region findBySimiliarity(String looksLike) throws Exception;
    
    public void save(Region region) throws Exception;
    
    public void update(Region region) throws Exception;   
    
    public void deleteByName(String regionName) throws Exception;
    
    public void delete(Region region) throws Exception;
    
}
