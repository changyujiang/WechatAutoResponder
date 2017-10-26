## Wechat auto responder - learn Mybatis in parctice

### Basic function
* Receive commands from user
* Respond corresponding content back to user

### Modules
* 回复内容维护 Responding content maintainance
* 回复内容列表 Responding content list
* 回复内容删除 Responding content delete
* 聊天模块 Chat

### Structure
* 展示： JSP, JSTL, EL, JS/JQuery 
* 控制： Servlet, Java Bean
* 数据库： Mybatis/JDBC, MySQL

### Todo
* JSTL, EL 《java遇见html-jsp篇》

### Reviews
* sqlSession的作用:
    * 向sql语句传入参数;
    * 执行sql语句;
    * 获取执行sql语句的结果;
    * 事物的控制;

* 如何得到sqlSession:
    1. 通过配置文件获取数据库链接相关信息;
    2. 通过配置信息构建SqlSessionFactory;
    3. 通过SqlSessionFactory打开数据库会话SqlSession

* 单元测试