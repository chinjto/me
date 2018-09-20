/**
 * 
 */
package fr.chinjto.web.me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author chinjto
 * @version 1.0
 *
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView getHome(){
		return new ModelAndView("home");
	}
	
}
