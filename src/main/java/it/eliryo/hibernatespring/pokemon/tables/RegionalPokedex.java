/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.eliryo.hibernatespring.pokemon.tables;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 *
 * @author dario
 */

@Entity
public class RegionalPokedex implements Serializable {
    
//-----------------------ID E ATTRIBUTI DELLA TABELLA-------------------------//

    @Id
    private int posR;
    
//-----------------------------CHIAVI ESTERNE---------------------------------//

    @NotNull
    @ManyToOne
    private Pokemon regPok_pokemon;

    @NotNull
    @ManyToOne
    private Region regPok_region;

//-----------------------------METODI DEL BEAN--------------------------------//
    
    public long getPosR() {
        return posR;
    }

    public void setPosR(int posR) {
        this.posR = posR;
    }

    public Pokemon getRegPok_pokemon() {
        return regPok_pokemon;
    }

    public void setRegPok_pokemon(Pokemon regPok_pokemon) {
        this.regPok_pokemon = regPok_pokemon;
    }

    public Region getRegPok_region() {
        return regPok_region;
    }

    public void setRegPok_region(Region regPok_region) {
        this.regPok_region = regPok_region;
    }
    
    public RegionalPokedex() {
    }
    
}
