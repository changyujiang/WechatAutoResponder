package com.wechatAuto.service;

import java.util.List;

import com.wechatAuto.bean.Message;
import com.wechatAuto.dao.MessageDao;

/**
 * services relating to list
 */
public class ListService {
	public List<Message> queryMessageList(String command, String description) {
		MessageDao messageDao = new MessageDao();
		List<Message> messageList = messageDao.queryMessageList(command, description);
		return messageList;
	}
}
