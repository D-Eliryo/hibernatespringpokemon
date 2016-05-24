package it.eliryo.hibernatespring.pokemon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dario
 */

@Controller
@RequestMapping("/Pokemon")
public class PokemonController {
    
    @RequestMapping("")
    public String gotoPokemon(Model model)
    {
        model.addAttribute("sendMe", 4);
        return "index";
    }
    
}
