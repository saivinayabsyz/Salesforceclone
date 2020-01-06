package main.java.com.absyz.core;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSetMetaData;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.swing.JOptionPane;
import org.apache.catalina.Server;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import main.java.com.absyz.service.Carts;
import main.java.com.absyz.service.LoginService;
import main.java.com.absyz.service.Orders;
import main.java.com.absyz.service.Products;
import main.java.com.absyz.service.UserRegistration;


// Extend HttpServlet cla
public class EcommerceServlet extends HttpServlet {
 
   private String message;

   public void init() throws ServletException {
      // Do required initialization
      message = "Hello Wold";
   }

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
	   try {
		
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   
   public void doPost(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException{
	   try {
		
	if (request.getParameter("serviceId").equals("cloneorg"))
		   {
			  
			String strOutput = RetrieveSample.startretrieve(request);
			response.setContentType("application/json");
			      // Actual logic goes here.
			      PrintWriter out = response.getWriter();
			      out.println("<h1>" + strOutput + "</h1>");
		   }
		    
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		      
}

   public void destroy() {
      // do nothing.
   }
   
  
}
