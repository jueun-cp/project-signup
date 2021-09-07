package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListServlet() {
    	super();
    	System.out.println("생성자 콜");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");		// 한글 안깨지게 넣어줘야함
		System.out.println("list doGet");
		// db에서 데이터를 얻어옴.
		String[] id = {"호랑이","사자","코끼리"};
		
		PrintWriter out = response.getWriter();		// html쓰기위해 out이름으로 객체생성 함
		out.println("<html>");		
		out.println("<head>");
		out.println("</head>");	
		out.println("<body>");

		out.println("<table border='1' width='300'>");
			out.println("<tr bgcolor='#ffff00'>");
			out.println("<td>이름</td>");
			out.println("<td>삭제</td>");
			out.println("<td>수정</td>");
			out.println("</tr>");
			
			for (int i = 0; i < id.length; i++) {
				out.println("<tr>");
				out.println("<td>"+ id[i] +"</td>");
//				<td><a href='delete?id=호랑이'>삭제</a></td>
//				<td><a href='delete?id=  +  호랑이  +  '>삭제</a></td>			
				out.print("<td><a href='delete?id="  +  id[i]  +  "'>삭제</a></td>");			
				out.print("<td><a href='update?id="  +  id[i]  +  "'>수정</a></td>");			
				out.println("</tr>");
			}
			
		out.println("</table>");

		out.println("</body>");
		out.println("</html>");		
		out.close();

		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");		// 한글 안깨지게 넣어줘야함
		System.out.println("list doPost");
	}

}