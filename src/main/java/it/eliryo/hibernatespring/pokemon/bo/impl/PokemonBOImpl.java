package it.eliryo.hibernatespring.pokemon.bo.impl;

import it.eliryo.hibernatespring.pokemon.bo.PokemonBO;
import it.eliryo.hibernatespring.pokemon.dao.PokemonDAO;
import it.eliryo.hibernatespring.pokemon.tables.Pokemon;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author dario
 */

@Service
public class PokemonBOImpl implements PokemonBO
{

    private PokemonDAO pokemonDao;
    
    @Override
    public void save(Pokemon pokemon) throws Exception {
        try
        {
            pokemonDao.save(pokemon);
        }
        catch(Exception e)
        {
            System.err.println("Error in PokemonBOImpl-save() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(Pokemon pokemon) throws Exception {
        try
        {
            pokemonDao.update(pokemon);
        }
        catch(Exception e)
        {
            System.err.println("Error in PokemonBOImpl-update() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void deleteByName(String pokemon_name) throws Exception {
        try
        {
            pokemonDao.deleteByName(pokemon_name);
        }
        catch(Exception e)
        {
            System.err.println("Error in PokemonBOImpl-deleteByName() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void delete(Pokemon pokemon) throws Exception {
        try
        {
            pokemonDao.delete(pokemon);
        }
        catch(Exception e)
        {
            System.err.println("Error in PokemonBOImpl-delete() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Pokemon> findAllPokemons() throws Exception {
        try
        {
            return pokemonDao.findAllPokemons();
        }
        catch(Exception e)
        {
            System.err.println("Error in PokemonBOImpl-findAllPokemons() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Pokemon> findByType(String type_name) throws Exception {
        try
        {
            return pokemonDao.findByType(type_name);
        }
        catch(Exception e)
        {
            System.err.println("Error in PokemonBOImpl-findByType() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Pokemon> findByMaxPs(int maxPs) throws Exception {
        try
        {
            return pokemonDao.findByMaxPs(maxPs);
        }
        catch(Exception e)
        {
            System.err.println("Error in PokemonBOImpl-findByMaxPs() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Pokemon> findBymaxAtk(int maxAtk) throws Exception {
        try
        {
            return pokemonDao.findBymaxAtk(maxAtk);
        }
        catch(Exception e)
        {
            System.err.println("Error in PokemonBOImpl-findByMaxAtk() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Pokemon> findBymaxDef(int maxDef) throws Exception {
        try
        {
            return pokemonDao.findBymaxDef(maxDef);
        }
        catch(Exception e)
        {
            System.err.println("Error in PokemonBOImpl-findByMaxDef() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Pokemon> findBymaxSpAtk(int maxSpAtk) throws Exception {
        try
        {
            return pokemonDao.findBymaxSpAtk(maxSpAtk);
        }
        catch(Exception e)
        {
            System.err.println("Error in PokemonBOImpl-findByMaxSpAtk() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Pokemon> findBymaxSpDef(int maxSpDef) throws Exception {
        try
        {
            return pokemonDao.findBymaxSpDef(maxSpDef);
        }
        catch(Exception e)
        {
            System.err.println("Error in PokemonBOImpl-findByMaxSpDef() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Pokemon> findBymaxSpd(int maxSpd) throws Exception {
        try
        {
            return pokemonDao.findBymaxSpd(maxSpd);
        }
        catch(Exception e)
        {
            System.err.println("Error in PokemonBOImpl-findByMaxSpd() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Pokemon> findByOverall(int overall) throws Exception {
        try
        {
            return pokemonDao.findByOverall(overall);
        }
        catch(Exception e)
        {
            System.err.println("Error in PokemonBOImpl-findByOverall() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Pokemon> findByAnalogy(String analogy) throws Exception {
        try
        {
            return pokemonDao.findByAnalogy(analogy);
        }
        catch(Exception e)
        {
            System.err.println("Error in PokemonBOImpl-findByAnalogy() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Pokemon find(Pokemon pokemon) throws Exception {
        try
        {
            return pokemonDao.find(pokemon);
        }
        catch(Exception e)
        {
            System.err.println("Error in PokemonBOImpl-find() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Pokemon> findByStats(int maxPs, int maxAtk, int maxDef, int maxSpAtk, int maxSpDef, int maxSpd) throws Exception {
        try
        {
            return pokemonDao.findByStats(maxPs, maxAtk, maxDef, maxSpAtk, maxSpDef, maxSpd);
        }
        catch(Exception e)
        {
            System.err.println("Error in PokemonBOImpl-findByStats() Method");
            e.printStackTrace();
            throw e;
        }
    }
    
}
