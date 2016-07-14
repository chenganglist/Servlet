// Import required java libraries
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
// Extend HttpServlet class
public class helloServlet extends HttpServlet {
 
  private String message;
 
  public void init() throws ServletException
  {
      // Do required initialization
      message = "Hello World";
  }
 
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // Set response content type
      response.setContentType("text/html");
      
      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      //out.println(request);
      out.println(message);
  }

  public void doPost(HttpServletRequest request,
                   HttpServletResponse response)
    throws ServletException, IOException 
  {
      //HashMap<String, String> hashMap = new HashMap<String, String>();  
      // Servlet 代码
      // Set response content type
      response.setContentType("text/html");
      
      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      //out.println(request);
      //out.println(request.getParameter("username"));
      //out.println(request.getParameter("password"));
      Enumeration paramNames = request.getParameterNames();
      out.println("{");
      while(paramNames.hasMoreElements()) 
      {
          String paramName = (String)paramNames.nextElement();
          out.print("paramName:");
          String[] paramValues = request.getParameterValues(paramName);
          // 读取单个值的数据
          if (paramValues.length == 1) 
          {
                String paramValue = paramValues[0];
                if (paramValue.length() == 0)
                  out.println("没有值,");
                else
                  out.println("paramValue,");
          }else 
          {
                // 读取多个值的数据
                out.println("[");
                for(int i=0; i < paramValues.length; i++) 
                {
                    out.println(paramValues[i]+",");
                }
                out.println("]");
          }
      }
      out.println("}");
      //out.println(message);
  }
  
  public void destroy()
  {
      // do nothing.
  }

}