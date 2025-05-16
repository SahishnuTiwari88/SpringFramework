package springmvcsearch.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("Home view...");
		return "home";
	}
	
	@RequestMapping(path = "/search",method = RequestMethod.POST)
	public RedirectView search(@RequestParam("querybox") String query,Model model) {
		
		if(query.isBlank()) {
			
			RedirectView redirectView = new RedirectView();
			model.addAttribute("msg", "Please insert your query");
			redirectView.setUrl("home");
			return redirectView;
			
		}
		else {
		
		String url = "https://www.google.com/search?q="+query; //where search is url,q=query, it is a google search standard
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
//		String str = null;
//		System.out.println(str.length());
		return redirectView;
		}
		
	}
	
	//Handling expetion in spring
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR) //if we want to send status of the occuring error
//	@ExceptionHandler(value = NullPointerException.class)// it will only work if we encounter exception
//	public String exceptionHandler(Model m) {
//		m.addAttribute("msg", "Null Pointer Exception has occured");
//		return "null_page";
//	}
//	
//	@ExceptionHandler(value = NumberFormatException.class)// it will only work if we encounter exception
//	public String exceptionNumberFormat(Model m) {
//		m.addAttribute("msg", "Number Format Exception has occured");
//		return "null_page";
//	}
}
