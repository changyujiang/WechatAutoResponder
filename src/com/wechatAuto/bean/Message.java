package com.wechatAuto.bean;

/**
 * Java bean entity corresponding to MESSAGE tabe
 */
public class Message {
	/**
	 * primary key
	 */
	private String id;
	/**
	 * COMMAND
	 */
	private String command;
	/**
	 * DESCRIPTION
	 */
	private String description;
	/**
	 * CONTENT
	 */
	private String content;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
