package com.deloitte.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProcessRequestServlet
 */
@WebServlet("/process")
public class ProcessRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProcessRequestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String passwd = request.getParameter("passwd");
		
		UserBean userBean = new UserBean();
		boolean status = userBean.authenticate(username, passwd);
		if(status) {
			HttpSession session = request.getSession(true);
			session.setMaxInactiveInterval(10);
			//request.setAttribute("ub", userBean);
			//life is extended as long as session stays,here 10s
			session.setAttribute("ub", userBean);
			request.getRequestDispatcher("/homeSDyfg8732s.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("loginJDHF837297.jsp?flag=true").forward(request, response);
				}
		/*if (username != null && passwd != null) {
			if (username.equalsIgnoreCase("Swathi") && passwd.equals("123")) {
				request.getRequestDispatcher("/homeSDyfg8732s.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("loginJDHF837297.jsp?flag=true").forward(request, response);
			}
		}*/
	}

}
