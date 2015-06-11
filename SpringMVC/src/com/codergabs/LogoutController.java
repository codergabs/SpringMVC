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


public class LogoutController extends AbstractController {

	private String message;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return new ModelAndView("logout","welcomeMessage", message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
