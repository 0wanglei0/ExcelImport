servlet  配置 <br/>

jsp页面form表单中使用  action=“servlet” method=“post/get”  建议使用post   <br/>
增加的servlet需要在web.xml中配置 <br/>
初始页面也要在web.xml中添加到welcome-file-list中  否则会出现页面无法访问的情况<br/>
 \<url-pattern>/LoginServlet \</url-pattern>  是使用的servlet<br/>
纯js的ajax  使用xmlhttp进行前后台交互  <br/>

http协议 hyperText Transfer Protocol   状态码 200  代表处理成功   content-type<br/>



**default.xml 在default和project标签中使用remote配置需要与remote标签中的name相同**

**路径是项目路径的上一级**