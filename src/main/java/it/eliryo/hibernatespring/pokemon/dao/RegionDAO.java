package it.eliryo.hibernatespring.pokemon.dao;

import it.eliryo.hibernatespring.pokemon.tables.Region;
import java.util.List;

/**
 *
 * @author dario
 */
public interface RegionDAO {
    
    public List<Region> findAllRegions() throws Exception;
    
    public Region findByName(String regionName) throws Exception;
    
    public Region findBySimiliarity(String looksLike) throws Exception;
    
    public void save(Region region) throws Exception;
    
    public void update(Region region) throws Exception;   
    
    public void deleteByName(String regionName) throws Exception;
    
    public void delete(Region region) throws Exception;
    
}