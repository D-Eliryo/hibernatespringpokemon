package it.eliryo.hibernatespring.pokemon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dario
 */

@Controller
@RequestMapping("/RegionalPokedex")
public class RegionalPokedexController {
    
    @RequestMapping("")
    public String gotoRegionalPokedex(Model model)
    {
        model.addAttribute("sendMe", 5);
        return "index";
    }
    
}
