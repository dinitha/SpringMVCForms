package com.forms.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.forms.model.Contact;
import com.forms.validators.ContactValidator;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {



	@RequestMapping(value = "/" )
	public ModelAndView test(HttpServletResponse response,@ModelAttribute( "contactmodel") Contact contact) throws IOException {

		return new ModelAndView("contact-form","contactmodel",new Contact());
	}

	/*@RequestMapping(value = "/view-contacts" ,method = RequestMethod.POST)
	public String addContact(@ModelAttribute( "contactmodel") Contact contact,BindingResult result ,Model model) throws IOException {
		//model.addAttribute("contactmodel",new Contact() );
		return "view-contacts";
	}*/

	@ModelAttribute("collegeList")
	public List<Contact.College> getCollegeList() {
		return Arrays.asList(Contact.College.values());
	}

	@RequestMapping(value = "/view-contacts", method = RequestMethod.POST)
	public String save(HttpServletRequest req,
					   @ModelAttribute("contactmodel") Contact contactCmd,
					   BindingResult bindResult, ModelMap model) {

		// validate
		 new ContactValidator().validate(contactCmd, bindResult);
		if (bindResult.hasErrors())
			return "contact-form";


		//model.addAttribute("id", id);
		return "redirect:view-contacts";

	}
}
