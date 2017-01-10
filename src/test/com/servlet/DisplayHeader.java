package test.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayHeader
 */
@WebServlet("/DisplayHeader")
public class DisplayHeader extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayHeader() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String title = "Http Header Example";
        String docType = "<!DOCTYPE html> \n";
        out.println(docType + "<html>\n" + "<head><meta charset=\"utf-8\"><tilte>" + title + "</title></head>\n"
                + "<body bgcolor=\"#f0f0f0\">\n" + "<h1 align=\"center\">" + title + "</h1>\n"
                + "<table width=\"100%\" border=\"1\" align=\"center\">\n" + "<tr bgcolor=\"#949494\">\n"
                + "<th>Header name </th><th>Header value</th>\n" + "</tr>\n"
                + "<tr><td>" + request.getAttribute("name") + "</td>\n"
                + "<td>" + request.getAttribute("password") + "</td></tr>\n");
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            String paramName = (String)headerNames.nextElement();
            out.print("<tr><td>" + paramName + "</td>\n");
            String paramValue = request.getHeader(paramName);
            out.println("<td>" + paramValue + "</td></tr>\n");
        }
        out.println("</table>\n</body></html>");
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
