package com.wechatAuto.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wechatAuto.service.ListService;

@SuppressWarnings("serial")
public class DeleteBatchServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// set charSet or handle it by Filters
		req.setCharacterEncoding("UTF-8");
		
		// receive arguments from page
		String[] ids = req.getParameterValues("id");

		// call service 
		// and pass resulting message list to page
		ListService listService = new ListService();
		listService.deleteBatch(ids);
		
		// forward
		req.getRequestDispatcher("/List.action").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
}
