package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PizzaOrder;

/**
 * Servlet implementation class pizzaOrderServlet
 */
@WebServlet("/pizzaOrderServlet")
public class pizzaOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pizzaOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerName = request.getParameter("orderName");
		String pizzaTopping = request.getParameter("topping");
		String size = request.getParameter("size");
		String quantityIn = request.getParameter("pizzaQty");
		int quantity = Integer.parseInt(quantityIn);
		
		PizzaOrder myPizza = new PizzaOrder(customerName, pizzaTopping, size, quantity);
		
		request.setAttribute("userOrder", myPizza);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
