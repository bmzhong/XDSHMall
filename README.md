# 基于SpringBoot的校园二手交易系统

##  0. 快速访问

​        [点我浏览](123.56.17.105:8080)

## 1. 作品介绍：

此作品采用Spring Boot及其相关的技术栈，兼顾PC端和移动端的浏览器特点，创建了二手交易平台的web应     用，弥补了现有的西电二手交易qq群的不足。此平台采用c2c模式，主要包括商城和论坛两个模块，商城主要展示卖家想要出售的二手商品，论坛通过留言功能发布想要购买的二手商品。此平台通过ajax局部刷新，留言，评论等功能实现网站更加人性化，具有更好的互动和良好的体验。

## 2. 详细信息

1. 作品设计的目的：通过平时的体验和调查发现，校园内的二手交易qq群存在卖家和买家信息不对称，学生发出的信息容易被大量的聊天记录淹没，并且导致学生必须发重复的信息别人才能看到。因此此作品的目的真是为了弥补这些不足之处。用户在此平台发布的信息可以一直保留也可以删除，可以通过搜索框和分类标签快速检索。所以此作品的目的就是给学生提供一个高效、方便的二手交易平台。

   

2. 基本思路:  首先进行需求分析，确定网站的功能，然后通过bootstrap快速搭建前端的html页面，用css渲染页面。之后，根据确定的数据结构，用mysql建立数据库和相应的表。用spring boot搭建后端服务，用mybatis及其generator快速生成与表相对于的model和mapper，之后再写出dto,service,interceptor,filter,controller等各个功能模块。用js和themeleaf实现数据数据传输和渲染。经过不断进行修改后，部署到云服务器中运行。

   

3. 创新点:使用目前流行的spring boot, themeleaf, bootstrap等技术栈快速构建了校园二手交易平台，实现了留言、评论、最新，最热，通知，出售二手商品等功能，并且增加了github的Ouath授权登录，可兼容移动端和PC端。mybatis generator, Lombok等组件和springboot等框架的使用，使得它与传统的ssm项目相比，大大简化了配置文件，精简了代码。并且有用户管理，订单管理，商品管理等功能，使用了slf4j构建了日志系统，方便查找问题。留言编辑功能采用Editor.md框架，使用户输入更加便捷。通过搜索引擎和功能标签的检索，可快速查找想要的内容，设有cookie功能，实现了ajax局部刷新，优化了用户体验。

   

4. 技术关键:通过Spring Boot搭建后端，用mybatis和Mybatis自动生成与数据库相对应的model和mapper，实现了免写sql语句。用Lombok免写getter,setter等方法。用slf4j记录日志。用themeleaf将后端数据传输到前端页面。用js加载数据。使用mysqlworkbench构建数据库。使用github的Ouath授权登录。用bootstrap框架快速构建前端页面。前端页面拆分成了各个不同的部分，避免了写重复的html代码。

5. 主要技术指标：JDK版本：1.8、数据库：MySQL 5.7、后端框架：Spring Boot,Mybatis、服务器：Tomcat、前端解析框架：Thymeleaf、开发工具：Idea 2019、版本管理工具：Maven、版本控制工具：Git,GitHub.前端框架：BootStrap，Jquery库，前后端交互：javascript，ajax。

   

## 3. 使用说明

1. 使用说明: 网站可访问www.blabla1024.cn:8080,首页可看到已存在的留言信息，可通过搜索框搜索，也可以通过标签筛选留言，用github登录后是发布留言和回复留言。点击商城可进入商城，可查看已有的商品，登录后可自己添加购物车，和加入订单，也可自己发布商品，可通过标签筛选商品。

   

2. 技术特点:   代码初步实现了低内聚高解藕，前端页面简洁，功能丰富。
   优势:弥补了校园二手交易qq群的信息不对称的不足之处。

   

3. 作品的适用范围: 西电校园内部。　

## 4. 快速运行
1. 安装必备工具  
JDK，Maven
2. 克隆代码到本地  
3. 运行命令创建数据库脚本
```sh
mvn flyway:migrate
```
4. 运行打包命令
```sh
mvn package
```
5. 运行项目  
```sh
java -jar target/community-0.0.1-SNAPSHOT.jar
```
6. 访问项目
```
http://localhost:8887
```


## 5. 资料
[Spring 文档](https://spring.io/guides)    
[Spring Web](https://spring.io/guides/gs/serving-web-content/)   
[es](https://elasticsearch.cn/explore)    
[Github deploy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)    
[Bootstrap](https://v3.bootcss.com/getting-started/)    
[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)    
[Spring](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)    
[菜鸟教程](https://www.runoob.com/mysql/mysql-insert-query.html)    
[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-attribute-values)    
[Spring Dev Tool](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#using-boot-devtools)  
[Spring MVC](https://docs.spring.io/spring/docs/5.0.3.RELEASE/spring-framework-reference/web.html#mvc-handlermapping-interceptor)  
[Markdown 插件](http://editor.md.ipandao.com/)   
[UFfile SDK](https://github.com/ucloud/ufile-sdk-java)  
[Count(*) VS Count(1)](https://mp.weixin.qq.com/s/Rwpke4BHu7Fz7KOpE2d3Lw)  

## 工具
[Git](https://git-scm.com/download)   
[Visual Paradigm](https://www.visual-paradigm.com)    
[Flyway](https://flywaydb.org/getstarted/firststeps/maven)  
[Lombok](https://www.projectlombok.org)    
[ctotree](https://www.octotree.io/)   
[Table of content sidebar](https://chrome.google.com/webstore/detail/table-of-contents-sidebar/ohohkfheangmbedkgechjkmbepeikkej)    
[One Tab](https://chrome.google.com/webstore/detail/chphlpgkkbolifaimnlloiipkdnihall)    
[Live Reload](https://chrome.google.com/webstore/detail/livereload/jnihajbhpnppcggbcgedagnkighmdlei/related)  
[Postman](https://chrome.google.com/webstore/detail/coohjcphdfgbiolnekdpbcijmhambjff)