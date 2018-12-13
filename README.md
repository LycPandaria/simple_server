# simple_server
一个简单的用maven搭建的springmvc+spring+mybatis 服务，项目需要用其其来开发一个简单的挡板程序做测试用。

同时也准备把其作为一个备份，方便快速开发 Web 项目。

## 构建
该项目的构建步骤记录于：[eclipse下SpringMVC+Maven+Mybatis+MySQL项目搭建](/demo_springmvc+mybatis+maven.md)

## 运行
1. fork() 或者 下载
2. 导入eclipse 或者 IntelliJ 中
3. 因为使用了maven架构，需要按自己的实际情况设置maven路径等

**以下是在 eclipse 中需要注意的问题**
4. 检查 buildpath 看看还有没有缺少包的情况，并做相应调整，一般来说需要加入Tomcat的包（BuildPath -> Add Libraries -> Server Runtime -> Tomcat x.0）
5. 数据库的建表语句在src/main/resources/db下，需要mysql的支持
6. Run As -> Tomcat. 需要自己的eclipse装有tomcat,若没有可以百度一下，也很简单

**以下是在 IntelliJ 中需要注意的问题**
4. File -> Project Structure 中看看JDK版本之类的错误
5. 配置Tomcat （具体可以百度）
6. 运行
