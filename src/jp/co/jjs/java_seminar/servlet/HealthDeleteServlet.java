package jp.co.jjs.java_seminar.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.jjs.java_seminar.dao.HealthDeleteDAO;

/**
 * Servlet implementation class HealthDeleteServlet
 */
@WebServlet("/HealthDeleteServlet")
public class HealthDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HealthDeleteServlet() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    process(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    process(request,response);
	}

    private void process(HttpServletRequest request,
            HttpServletResponse response)  throws ServletException, IOException {

        HttpSession session = request.getSession();

        HealthDeleteDAO dao = new HealthDeleteDAO();

        int id = (int)session.getAttribute("beforeId");
        String jump = request.getParameter("updatejump");
        String forward = "/WEB-INF/jsp/healthdeletecomp/healthdeletecomp.jsp";

        dao.recordDelete(id);

        if(jump.equals("一覧へ戻る")){
            forward = "HealthListServlet";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
        dispatcher.forward(request, response);
    }

}
