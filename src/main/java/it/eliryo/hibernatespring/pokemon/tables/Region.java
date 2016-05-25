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
public class Region implements Serializable {
    
//-----------------------ID E ATTRIBUTI DELLA TABELLA-------------------------//

    @Id
    @NotNull
    private String nameR;
    
    private String looksLike;

//-----------------------------CHIAVI ESTERNE---------------------------------//
    
    @OneToMany(mappedBy = "regPok_region")
    private Set<RegionalPokedex> regionalsR;

//---------------------------METODI DEL BEAN----------------------------------//
    
    public String getNameR() {
        return nameR;
    }

    public void setNameR(String nameR) {
        this.nameR = nameR;
    }

    public Set<RegionalPokedex> getRegionalsR() {
        return regionalsR;
    }

    public void setRegionalsR(Set<RegionalPokedex> regionalsR) {
        this.regionalsR = regionalsR;
    }

    public String getLooksLike() {
        return looksLike;
    }

    public void setLooksLike(String looksLike) {
        this.looksLike = looksLike;
    }
    
    public Region() {
    }

}
