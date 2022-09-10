package com.test;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/exp1")
public class exp1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public exp1() {
    	System.out.println("hai");
       
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("hai");	
	}

	
	public void destroy() {
		System.out.println("hai");	
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hai");	
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hai");	
	}

}
