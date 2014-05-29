package jp.co.jjs.java_seminar.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HealthUpdateComfirmServlet
 */
@WebServlet("/HealthUpdateComfirmServlet")
public class HealthUpdateComfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HealthUpdateComfirmServlet() {
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
            HttpServletResponse response) throws ServletException, IOException{

        HttpSession session = request.getSession();

        int recordId = Integer.parseInt(request.getParameter("healthRecodeUpdateId"));
        String recordHeight = request.getParameter("healthRecordHeight");
        String recordWeight = request.getParameter("healthRecordWeight");
        String sleepTime = request.getParameter("healthRecordSleepTime");

        String updateJump = request.getParameter("updatejump");
        String forward =  "/WEB-INF/jsp/healthupdate/healthupdateconfirm.jsp";


        session.setAttribute("healthRecodeUpdateId", recordId);
        session.setAttribute("healthRecordHeight", recordHeight);
        session.setAttribute("healthRecordWeight", recordWeight);
        session.setAttribute("healthRecordSleepTime", sleepTime);

        if(updateJump.equals("一覧へ戻る")){
            forward = "/WEB-INF/jsp/healthlist/healthlist.jsp";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(forward);
        dispatcher.forward(request, response);
    }

}
