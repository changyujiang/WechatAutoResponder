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
* OGNL(mybatis配置文件) (struts2?) 

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

* table配置
    * 配置sql语句; namespace.id;
    * 配置java bean fields 和 database table column 对应关系;
    * jdbcType 和 database type 对应关系
    * configuration.xml \<mappers>\
    ```
    <resultMap type="com.wechatAuto.bean.Message" id="MessageResult">
    ```

* OGNL
    * OGNL取值范围
        * 标签的属性中
        * parameterType属性
        * foreach collection属性
    * 取值写法
        * String and primitive type  
            * _parameter
        * 自定义类型 User defined Objects eg. Message
            * 直接用属性名 eg. command
        * 集合 Collection
            * Array  :array 
            * List   :list 
            * Map    _parameter
        * 集合中取出一条数据 Fetch one entry from collection： 
            * array[index] (String[]); 
            * array[index].attribute (Message[]);
            * list[index] (List<String>);
            * list[index].attribute (List<Message>);
            * key (Map<String,String>);
            * key.attribute (Map<String,Message>).
        * 利用foreach标签从集合中取出数据 Get entries from collection using foreach lable：
            i: for array,list is index, for map is key
            ```
            <foreach collection="array" index="i" item="item">
            ```
    * 操作符
        * java 常用操作符 + - * / == != || &&
        * 自己特有的操作符 and, or, mod, in, not in
            