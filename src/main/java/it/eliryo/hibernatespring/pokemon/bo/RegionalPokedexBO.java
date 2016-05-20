package it.eliryo.hibernatespring.pokemon.bo;

import it.eliryo.hibernatespring.pokemon.tables.Pokemon;
import it.eliryo.hibernatespring.pokemon.tables.Region;
import it.eliryo.hibernatespring.pokemon.tables.RegionalPokedex;
import java.util.List;

/**
 *
 * @author dario
 */
public interface RegionalPokedexBO {

    
    public void save(RegionalPokedex regionalPokedex) throws Exception;
    
    public void delete(RegionalPokedex regionalPokedex) throws Exception;
    
    public void deleteByPos(int posRegPokedex) throws Exception;
    
    public void update(RegionalPokedex regionalPokedex) throws Exception;
    
    public List<RegionalPokedex> findAllRegionalPokedex() throws Exception;
    
    public List<Pokemon> findByRegionName(String regionName) throws Exception;
    
    public List<Region> findByPokemonName(String pokemonName) throws Exception;
    
    public List<Pokemon> findByRegion(Region region) throws Exception;
    
    public List<Region> findByPokemon(Pokemon pokemon) throws Exception;
    

    
}
