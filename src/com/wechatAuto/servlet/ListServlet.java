package com.wechatAuto.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wechatAuto.service.ListService;

@SuppressWarnings("serial")
public class ListServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// set charset or handle it by Filters
		req.setCharacterEncoding("UTF-8");
		// receive args from page
		String command = req.getParameter("command");
		String description = req.getParameter("description");
		// pass args to page
		// 将接到的command,description放回到req,实现search之后的值保留
		req.setAttribute("command", command);
		req.setAttribute("description", description);		
		// call service 
		// and pass resulting message list to page
		ListService listService = new ListService();
		req.setAttribute("messageList", listService.queryMessageList(command, description));
		// forward
		req.getRequestDispatcher("/WEB-INF/jsp/back/list.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
	
}
