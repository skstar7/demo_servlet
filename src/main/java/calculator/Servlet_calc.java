package calculator;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/calci")
public class Servlet_calc implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");

		double x = Double.parseDouble(num1);
		double y = Double.parseDouble(num2);

		String symbol = req.getParameter("btn");

		switch (symbol) {
		case "+":
			res.getWriter().print("	<h1>Additin of the two number is " + (x + y) + "</h1>");
			break;
		case "-":
			res.getWriter().print("	<h1>Subtraction of the two number is " + (x - y) + "</h1>");
			break;
		case "/":
			res.getWriter().print("	<h1>Division of the two number is " + (x / y) + "</h1>");
			break;
		case "*":
			res.getWriter().print("	<h1>Multiplication of the two number is " + (x * y) + "</h1>");
			break;

		default:
			break;
		}

	}

}
