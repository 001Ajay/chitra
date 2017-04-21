package chitra.web.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import chitra.web.form.ContactForm;

@RestController
@RequestMapping("/base")
public class BaseController {
	
	@RequestMapping("/check")
	public String checkString(){
		return "I am ready";
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact(){
		ModelAndView model = new ModelAndView("check","command",new ContactForm());		
		return model;
	}

	@RequestMapping(value = "/addContact", method = RequestMethod.POST)  
    public String addContact(@ModelAttribute("contact") ContactForm contact) {  
        //write the code here to add contact  
        return "sucess";  
    }
}
