package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
* @author stevenxy E-mail:random_xy@163.com
* @Date 2018年5月25日
* @Description 
*/
public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("handleRequest()");
		return new ModelAndView("hello");
	}

}
