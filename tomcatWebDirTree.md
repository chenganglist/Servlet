Servlet目录结构为:

      Servlet

           | ---- index.html

           | ---- WEB-INF

                     | ---- classes 

                                | ---- FirstServlet.java

                                | ---- edu.servlet.FirstServlet.class

                     | ---- lib

                     | ---- web.xml


在web.xml中编写servlet的映射文件

    <servlet>
        <servlet-name>firstServlet</servlet-name>
        <servlet-class>edu.servlet.FirstServlet</servlet-class>
        <load-on-startup>0</load-on-startup>
    </servlet>

    <servlet-mapping>
        <servlet-name>firstServlet</servlet-name>
        <url-pattern>/first.do</url-pattern>
    </servlet-mapping>


每次修改代码需要重启tomcat

