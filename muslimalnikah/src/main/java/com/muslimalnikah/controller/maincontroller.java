package com.muslimalnikah.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.muslimalnikah.list.Gender;
import com.muslimalnikah.list.Nationality;
import com.muslimalnikah.list.Occupation;
import com.muslimalnikah.list.State;
import com.muslimalnikah.model.MemberDetailModel;
import com.muslimalnikah.model.RegisterUser;
import com.muslimalnikah.service.MemberService;

//To check Git Commands
@Controller
public class maincontroller {
	@Autowired
	MemberService memberService;
	 @RequestMapping(value = { "/"}, method = RequestMethod.GET)
		public String homePage(ModelMap model) {
		
		
			return "mainpage";
		}

		@RequestMapping(value = { "/profile"}, method = RequestMethod.GET)
		public String productsPage(ModelMap model,@ModelAttribute("memdetails")MemberDetailModel memdetails) {
			//List<com.muslimalnikah.list.Gender>genderlist= memberService.list();
			List<State> statelist=memberService.statelist();
			 //  List<Occupation> occlist=memberService.occlist();
			  List<Nationality> nationlist=memberService.nationlist();
			//model.addAttribute("gender",genderlist);
			model.addAttribute("statelist",statelist);
//			model.addAttribute("occlist",occlist);
            model.addAttribute("nationlist",nationlist);
//			
			
			
			return "profile";
		}

		@RequestMapping(value = { "/contactus"}, method = RequestMethod.GET)
		public String contactUsPage(ModelMap model) {
			return "contactus";
		}
		@RequestMapping(value = { "/aboutus"}, method = RequestMethod.GET)
		public String aboutUsPage(ModelMap model) {
			return "aboutus";
		}
}
