package jp.co.jjs.java_seminar.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.jjs.java_seminar.dao.HealthInsertDAO;

/**
 * Servlet implementation class HealthInsertServlet3
 */
@WebServlet("/HealthInsertServlet3")
public class HealthInsertServlet3 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HealthInsertServlet3() {
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


        HealthInsertDAO dao = new HealthInsertDAO();

        String height = (String) session.getAttribute("height");
        String weight = (String) session.getAttribute("weight");
        String sleeptime = (String) session.getAttribute("sleeptime");

        double minweight = Double.valueOf(weight).doubleValue();
        double minheight = Double.valueOf(height).doubleValue();
        double minsleeptime = Double.valueOf(sleeptime).doubleValue();

        dao.getHealthIns(minweight,minheight,minsleeptime);



        RequestDispatcher dipatcher = request
                .getRequestDispatcher("/WEB-INF/jsp/healthinsert/HealthInsertResult.jsp");
        dipatcher.forward(request, response);

    }

}
