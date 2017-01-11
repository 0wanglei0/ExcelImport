<html>
<head>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%> 
<meta charset="UTF-8" />
<title>Main.jsp</title>
<link href="<%= basePath%>css/main.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%= basePath%>js/main.js"></script>
</head>
<body  onload="time()">
  <div>
    <div class="top">
      <table class="topTable">
        <tr>
          <td><label>user: </label></td>
          <td><label><%=(String)session.getAttribute("username")%></label></td>
        </tr>
        <tr>
          <td><label>time: </label></td>
          <td><label id="timeShow"></label></td>
        </tr>
      </table>
    </div>
    <div class="center">
      <div class="center-left">
        <table>
          <tr>
            <td>
              <input type="button" value="upload file" class="submitBtn" />
            </td>
          </tr>
          <tr>
            <td>
              <input type="button" value="view chart" class="submitBtn" />
            </td>
          </tr>
          <tr>
            <td></td>
          </tr>
          <tr>
            <td></td>
          </tr>
        </table>

      </div>
      <div class="center-right">3</div>
    </div>
    <div class="footer">4</div>
  </div>
</body>
</html>