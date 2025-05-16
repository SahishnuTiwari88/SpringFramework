package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvcsearch.entity.StudentEntity;

@Controller
public class ComplexFormController {
	
	@RequestMapping("/complex")
	public String form() {
		return "complex_form";
	}
	
	@RequestMapping(path = "/handle", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") StudentEntity student,BindingResult result) {
		if(result.hasErrors()) { //hasErrors()	check if there is any error on the entire form		
			return "complex_form";
		}
		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";
	}

}
//to handle the error we have a library named BindingResult, it helps in finding whether there is some errors in the form 
//we are submitting, in order to show that error msg on the page we have to use spring's form taglib library on the page where we
// want to display our data/msg(in this case it is complex_form.jsp) b/c if there is error we redirect it to same form in order
//to correct the error