package nirepaketea;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("--> MainServlet-ean sartzen...");
		
		response.setHeader("Cache-control", "no-cache");
		
		if(request.getSession(false) == null) {
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/login_form.jsp");
			rd.forward(request, response);
		}
		else {	//erabiltzaileak saioa sortuta du
			System.out.println("--> User is logged : redirecting to welcome.jsp");
			RequestDispatcher rd = request.getRequestDispatcher("/jsp/welcome.jsp");
			rd.forward(request, response);
		}
		
		System.out.println("--> MainServletik ateratzen...");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
