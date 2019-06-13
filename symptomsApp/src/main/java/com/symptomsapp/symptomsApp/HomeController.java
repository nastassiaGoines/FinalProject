package com.symptomsapp.symptomsApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		
		RestTemplate rt = new RestTemplate();
		//SympResult quote = rt.getForObject("https://gturnquist-quoters.cfapps.io/api/random", QuoteResult.class);
	
		
		
		return new ModelAndView("index");
	}

}
