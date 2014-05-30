package jp.co.jjs.java_seminar.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.jjs.java_seminar.beans.MyHealth;
import jp.co.jjs.java_seminar.dao.HealthSearchDAO;

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

	    request.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html;charset=UTF-8");

	    String radio = request.getParameter("radio");
	    ArrayList<MyHealth> healthlist = new ArrayList<>();
	    HealthSearchDAO dao = new HealthSearchDAO();

	    switch (radio) {
        case "date":

            String month1 = request.getParameter("month1");
            String day1 = request.getParameter("day1");
            String date1 = month1 + day1;

            String month2 = request.getParameter("month2");
            String day2 = request.getParameter("day2");
            String date2 = month2 + day2;

            healthlist = dao.getHealthSearchDate(date1, date2);

            break;

        case "weight":

            double minweight = Double.valueOf(request.getParameter("minweight")).doubleValue();
            double maxweight = Double.valueOf(request.getParameter("maxweight")).doubleValue();

            healthlist = dao.getHealthSearchWeight(minweight, maxweight );

            break;

        case "sleeptime":

            double minsleeptime = Double.valueOf(request.getParameter("minsleeptime")).doubleValue();
            double maxsleeptime = Double.valueOf(request.getParameter("maxsleeptime")).doubleValue();

            healthlist = dao.getHealthSearchSleepTime(minsleeptime, maxsleeptime );

            break;
        case "bmi":

            double minbmi = Double.valueOf(request.getParameter("minbmi")).doubleValue();
            double maxbmi = Double.valueOf(request.getParameter("maxbmi")).doubleValue();

            healthlist = dao.getHealthSearchBmi(minbmi, maxbmi );

            break;

        default:
            break;
        }




        request.setAttribute("healthlist" , healthlist);

        RequestDispatcher dispacher = request
                .getRequestDispatcher("WEB-INF/jsp/healthsearch/healthsearchresult.jsp");
         dispacher.forward(request, response);


	}

}
