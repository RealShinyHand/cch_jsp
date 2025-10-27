package com.skj_personal.cch.home;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skj_personal.cch.home.service.HomeService;

import lombok.RequiredArgsConstructor;

/**
 * Handles requests for the application home page.
 */
@RequiredArgsConstructor
@Controller
@RequestMapping(path = {"/home","/"})
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	private final HomeService homeService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView index(Locale locale,HttpServletRequest request, Model model) {
		logger.info("Get", request.getLocalName());
		
		
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/home/index");
		mav.addObject("test", "test");
		
		return mav;
	}

}
