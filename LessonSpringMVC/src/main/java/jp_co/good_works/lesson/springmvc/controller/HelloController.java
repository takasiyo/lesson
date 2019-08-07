package jp_co.good_works.lesson.springmvc.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp_co.good_woks.lesson.HomeController;

@Controller
public class HelloController {

	
	
		@RequestMapping(value = "/hello", method = RequestMethod.GET)
		public String hello(Model model) {
			
			model.addAttribute("message", "Hello,Spring!" );
			
			return "hello";
		}
}
