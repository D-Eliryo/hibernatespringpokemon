/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.eliryo.hibernatespring.pokemon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dario
 */

@Controller
public class StartupController {
    
    @RequestMapping(value = {"/", "/home", "/index"})
    public String start(Model model)
    {
        model.addAttribute("sendMe", 0);
        return "index";
    }
    
    @RequestMapping("/Type")
    public String gotoType(Model model)
    {
        model.addAttribute("sendMe", 1);
        return "index";
    }
    
    @RequestMapping("/Category")
    public String gotoCategory(Model model)
    {
        model.addAttribute("sendMe", 2);
        return "index";
    }
    
    @RequestMapping("/Region")
    public String gotoRegion(Model model)
    {
        model.addAttribute("sendMe", 3);
        return "index";
    }
    @RequestMapping("/Pokemon")
    public String gotoPokemon(Model model)
    {
        model.addAttribute("sendMe", 4);
        return "index";
    }
    @RequestMapping("/RegionalPokedex")
    public String gotoRegionalPokedex(Model model)
    {
        model.addAttribute("sendMe", 5);
        return "index";
    }
    
}
