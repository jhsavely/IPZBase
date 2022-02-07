package com.jsavely.IPZBase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController{

    @GetMapping("/home")
	public String getMsg(
        @RequestParam(name = "name", required = false, defaultValue = " ello") 
        String msg,
        Model model){
        model.addAttribute("msg", msg);
		return "first";
	}
}
