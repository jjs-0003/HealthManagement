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
import jp.co.jjs.java_seminar.dao.HealthUpdateDAO;

/**
 * Servlet implementation class HealthUpdateCompleteServlet
 */
@WebServlet("/HealthUpdateCompleteServlet")
public class HealthUpdateCompleteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HealthUpdateCompleteServlet() {
        super();
        // TODO Auto-generated constructor stub
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

        MyHealth healthUp = new MyHealth();
        healthUp = (MyHealth) session.getAttribute("healthUp");

        String updateJump = request.getParameter("updateJump");
        String forward = "/WEB-INF/jsp/healthupdate/healthupdate.jsp";

        if (updateJump.equals("変更")) {
            int id = (int) session.getAttribute("beforeId");

            HealthUpdateDAO healthupdate = new HealthUpdateDAO();

            System.out.println(id);

            healthupdate.tableUpdate(healthUp, id);

            forward = "/WEB-INF/jsp/healthupdate/healthupdatecomp.jsp";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
        dispatcher.forward(request, response);
    }
}
