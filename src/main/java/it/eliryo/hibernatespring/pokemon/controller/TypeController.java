package it.eliryo.hibernatespring.pokemon.controller;

import it.eliryo.hibernatespring.pokemon.bo.TypeBO;
import it.eliryo.hibernatespring.pokemon.tables.Type;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author dario
 */

@Controller
@RequestMapping("/Type")
public class TypeController {
    
    @Autowired
    @Qualifier("typeBo")
    private TypeBO typeBO;
    
    @RequestMapping("")
    public String gotoType(Model model)
    {
        List types;
        try {
            types = typeBO.findAllTypes();
            model.addAttribute("types", types);
        } catch (Exception ex) {
            Logger.getLogger(TypeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.addAttribute("sendMe", 1);
        return "index";
    }
    
    @RequestMapping("/register")
    public String toRegister(Model model)
    {
        try {
            model.addAttribute("types", typeBO.findAllTypes());
        } catch (Exception ex) {
            Logger.getLogger(TypeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.addAttribute("sendMe", 1);
        model.addAttribute("register", 1);
        return "index";
    }
    
    @RequestMapping("/save")
    public String register(@RequestParam(value = "nomeT", required = true) String nomeT,
            Model model)
    {
        Type type = new Type();
        type.setNomeT(nomeT);
        System.out.println("type: "+type);
        List types;
        try{
            System.out.println("Sono nel TRY");
            typeBO.save(type);
            System.out.println("Provo a salvare nel db Type");
            types = typeBO.findAllTypes();
            System.out.println("types gettati dal db: "+types);
            model.addAttribute("types", types);
            model.addAttribute("sendMe", 1);
            return "/index";
        }
        catch(Exception e)
        {
            System.err.println("Errore, something goes wrong");
            e.printStackTrace();
        }
        model.addAttribute("sendMe", 1);
        return "index";
    }
}
