package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterServlet() {
        super();
        System.out.println("register ������ȣ��");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("register doGet ȣ��");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("register doPost ȣ��");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("id");
		System.out.println(id);
		
		PrintWriter out = response.getWriter();

		out.println("<html>" 
				+"<body>" 
				+"<h1>"+id+"�� ȸ������ �Ϸ�Ǿ����ϴ�.</h1>"
				+"</body>" 
				+"</html>" );
		System.out.println(id);
		out.close();
	}

}
