/**
 * 
 */
package com.codergabs;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * @author gabs
 *
 */


public class CheckAfterLoginController extends AbstractController {

	private String message;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		
		System.out.println("this is gabs controller");
		
		return new ModelAndView("afterLogin","welcomeMessage", message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
