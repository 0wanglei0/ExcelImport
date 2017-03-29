<html>
<head>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<meta charset="UTF-8" />
<title>Main.jsp</title>
<link href="<%=basePath%>css/cityPicker.css" rel="stylesheet" type="text/css">
<link href="<%=basePath%>css/main.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/main.js"></script>
<script type="text/javascript" src="<%=basePath%>js/cityPicker.js"></script>
</head>
<body onload="time()">
  <div>
    <div class="top">
      <table class="topTable">
        <tr>
          <td>
            <label>user: </label>
          </td>
          <td>
            <label><%=(String)session.getAttribute("username")%></label>
          </td>
        </tr>
        <tr>
          <td>
            <label>time: </label>
          </td>
          <td>
            <label id="timeShow"></label>
          </td>
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
      <div class="center-right">
        <form id="infoForm">
          <label>From:</label>
          <button id="fromBtn">Departure place</button>
          <div id="areaDialog"></div>
          <label>To:</label>
          <button id="toBtn">Destination</button>
          <br />
          <label>Date:</label>
          <input type="text" name="username" palceholder="username" />
          <br />
          <label>Time:</label>
          <input type="text" name="whichway" palceholder="which way" />
          <br />
          <label>Seat Num:</label>
          <input type="text" name="where" palceholder="where" />
          <br />
          <button id="submitInfo">submit</button>
        </form>
      </div>
    </div>
    <div class="footer">4</div>
  </div>
</body>
</html>