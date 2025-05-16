package springmvcsearch.exception;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice // gives information to spring mvc that it is a exception handling class
//if we get exception at any place in the project then this exception handling class will work
// this is centralized exception handler, it handle the exception occur in any controller in the entire project
public class exception {

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR) //if we want to send status of the occuring error
	@ExceptionHandler(value = NullPointerException.class)// it will only work if we encounter exception
	public String exceptionHandler(Model m) {
		m.addAttribute("msg", "Null Pointer Exception has occured");
		return "null_page";
	}
	
	@ExceptionHandler(value = NumberFormatException.class)// it will only work if we encounter exception
	public String exceptionNumberFormat(Model m) {
		m.addAttribute("msg", "Number Format Exception has occured");
		return "null_page";
	}
	@ExceptionHandler(value = Exception.class)// it will only work if we encounter exception
	public String genericException(Model m) {
		m.addAttribute("msg", "Exception has occured");
		return "null_page";
	}
	
}
