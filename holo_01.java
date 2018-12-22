package holo_01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class holo_01
 */
@WebServlet("/holo_01")
public class holo_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public holo_01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		boolean boolAtari = false;
		boolean boolErr = false;
		int randval=(int)(Math.random()*2)+1;
		
		if(request.getParameter("sex")!=null)
		{
			String strSex = request.getParameter("sex");
			request.setAttribute("sex", strSex);
			if(strSex.equals("0"))
			{
				if(randval==0)
				{
					boolAtari = true;
				}
				else
				{
					boolAtari = false;
				}
			}
			else if(strSex.equals("1"))
			{
				if(randval==1)
				{
					 boolAtari=true;
				}
				else
				{
					boolAtari=false;
				}
			}
		}
		else
		{
			boolErr=true;
		}
		request.setAttribute("Atari", boolAtari);
		request.setAttribute("Err", boolErr);
		RequestDispatcher disp = request.getRequestDispatcher("result_01.jsp");
		disp.forward(request, response);
	}

}
