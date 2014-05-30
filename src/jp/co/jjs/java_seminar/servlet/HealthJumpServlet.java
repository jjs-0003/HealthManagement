package jp.co.jjs.java_seminar.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HealthJumpServlet
 */
@WebServlet("/HealthJumpServlet")
public class HealthJumpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HealthJumpServlet() {
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


	    String button = request.getParameter("button");

	    System.out.println(button);

	    switch (button) {
        case "一覧":

            break;
        case "記録":
            RequestDispatcher dipatcher = request
            .getRequestDispatcher("/HealthInsertServlet");
            dipatcher.forward(request, response);
            break;
        case "検索":

            break;
        case "BMI計算":

            break;
        default:
            break;
        }


	}

}
