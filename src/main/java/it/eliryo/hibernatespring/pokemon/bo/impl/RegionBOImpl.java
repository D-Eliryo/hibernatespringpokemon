package it.eliryo.hibernatespring.pokemon.bo.impl;

import it.eliryo.hibernatespring.pokemon.bo.RegionBO;
import it.eliryo.hibernatespring.pokemon.dao.RegionDAO;
import it.eliryo.hibernatespring.pokemon.tables.Region;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dario
 */

@Service
public class RegionBOImpl implements RegionBO {

    @Autowired
    private RegionDAO regionDao;
    
    @Override
    public List<Region> findAllRegions() throws Exception {
        try
        {
            return regionDao.findAllRegions();
        }
        catch(Exception e)
        {
            System.err.println("Error in RegionBOImpl-findAllRegions() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Region findByName(String regionName) throws Exception {
        try
        {
            return regionDao.findByName(regionName);
        }
        catch(Exception e)
        {
            System.err.println("Error in RegionBOImpl-findByName() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Region findBySimiliarity(String looksLike) throws Exception {
        try
        {
            return regionDao.findBySimiliarity(looksLike);
        }
        catch(Exception e)
        {
            System.err.println("Error in RegionBOImpl-findBySimiliarity() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void save(Region region) throws Exception {
        try
        {
            regionDao.save(region);
        }
        catch(Exception e)
        {
            System.err.println("Error in RegionBOImpl-save() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(Region region) throws Exception {
        try
        {
            regionDao.update(region);
        }
        catch(Exception e)
        {
            System.err.println("Error in RegionBOImpl-update() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void deleteByName(String regionName) throws Exception {
        try
        {
            regionDao.deleteByName(regionName);
        }
        catch(Exception e)
        {
            System.err.println("Error in RegionBOImpl-deleteByName() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void delete(Region region) throws Exception {
        try
        {
            regionDao.delete(region);
        }
        catch(Exception e)
        {
            System.err.println("Error in RegionBOImpl-delete() Method");
            e.printStackTrace();
            throw e;
        }
    }
    
}
