package com.wechatAuto.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wechatAuto.bean.Message;
import com.wechatAuto.db.DBAccess;

/**
 * Database actions based on TABLE MESSAGE
 */
public class MessageDao {
	/**
	 *	query message list according to requirements
	 */
	public List<Message> queryMessageList(String command, String description) {
		DBAccess dBAccess = new DBAccess();
		SqlSession sqlSession = null;
		List<Message> messageList = new ArrayList<>();
		try {
			Message message = new Message();
			message.setCommand(command);
			message.setDescription(description);
			sqlSession = dBAccess.getSqlSession();
			// execute SQL statement through sqlSession
			messageList = sqlSession.selectList("Message.queryMessageList", message);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return messageList;
	}
	
	public void deleteOne(int id) {
		DBAccess dBAccess = new DBAccess();
		SqlSession sqlSession = null;
		try {
			sqlSession = dBAccess.getSqlSession();
			// execute SQL statement through sqlSession
			sqlSession.delete("Message.deleteOne", id);
			sqlSession.commit();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return;
	}
	
	public static void main(String[] args) {
		MessageDao messageDao = new MessageDao();
		messageDao.queryMessageList("", "");
	}
	
	/**
	 *	query message list according to requirements
	 */
//	public List<Message> queryMessageList(String command, String description) {
//		List<Message> messageList = new ArrayList<>();
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Connection conn;
//		try {
//			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wechatautoresponder","root","123456");
//			// select
//			StringBuilder sb = new StringBuilder("select ID, COMMAND, DESCRIPTION, CONTENT from MESSAGE where 1=1");
//			List<String> paraList = new ArrayList<>();
//			// where command
//			if(command != null && !"".equals(command.trim())) {
//				sb.append(" and COMMAND = ?");
//				paraList.add(command);
//			}
//			// where description
//			if(description != null && !"".equals(description.trim())) {
//				sb.append(" and DESCRIPTION Like '%' ? '%'");
//				paraList.add(description);
//			}
//			// prepare
//			PreparedStatement ps = conn.prepareStatement(sb.toString());
//			
//			for (int i = 0; i < paraList.size(); i++) {
//				// ? in sql statment are counted from 1;
//				ps.setString(i + 1, paraList.get(i));
//			}
//			// execute
//			ResultSet rs = ps.executeQuery();
//			// fill out result list
//			while (rs.next()) {
//				Message message = new Message();
//				messageList.add(message);
//				message.setId(rs.getString("ID"));
//				message.setCommand(rs.getString("COMMAND"));
//				message.setDescription(rs.getString("DESCRIPTION"));
//				message.setContent(rs.getString("CONTENT"));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return messageList;
//	}
}
