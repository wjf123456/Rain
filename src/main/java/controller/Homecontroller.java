package controller;

import entity.RainQuality;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.RainQualityService;
import service.impl.RainQualityServiceImpl;


import javax.validation.Valid;
import java.util.List;

@Controller
public class Homecontroller {
    @Autowired
    private RainQualityService rainQualityService;
    @RequestMapping("/")
    public String select(Model model){
        model.addAttribute("rainList",rainQualityService.getAllRainQuality());
        return "select";
    }
    @RequestMapping("add")
    public String add(Model model){
        model.addAttribute(new RainQuality());
        model.addAttribute(rainQualityService.getAllRainQuality());
        return "add";
    }

    @RequestMapping(value = "adda",method = {RequestMethod.POST,RequestMethod.GET})
    public String adda(@Valid RainQuality student, Errors errors, @RequestParam(value = "cId",defaultValue ="1")Integer cId) {
        if (errors.hasErrors()) {
            return "add";
        }

        return "redirect:/";
    }
}











