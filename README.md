简书地址：https://www.jianshu.com/p/8827a03d9bdb

1、搭建maven项目

![image.png](https://upload-images.jianshu.io/upload_images/2370478-1bfde372ad125dde.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
第二步：

![image.png](https://upload-images.jianshu.io/upload_images/2370478-8210a7fb56762efa.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


第三步，GroupID ---项目工程ID ，ArtifaceID----模版ID

第四步，选择Maven的版本，配置文件和Maven存放位置（这个可以忽略，直接下一步）
Maven home directory：选择maven版本（这里面IDEA包含两个版本）
User setting file： 选择你的Maven配置文件（其中包含镜像<推荐换成阿里镜像>）
Local repository：选择后面需要存放的maven依赖的位置（自己新建的文件夹的）创建完成：

![image.png](https://upload-images.jianshu.io/upload_images/2370478-bc4c3586bd936d52.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


创建项目工程目录：

 ![image](http://upload-images.jianshu.io/upload_images/2370478-5a345a32db840f64.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

**pom.xml**
```
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
<modelVersion>4.0.0</modelVersion>
<groupId>SSMCreater</groupId>
<artifactId>com.kevenwu.ssmcreater</artifactId>
<packaging>war</packaging>
<version>1.0-SNAPSHOT</version>
<name>com.lx.ssmcreater Maven Webapp</name>
<url>http://maven.apache.org</url>

<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
    <!-- spring版本号 -->
    <spring.version>4.2.5.RELEASE</spring.version>
    <!-- mybatis版本号 -->
    <mybatis.version>3.2.8</mybatis.version>
    <!-- mysql驱动版本号 -->
    <mysql-driver.version>5.1.29</mysql-driver.version>
</properties>

<dependencies>

    <!-- 添加spring核心依赖 -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>${spring.version}</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-web</artifactId>
        <version>${spring.version}</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-oxm</artifactId>
        <version>${spring.version}</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-tx</artifactId>
        <version>${spring.version}</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-jdbc</artifactId>
        <version>${spring.version}</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>${spring.version}</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>${spring.version}</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context-support</artifactId>
        <version>${spring.version}</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-aop</artifactId>
        <version>${spring.version}</version>
    </dependency>

    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-test</artifactId>
        <version>${spring.version}</version>
    </dependency>

    <!-- 添加mybatis依赖 -->
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis</artifactId>
        <version>${mybatis.version}</version>
    </dependency>

    <!-- 添加mybatis/spring整合包依赖 -->
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis-spring</artifactId>
        <version>1.2.2</version>
    </dependency>
    <!-- 添加mysql驱动依赖 -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>${mysql-driver.version}</version>
    </dependency>
    <!-- 添加数据库连接池依赖 -->
    <dependency>
        <groupId>commons-dbcp</groupId>
        <artifactId>commons-dbcp</artifactId>
        <version>1.2.2</version>
    </dependency>
    <!-- 导入dbcp的jar包，用来在applicationContext.xml中配置数据库 -->
    <dependency>
        <groupId>commons-dbcp</groupId>
        <artifactId>commons-dbcp</artifactId>
        <version>1.2.2</version>
    </dependency>
    <!-- JSTL标签类 -->
    <dependency>
        <groupId>jstl</groupId>
        <artifactId>jstl</artifactId>
        <version>1.2</version>
    </dependency>
    <dependency>
        <groupId>tk.mybatis</groupId>
        <artifactId>mapper</artifactId>
        <version>3.4.2</version>
    </dependency>
</dependencies>
<build>
    <finalName>com.lx.ssmcreater</finalName>
</build>
</project>
```
maven下载慢的同学，估计用的是国外地址，百度一下阿里的maven镜像地址，跟着做就好了，速度一下就上去了。

**jdbc.properties**
```
driverClasss=com.mysql.jdbc.Driver
jdbcUrl=jdbc:mysql://localhost:3306/world?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull
username=root
password=root

#定义初始连接数
initialSize=0
#定义最大连接数
maxActive=20
#定义最大空闲
maxIdle=20
#定义最小空闲
minIdle=1
#定义最长等待时间
maxWait=60000

#定义初始连接数
initialSize=0
#定义最大连接数
maxActive=20
#定义最大空闲
maxIdle=20
#定义最小空闲
minIdle=1
#定义最长等待时间
maxWait=60000

```

**spring-mvc.xml**
```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:p="http://www.springframework.org/schema/p"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                        http://www.springframework.org/schema/beans/spring-beans-4.0.xsd
                        http://www.springframework.org/schema/context
                        http://www.springframework.org/schema/context/spring-context-4.0.xsd
                        http://www.springframework.org/schema/mvc
                        http://www.springframework.org/schema/mvc/spring-mvc-4.0.xsd">

    <!-- 自动扫描  @Controller-->
    <context:component-scan base-package="com.lx.controller"/>
    <!-- 定义跳转的文件的前后缀 ，视图模式配置 -->
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/jsp/" />
        <property name="suffix" value=".jsp"/>
    </bean>
</beans>
```

**spring-mybatis.xml**
```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context" xmlns:tx="http://www.springframework.org/schema/tx"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                        http://www.springframework.org/schema/beans/spring-beans-3.1.xsd
                        http://www.springframework.org/schema/context
                        http://www.springframework.org/schema/context/spring-context-3.1.xsd
                        http://www.springframework.org/schema/tx
                        http://www.springframework.org/schema/tx/spring-tx.xsd">

    <!-- 自动扫描 -->
    <context:component-scan base-package="com.lx"/>
    <!--加载配置文件-->
    <bean id="propertyConfigurer" class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer">
        <property name="location" value="classpath:jdbc.properties"/>
    </bean>
    <!-- 配置数据源 -->
    <bean id="dataSource" class="org.apache.commons.dbcp.BasicDataSource"
          destroy-method="close">
        <property name="driverClassName" value="${driverClasss}"/>
        <property name="url" value="${jdbcUrl}"/>
        <property name="username" value="${username}"/>
        <property name="password" value="${password}"/>
        <!-- 初始化连接大小 -->
        <property name="initialSize" value="${initialSize}"></property>
        <!-- 连接池最大数量 -->
        <property name="maxActive" value="${maxActive}"></property>
        <!-- 连接池最大空闲 -->
        <property name="maxIdle" value="${maxIdle}"></property>
        <!-- 连接池最小空闲 -->
        <property name="minIdle" value="${minIdle}"></property>
        <!-- 获取连接最大等待时间 -->
        <property name="maxWait" value="${maxWait}"></property>
    </bean>

    <!-- spring和MyBatis完美整合，不需要mybatis的配置映射文件 -->
    <bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
        <property name="dataSource" ref="dataSource" />
        <!-- 自动扫描mapping.xml文件 -->
        <property name="mapperLocations" value="classpath:com/lx/mapper/*.xml"></property>
    </bean>

    <!-- DAO接口所在包名，Spring会自动查找其下的类 -->
    <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
        <property name="basePackage" value="com.lx.dao" />
        <property name="sqlSessionFactoryBeanName" value="sqlSessionFactory"></property>
    </bean>
</beans>
```

因为是最简单的框架，没有加入log4j和junit,需要的同学自己加上。到这里，项目应该可以启动，显示在index.jsp中的helloworld.

本人数据库中有一张city表，现在要做的是通过id查出这个city的name

**最终效果：**

![image](http://upload-images.jianshu.io/upload_images/2370478-46d62b2e6d9cae6b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![image](http://upload-images.jianshu.io/upload_images/2370478-28f14604983f11ca?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

**到此我们就已经完成配置文件**
**现在开始配置本地服务器**
第一步，添加Tomcat server

![image.png](https://upload-images.jianshu.io/upload_images/2370478-f9afd93dfa17084e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


第二步，这里需要下载Tomcat下载包
[Tomcat 下载包链接](https://tomcat.apache.org/download-70.cgi)

![image.png](https://upload-images.jianshu.io/upload_images/2370478-e2900eae40160e2b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


第三步，添加exploaded包

![image.png](https://upload-images.jianshu.io/upload_images/2370478-2e6068537a9f2721.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


到此SSM框架就搭建完成

浏览器输入：http://localhost:8080/city/getcityname?id=2

ps: 数据库文件放在GitHub项目中，请自行导入到数据库

![image](http://upload-images.jianshu.io/upload_images/2370478-db4e80229af368f8.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

[项目GitHub地址](https://github.com/8jinmuyan8/ssmtest)
