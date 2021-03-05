package nirepaketea;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class KaixoMunduaHTML extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KaixoMunduaHTML() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		System.out.println("---> KaixoMundua servlet-ean sartzen...");
		
		//Metodo honek http erantzunetan idazteko aukera ematen digu 
		PrintWriter http_out = response.getWriter();
		Enumeration<String> eskaerarenGoiburuenIzenak = request.getHeaderNames();
		
		http_out.println("<html>");
		http_out.println("<head></head>");
		http_out.println("<body>");
		http_out.println("<p><strong>Kaixo Mundua</strong></p>");
		http_out.println("<br/><p><b>HTTP eskaeraren goiburuak</b></p><br/>");
		
		while(eskaerarenGoiburuenIzenak.hasMoreElements()) {
			String goiburuIzena = eskaerarenGoiburuenIzenak.nextElement();	//HOST
			String goiburuBalioa = (String) request.getHeader(goiburuIzena);	//localhost:8080
			http_out.println(goiburuIzena + ": " + goiburuBalioa);
			http_out.println("<br/>");
		}
		
		http_out.println("</body>");
		http_out.println("</html>");
				
		
		System.out.println("---> KaixoMundua servlet-etik ateratzen...");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
