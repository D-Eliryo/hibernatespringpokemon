package it.eliryo.hibernatespring.pokemon.tables;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author dario
 */

@Entity
public class Category implements Serializable {
   
//-----------------------ID E ATTRIBUTI DELLA TABELLA-------------------------//

    @Id
    private String analogy;
    
//-----------------------------CHIAVI ESTERNE------.--------------------------//

    @OneToMany(mappedBy = "analogy")
    private Set<Pokemon> pokemons;
    
//----------------------------METODI DEL BEAN---------------------------------//

    public String getAnalogy() {
        return analogy;
    }

    public void setAnalogy(String analogy) {
        this.analogy = analogy;
    }
    
    public Set<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(Set<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
    
    public Category() {
    }
    
}
