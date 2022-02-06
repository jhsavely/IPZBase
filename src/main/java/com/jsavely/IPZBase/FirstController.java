package com.jsavely.IPZBase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController{

    @GetMapping("/home")
	public String getMsg(Model model){
        model.addAttribute("msg", "this is a message from a controller");
		return "first";
	}
}
