package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PotatoOrder;

/**
 * Servlet implementation class potatoOrderServlet
 */
@WebServlet("/potatoOrderServlet")
public class potatoOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public potatoOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerName = request.getParameter("orderName");
		String potatoStyle = request.getParameter("potatoStyle");
		String size = request.getParameter("size");
		String quantityIn = request.getParameter("potatoQty");
		int quantity = Integer.parseInt(quantityIn);
		
		PotatoOrder potatoOrder = new PotatoOrder(customerName, potatoStyle, quantity, size);
		
		request.setAttribute("userOrder", potatoOrder);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
		}

}
