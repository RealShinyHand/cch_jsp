package com.skj_personal.cch.controller;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.skj_personal.cch.service.menu.MenuService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping(path = {"/Menu"})
public class MenuController {

	private static final Logger logger = LoggerFactory.getLogger(MenuController.class);

	private final MenuService menuService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView index(HttpServletRequest request, Model model) {
		logger.info("Get", request.getLocalName());
		
		try {
			menuService.selectOne(1L);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/menu/index");
		mav.addObject("test", "test");
		
		return mav;
	}
	
	@PostMapping("/image")
    public String multiFileUpload(
            @RequestParam("multiFile") MultipartFile multipartFile,
            HttpServletRequest request
    ) {
		logger.info("multipartFiles");

        return "result";
    }
}
