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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;


/**
 *
 * @author dario
 */

@Entity
public class Pokemon implements Serializable {
    
    
    
//-----------------------ID E ATTRIBUTI DELLA TABELLA-------------------------//
    
    @Id
    private String nomeP;
    
    private long posN;
    private String description;
    private int maxPs,maxAtk, maxDef, maxSpatk, maxSpdef, maxSpd, overall;
    
    
//---------------------------CHIAVI ESTERNE-----------------------------------//
    @NotNull
    @ManyToOne
    private Type type;
    
    @NotNull
    @OneToMany(mappedBy = "regPok_pokemon")
    private Set<RegionalPokedex> regionalsP;
    
    @NotNull
    @ManyToOne
    private Category analogy;

//------------------------METODI DEL BEAN-------------------------------------//
    
    public String getNomeP() {
        return nomeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public long getPosN() {
        return posN;
    }

    public void setPosN(long posN) {
        this.posN = posN;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getAnalogy() {
        return analogy;
    }

    public void setAnalogy(Category analogy) {
        this.analogy = analogy;
    }

    public int getMaxPs() {
        return maxPs;
    }

    public void setMaxPs(int maxPs) {
        this.maxPs = maxPs;
    }

    public int getMaxAtk() {
        return maxAtk;
    }

    public void setMaxAtk(int maxAtk) {
        this.maxAtk = maxAtk;
    }

    public int getMaxDef() {
        return maxDef;
    }

    public void setMaxDef(int maxDef) {
        this.maxDef = maxDef;
    }

    public int getMaxSpatk() {
        return maxSpatk;
    }

    public void setMaxSpatk(int maxSpatk) {
        this.maxSpatk = maxSpatk;
    }

    public int getMaxSpdef() {
        return maxSpdef;
    }

    public void setMaxSpdef(int maxSpdef) {
        this.maxSpdef = maxSpdef;
    }

    public int getMaxSpd() {
        return maxSpd;
    }

    public void setMaxSpd(int maxSpd) {
        this.maxSpd = maxSpd;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Set<RegionalPokedex> getRegionalsP() {
        return regionalsP;
    }

    public void setRegionalsP(Set<RegionalPokedex> regionalsP) {
        this.regionalsP = regionalsP;
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }
    
    public Pokemon() {
    }
    
}
