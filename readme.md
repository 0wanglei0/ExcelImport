servlet  配置 <br/>

jsp页面form表单中使用  action=“servlet” method=“post/get”  建议使用post   <br/>
增加的servlet需要在web.xml中配置 <br/>
初始页面也要在web.xml中添加到welcome-file-list中  否则会出现页面无法访问的情况<br/>

 \<url-pattern>/LoginServlet \</url-pattern>  是使用的servlet
纯js的ajax  使用xmlhttp进行前后台交互  
