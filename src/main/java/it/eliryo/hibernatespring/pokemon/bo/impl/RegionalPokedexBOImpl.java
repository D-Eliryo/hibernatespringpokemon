package it.eliryo.hibernatespring.pokemon.bo.impl;

import it.eliryo.hibernatespring.pokemon.bo.RegionalPokedexBO;
import it.eliryo.hibernatespring.pokemon.dao.RegionalPokedexDAO;
import it.eliryo.hibernatespring.pokemon.tables.Pokemon;
import it.eliryo.hibernatespring.pokemon.tables.Region;
import it.eliryo.hibernatespring.pokemon.tables.RegionalPokedex;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dario
 */

@Service
public class RegionalPokedexBOImpl implements RegionalPokedexBO {

    @Autowired
    private RegionalPokedexDAO regionalPokedexDao;
    
    @Override
    public void save(RegionalPokedex regionalPokedex) throws Exception {
        try
        {
            regionalPokedexDao.save(regionalPokedex);
        }
        catch(Exception e)
        {
            System.err.println("Error in RegionalPokedexBOImpl-save() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void delete(RegionalPokedex regionalPokedex) throws Exception {
        try
        {
            regionalPokedexDao.delete(regionalPokedex);
        }
        catch(Exception e)
        {
            System.err.println("Error in RegionalPokedexBOImpl-delete() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void deleteByPos(int posRegPokedex) throws Exception {
        try
        {
            regionalPokedexDao.deleteByPos(posRegPokedex);
        }
        catch(Exception e)
        {
            System.err.println("Error in RegionalPokedexBOImpl-deleteByPos() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(RegionalPokedex regionalPokedex) throws Exception {
        try
        {
            regionalPokedexDao.update(regionalPokedex);
        }
        catch(Exception e)
        {
            System.err.println("Error in RegionalPokedexBOImpl-update() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<RegionalPokedex> findAllRegionalPokedex() throws Exception {
        try
        {
            return regionalPokedexDao.findAllRegionalPokedex();
        }
        catch(Exception e)
        {
            System.err.println("Error in RegionalPokedexBOImpl-findAllRegionalPokedex() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Pokemon> findByRegionName(String regionName) throws Exception {
        try
        {
            return regionalPokedexDao.findByRegionName(regionName);
        }
        catch(Exception e)
        {
            System.err.println("Error in RegionalPokedexBOImpl-findByRegionName() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Region> findByPokemonName(String pokemonName) throws Exception {
        try
        {
            return regionalPokedexDao.findByPokemonName(pokemonName);
        }
        catch(Exception e)
        {
            System.err.println("Error in RegionalPokedexBOImpl-findByPokemonName() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Pokemon> findByRegion(Region region) throws Exception {
        try
        {
            return regionalPokedexDao.findByRegion(region);
        }
        catch(Exception e)
        {
            System.err.println("Error in RegionalPokedexBOImpl-findByRegion() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Region> findByPokemon(Pokemon pokemon) throws Exception {
        try
        {
            return regionalPokedexDao.findByPokemon(pokemon);
        }
        catch(Exception e)
        {
            System.err.println("Error in RegionalPokedexBOImpl-findByPokemon() Method");
            e.printStackTrace();
            throw e;
        }
    }
    
}
