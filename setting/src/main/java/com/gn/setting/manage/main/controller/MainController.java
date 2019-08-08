package com.gn.setting.manage.main.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gn.setting.HomeController;
import com.gn.setting.manage.main.dao.MainDAO;

/**
 * @Class MainController.java
 *	@Description MainController
 * <pre>
 *
 *      수정일                  수정자                   수정내용
 * --------------  -------     ---------------------
 *  2019. 8. 8.          hgb             최초작성
 *
 * </pre>
 * @author hgb
 * @version 0.0  
 * @see
 *
 */
@Controller
public class MainController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
		
	@Autowired
	MainDAO mainDAO;
	
	
	@RequestMapping("/home.do")
	public String home1(Locale locale, Model model) {
		
		String str = mainDAO.test();
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
