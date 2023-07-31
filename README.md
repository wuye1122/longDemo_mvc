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

#### 启动扫描包的时候数组越界**  
* 原来代码： mysql这个包里面全都是com开头的 扫描太多了
`<context:component-scan base-package="com" />`
* 改后代码：
`<context:component-scan base-package="com.contorller,com.mapper,com.po,com.service" />`
* 报错：
`"file:/E:/Software/LocalWarehouse/mysql/mysql-connector-java/8.0.29/mysql-connector-java-8.0.29.jar!/com/mysql/cj/DataStoreMetadataImpl.class"
DataStoreMetadataImpl.class => ArrayIndexOutOfBoundsException`



##### springmvc 如何配置一个日志
  `   增加 log/并且删除 old cache WEB_INF/lib and class
  `
  
#### 如何启动并且开始访问

* Access first Page (check server)： http://localhost:8082/longDemo 
* Access new request (check db):     http://localhost:8082/longDemo/login/getAll


