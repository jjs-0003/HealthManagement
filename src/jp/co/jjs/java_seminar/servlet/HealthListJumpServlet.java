package jp.co.jjs.java_seminar.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.jjs.java_seminar.beans.MyHealth;
import jp.co.jjs.java_seminar.dao.HealthManagementDAO;

/**
 * Servlet implementation class HealthListJumpServlet
 */
@WebServlet("/HealthListJumpServlet")
public class HealthListJumpServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HealthListJumpServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        process(request, response);
    }

    private void process(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();


        int listId = Integer.parseInt(request.getParameter("health"));
        String jump = request.getParameter("listjump");
        String forward = "/WEB-INF/jsp/healthupdate/healthupdate.jsp";

        MyHealth health = new MyHealth();

        HealthManagementDAO dao = new HealthManagementDAO();

        health = dao.getRecord(listId);
        session.setAttribute("healthRecord", health);
        session.setAttribute("beforeId", listId);

        if(jump.equals("削除")){
            forward = "/WEB-INF/jsp/healthdelete/healthdelete.jsp";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
        dispatcher.forward(request, response);
    }

}
