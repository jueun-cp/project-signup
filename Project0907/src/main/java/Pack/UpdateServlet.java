package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")  // �ּ� �Է�â�� hello��� ���ٿ� ȣ���ϰԵǸ� doGet�Լ��� ȣ���ϰڴ�
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateServlet() {
        super();
        System.out.println("������ ��");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("update doGet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("update doPost");
		response.setContentType("text/html;charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		String id = request.getParameter("id");
		System.out.println(id);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
			out.println("<head>");
			
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>" + id + " ������" + "</h1>");
			out.println("</body>");
		out.println("</html>");
		out.close();
	}

}