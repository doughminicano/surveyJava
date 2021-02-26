package com.Survey.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
    @RequestMapping("/")
    public String index(Model model, HttpSession session) {
    	model.addAttribute("name", (String) session.getAttribute("name"));
    	model.addAttribute("location", (String) session.getAttribute("location"));
    	model.addAttribute("lango", (String) session.getAttribute("lango"));
    	model.addAttribute("comment", (String) session.getAttribute("comment"));
		return "index.jsp";

    }
    
    @RequestMapping(value="/info", method=RequestMethod.POST)
    public String info(
    		@RequestParam(value="name") String name,
    		@RequestParam(value="location") String location,
    		@RequestParam(value="lango") String lango,
    		@RequestParam(value="comment") String comment,
    		HttpSession session) {
    	
    	session.setAttribute("name", name);
    	session.setAttribute("location", location);
    	session.setAttribute("lango", lango);
    	session.setAttribute("comment", comment);
    	
    	return "redirect:/info";
    	
    }
    
    @RequestMapping("/info")
    public String info() {
    	return "info.jsp";
    }
    
}
