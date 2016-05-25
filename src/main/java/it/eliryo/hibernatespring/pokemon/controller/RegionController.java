package it.eliryo.hibernatespring.pokemon.controller;

import it.eliryo.hibernatespring.pokemon.bo.RegionBO;
import it.eliryo.hibernatespring.pokemon.tables.Region;
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
@RequestMapping("/Region")
public class RegionController {
    
    @Autowired
    @Qualifier("regionBo")
    private RegionBO regionBO;
    
    @RequestMapping("")
    public String gotoRegion(Model model)
    {
        List regions;
        try{
            regions = regionBO.findAllRegions();
            model.addAttribute("regions", regions);
        } catch (Exception ex) {
            Logger.getLogger(RegionController.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.addAttribute("sendMe", 3);
        return "index";
    }
    
    @RequestMapping("/register")
    public String toRegister(Model model){
        try 
        {
            model.addAttribute("regions", regionBO.findAllRegions());
        }
        catch (Exception ex)
        {
            Logger.getLogger(TypeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.addAttribute("register", 1);
        model.addAttribute("sendMe", 3);
        return "index";
    }
    
    @RequestMapping("/save")
    public String save(Model model, @RequestParam(value = "nameR", required = true) String nameR, 
            @RequestParam(value = "looksLike", required = true) String looksLike){
        List regions;
        Region region = new Region();
        region.setLooksLike(looksLike);
        region.setNameR(nameR);
        try{
            regionBO.save(region);
            regions = regionBO.findAllRegions();
            model.addAttribute("regions", regions);
            model.addAttribute("sendMe", 3);
            return "index";
        } catch (Exception ex) {
            Logger.getLogger(RegionController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            regions = regionBO.findAllRegions();
            model.addAttribute("regions", regions);
        } catch (Exception ex) {
            Logger.getLogger(RegionController.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.addAttribute("sendMe", 3);
        return "index";
    }
    
    @RequestMapping("/delete")
    public String delete(Model model, @RequestParam(value = "regionName", required = true) String regionName){
        List regions;
        try
        {
            regionBO.deleteByName(regionName);
        }
        catch (Exception ex) 
        {
            Logger.getLogger(RegionController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
            regions = regionBO.findAllRegions();
            model.addAttribute("regions", regions);
        }
        catch (Exception ex)
        {
            Logger.getLogger(RegionController.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.addAttribute("sendMe", 3);
        return "index";
    }
}
