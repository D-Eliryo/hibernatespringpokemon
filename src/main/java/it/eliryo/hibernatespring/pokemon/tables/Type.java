/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.eliryo.hibernatespring.pokemon.tables;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

/**
 *
 * @author dario
 */

@Entity
public class Type implements Serializable {

//-------------------------ID E ATTRIBUTI DELLA TABELLA-----------------------//
    @Id
    @NotNull
    private String nomeT;

//------------------------------CHIAVI ESTERNE--------------------------------//    
   
    @OneToMany(mappedBy = "type")
    private Set<Pokemon> pokemons;

//----------------------------METODI DEL BEAN---------------------------------//

    public String getNomeT() {
        return nomeT;
    }

    public void setNomeT(String nomeT) {
        this.nomeT = nomeT;
    }
    
    public Set<Pokemon> getPokemons() {
        return pokemons;
    }
    
    public void setPokemons(Set<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
    
    public Type() {
        
    }
    
    
}
