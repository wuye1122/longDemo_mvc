
```
这个是一个spring的项目 还有webapp的文件夹

```
#### 如何启动并且开始访问

1. 直接刷新pom文件  
2. 更改数据库密码 并且创建数据库
```mysql
create database test;

create table test.`department`
(
    `d_id`         int         not null auto_increment,
    `d_department` varchar(32) not null,
    `d_name`       varchar(32) not null,
    `create_time`  timestamp   not null default current_timestamp,
    `update_time`  timestamp   not null default current_timestamp on update current_timestamp,
    primary key (`d_id`)
);

INSERT INTO test.department (d_department, d_name, create_time, update_time) VALUES ('test', 'lemon', DEFAULT, DEFAULT)

```

3. 日志级别debug
4. 重新删除target 重新设置jdk1.8 进行编译

```shell

/usr/local/apache-maven-3.9.6/bin/mvn jetty:run -Djava.home=/Library/java/JavaVirtualMachines/jdk-1.8.jdk/Contents/Home/

配置完环境变量
mvn jetty:run 

```

//不需要加项目名称？
* can access http://localhost:8014/;
* Access first Page (check server)： 
* Access new request (check db):
1. http://localhost:8014/login/index
2. http://localhost:8014/login/get
3. http://localhost:8014/login/getAll

#### :book: 1000个人读红楼梦有1000个林黛玉,一个我怎么每次创建ssm都会遇到不同的"林黛玉"呢？

* spring和jdk版本是否兼容,规律？
* tomcat启动原理,项目如何发布到容器当中
* spring的配置的每个配置的作用web.xml/applicalContext.xml/mvc-config.xml,如果不这样会怎么样会报错么？
* 天天乱码？为什么乱码
* 切换不同的容器 tocmat/jetty

#### :book: 防止老年痴呆 两个 
 
 * responsedBody : login/get
 * views : login/getAll    
                            
#### windows 重新安装git 
做完系统之后需要重新操作//复习一下 安装的命令  
* 如何配置git

* 如何将本地和远程关联起来
#### 不同版本的mysql的驱动和包不一致 详情请见提交记录
* MySQL8.0.29

#### 启动扫描包的时候数组越界 
* 原来代码： mysql这个包里面全都是com开头的 扫描太多了
`<context:component-scan base-package="com" />`
* 改后代码：
`<context:component-scan base-package="com.contorller,com.mapper,com.po,com.service" />`
* 报错：
`"file:/E:/Software/LocalWarehouse/mysql/mysql-connector-java/8.0.29/mysql-connector-java-8.0.29.jar!/com/mysql/cj/DataStoreMetadataImpl.class"
DataStoreMetadataImpl.class => ArrayIndexOutOfBoundsException`



##### springmvc 如何配置一个日志

* 增加 log/并且删除 old cache WEB_INF/lib and class
* 想修改mybatis日志 查询源码：
  eg： 比如代码里面 “Creating a new SqlSession” 都是debug，这种直接想error打印出来，从侵入性和用法貌似都不合理
     -》org.apache.commons.logging.impl.Log4JLogger
     https://blog.csdn.net/yuandfeng/article/details/126921980

     了解日志级别 TRACE 使用这个可以有效查看源码 TRACE < DEBUG，

     mybatis.xml setting 如何注入？ 
     mybatis和sqlSessionFactory 关系=》 SqlSessionFactoryBean
  
        <bean id="ucdsSqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
        <property name="dataSource" ref="dataSource"/>

        <!-- 加载mybatis.xml的核心配置文件 -->
        <property name="configLocation" value="classpath:mybatis.xml" />
       </bean>
      

       <!-- mybatis.xml 配置如下 --> 
      <settings>
          <setting name="logImpl" value="LOG4J"/> 
      </settings> 

* 查看源码，关键字***command+⬆️+F***
  
源码日志：
code： `<setting name="logImpl" value="LOG4J"/>`

 org.apache.ibatis.logging.LogFactory.setImplementation(LogFactory.java:115) 
    - Logging initialized using 'class org.apache.ibatis.logging.log4j.Log4jImpl' adapter.
 
org.apache.ibatis.logging.commons.JakartaCommonsLoggingImpl.debug(JakartaCommonsLoggingImpl.java:46) 
    - - Parsed configuration file: 'class path resource [mybatis.xml]'

使用的这个类进行处理后续的日志：Log4jImpl
config： log4j.properties如何注入的
  
  只需要 log4j.logger. + your mapper class package :
  eg: 网上的例子 和网上的包名 看的细节一点可以么 ~~org.mybatis~~
  
      package org.mybatis.example;
      public interface BlogMapper {
      @Select("SELECT * FROM blog WHERE id = #{id}")
      Blog selectBlog(int id);
      }
    
      log4j.logger.org.mybatis.example.BlogMapper=TRACE


  sql的结果就如何设置的？

      某些查询可能会返回庞大的结果集，此时只想记录其执行的 SQL 语句而不想记录结果该怎么办？
      为此，Mybatis 中 SQL 语句的日志级别被设为DEBUG（JDK 日志设为 FINE），结果的日志级别为 TRACE
      结果发现还是不能打印出来trace 发现源码当中 repository.isDisabled(level.level) 直接不支持
      我在想是不是log4j配置的问题？
      我在想是不是log4j配置的问题？
      找了大半天，首先想输出日志： 
    
      log4j.root=trace / log4j.mapper 这俩一层的  //  有一个trace
    
      log4j.appender.consoleAppender.Threshold=trace // 显示仓库介质
     

