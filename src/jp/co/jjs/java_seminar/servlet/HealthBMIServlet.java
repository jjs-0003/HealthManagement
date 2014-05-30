package jp.co.jjs.java_seminar.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HealthBMIServlet
 */
@WebServlet("/HealthBMIServlet")
public class HealthBMIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HealthBMIServlet() {
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

	    double height = Double.valueOf(request.getParameter("height")).doubleValue();
        double weight = Double.valueOf(request.getParameter("weight")).doubleValue();
        double bmi = 0;
        String message = "";

        //ArrayList<MyHealth> healthlist = new ArrayList<>();
        //HealthSearchDAO dao = new HealthSearchDAO();

        // healthlist = dao.getHealthSearchDate(date1, date2);

        bmi = weight / (height * height);

        if (bmi >= 30) {
            message = "高度肥満";
        } else if (bmi >= 25 && bmi <30) {
            message = "肥満";
        } else if (bmi >= 18.5 && bmi <25) {
            message = "普通";
        } else {
            message = "やせ";
        }

        ;

        request.setAttribute("bmi", Math.floor(bmi));
        request.setAttribute("message", message);

        RequestDispatcher dispacher = request
                .getRequestDispatcher("WEB-INF/jsp/healthbmi/healthbmiresult.jsp");
         dispacher.forward(request, response);




	}

}
