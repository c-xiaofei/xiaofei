package S;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.dao;
import DAO.daoimp;
import POGO.PG;

/**
 * Servlet implementation class s
 */
@WebServlet("/s")
public class s extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("我进来了");
		request.setCharacterEncoding("utf-8");
		
		String uname= request.getParameter("vv1");
		String upoos= request.getParameter("vv2");
		//int upoos=Integer.parseInt(request.getParameter("vv2"));
		
		PG p=new PG();
		daoimp d=new daoimp();
	
		p.setName(uname);
		
		p.setPassword(upoos);
		
		d.cun(p.getName(),p.getPassword());
		System.out.println(p.getName());
		System.out.println("创建成功");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
