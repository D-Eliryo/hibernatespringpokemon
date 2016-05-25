package it.eliryo.hibernatespring.pokemon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dario
 */

@Controller
@RequestMapping("/Category")
public class CategoryController {
    
    @RequestMapping("")
    public String gotoCategory(Model model)
    {
        model.addAttribute("sendMe", 2);
        return "index";
    }
}
