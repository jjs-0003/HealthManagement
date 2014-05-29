package jp.co.jjs.java_seminar.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.jjs.java_seminar.beans.MyHealth;
import jp.co.jjs.java_seminar.dao.HealthManagementDAO;

/**
 * Servlet implementation class HealthSearchServlet
 */
@WebServlet("/HealthSearchServlet")
public class HealthSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HealthSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {


	   String minweight = request.getParameter("minweight");

	    System.out.println(minweight);


        ArrayList<MyHealth> healthlist = new ArrayList<>();
        HealthManagementDAO dao = new HealthManagementDAO();

        healthlist = dao.getHealth();


	}

}
