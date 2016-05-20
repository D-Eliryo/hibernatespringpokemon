package it.eliryo.hibernatespring.pokemon.bo;

import it.eliryo.hibernatespring.pokemon.tables.Pokemon;
import java.util.List;

/**
 *
 * @author dario
 */
public interface PokemonBO {
    
    public void save(Pokemon pokemon) throws Exception;
    
    public void update(Pokemon pokemon) throws Exception;
    
    public void deleteByName(String pokemon_name) throws Exception;
    
    public void delete(Pokemon pokemon) throws Exception;
    
    public List<Pokemon> findAllPokemons() throws Exception;
    
    public List<Pokemon> findByType(String type_name) throws Exception;
    
    public List<Pokemon> findByMaxPs(int maxPs) throws Exception;
    
    public List<Pokemon> findBymaxAtk(int maxAtk) throws Exception;
    
    public List<Pokemon> findBymaxDef(int maxDef) throws Exception;
    
    public List<Pokemon> findBymaxSpAtk(int maxSpAtk) throws Exception;
    
    public List<Pokemon> findBymaxSpDef(int maxSpDef) throws Exception;
    
    public List<Pokemon> findBymaxSpd(int maxSpd) throws Exception;
    
    public List<Pokemon> findByOverall(int overall) throws Exception;
    
    public List<Pokemon> findByAnalogy(String analogy) throws Exception;
    
    public Pokemon find(Pokemon pokemon) throws Exception;
    
    public List<Pokemon> findByStats(int maxPs, int maxAtk, int maxDef, int maxSpAtk, int maxSpDef, int maxSpd) throws Exception;
    
}
