# multifunction-springboot

## 介绍
    包含mybatis-plus 、netty下的tcp通讯、websocket、日志系统、springboot多线程线程池的使用、druid的数据库连接池等组件

## 软件架构
    springboot+mybatis-plus+Netty-tcp+websocket+log+async+druid
    
## 调试方法
    1、运行application.java main方法启动项目
    2、websocket：用浏览器打开templates/websocket/websocketTest.html 连接websocket 点击发送测试
    3、TCP：运行test下的groot.multifunctionspringboot.MultiFunctionTest 下的testNetty ，看两边的控制台输出
    4、springboot线程池：运行test下的groot.multifunctionspringboot.MultiFunctionTest 下的AsyncTaskNativeTest方法方法，看本地控制台

## 注意：
    1、当前springboot+websocket只支持springboot 内置启动。tomcat启动需另行解决打包、依赖配置等问题
    2、为了方便快捷的开发，我们使用了lombok的工具包，所以Idea需要安装lombok插件,否则一些便捷开发的地方会报错。
        settings->plugins->搜索安装Lombok，或者使用本地安装的方法
        此插件比较好用，推荐使用。开发便捷切不影响正常打包。
    3、有些.keep文件是没有用的，只是github为了保持空文件夹存在自动生成的。
    4、只是使用基础范例，想要用好各组件还需多加学习。