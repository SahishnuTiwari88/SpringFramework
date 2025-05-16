package springmvcsearch.entity;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter{

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		String name = request.getParameter("user");
		if(name.startsWith("s")) {
			response.setContentType("text/html");
			response.getWriter().println("Invalid name... Name should not start with S");
			return false;
		}
		System.out.println("This is pre handler");
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("This is post handler");
		super.postHandle(request, response, handler, modelAndView);
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("This is after completion handler");
		super.afterCompletion(request, response, handler, ex);
	}


	
	

}
