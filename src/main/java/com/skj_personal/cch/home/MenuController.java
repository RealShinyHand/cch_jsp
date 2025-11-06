package com.skj_personal.cch.home;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = {"/Menu"})
public class MenuController {

	private static final Logger logger = LoggerFactory.getLogger(MenuController.class);

	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request, Model model) {
		logger.info("Get", request.getLocalName());
		
		
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/menu/index");
		mav.addObject("test", "test");
		
		return mav;
	}
}
