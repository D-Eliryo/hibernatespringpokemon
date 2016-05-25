package it.eliryo.hibernatespring.pokemon.controller;

import it.eliryo.hibernatespring.pokemon.bo.CategoryBO;
import it.eliryo.hibernatespring.pokemon.tables.Category;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author dario
 */

@Controller
@RequestMapping("/Category")
public class CategoryController {
    
    @Autowired
    @Qualifier("categoryBo")
    CategoryBO categoryBO;
    
    @RequestMapping("")
    public String gotoCategory(Model model)
    {
        try
        {
            List categories = categoryBO.findAllCategories();
            model.addAttribute("categories", categories);
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.addAttribute("sendMe", 2);
        return "index";
    }
    
    @RequestMapping("/register")
    public String register(Model model){
        try
        {
            List categories = categoryBO.findAllCategories();
            model.addAttribute("categories", categories);
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.addAttribute("sendMe", 2);
        model.addAttribute("register", 1);
        return "/index";
    }
    
    @RequestMapping("/save")
    public String save(Model model, @RequestParam(value = "analogy", required = true) String analogy){
        List categories;
        Category category = new Category();
        if(analogy.contains("Pokémon") || analogy.contains("Pokèmon") ||
                analogy.contains("Pokemon") || analogy.contains("pokemon") ||
                analogy.contains("pokèmon") || analogy.contains("pokémon"))
        {
            try
            {
                categories = categoryBO.findAllCategories();
                model.addAttribute("categories", categories);
            } 
            catch (Exception ex) 
            {
                Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
            }
            model.addAttribute("sendMe", 2);
            model.addAttribute("register", 1);
            return "/index";
        }
        analogy = analogy + " Pokémon";
        category.setAnalogy(analogy);
        try
        {
            categoryBO.save(category);
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
            categories = categoryBO.findAllCategories();
            model.addAttribute("categories", categories);
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.addAttribute("sendMe", 2);
        return "/index";
    }
    
    @RequestMapping("/delete")
    public String delete(Model model, @RequestParam(value = "analogy", required = true) String analogy){
        List categories;
        try
        {
            categoryBO.delete(analogy);
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
            categories = categoryBO.findAllCategories();
            model.addAttribute("categories", categories);
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.addAttribute("sendMe", 2);
        return "/index";
        
    }
}
