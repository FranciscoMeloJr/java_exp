package com;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

    static int port = 8080;
	static int bufferSize = 100; //337680;
	static int responseSize = 10000;
	static String host = "localhost";
	static int new_buffer;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Get Request URL
	    
		StringBuffer requestURL = req.getRequestURL();
		String bf = "null";
		
		Map<String, String[]> paramsMap = req.getParameterMap();
		for (String key : paramsMap.keySet()) {
			if (key.equals("buffer"))
			  bf  = req.getParameter(key);
			  new_buffer = Integer.parseInt(bf);
		}
		resp.setBufferSize(bufferSize);
	    resp.setContentType("text/plain");
	    resp.setCharacterEncoding("UTF-8");
	    resp.setContentLength(new_buffer);//responseSize=bufferSize);
		
		PrintWriter pw = resp.getWriter();
		pw.append("\n BufferSize:" + bf + "\n Response Size:" + responseSize + '\n');
	    for (int i = 0; i < responseSize; i++) {
	        pw.append('X');
	    }
	    
        pw.close();
	}
	
	/*Original function - which works returning Hello, Mike*/
	public void doGet1(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        PrintWriter out = res.getWriter();
        out.write("Hello , Mike");
        out.close();
    }
	
}
