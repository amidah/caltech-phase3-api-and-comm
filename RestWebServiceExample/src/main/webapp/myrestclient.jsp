<%@page import="java.net.URI"%>
<%@page import="jakarta.ws.rs.client.WebTarget"%>
<%@page import="jakarta.ws.rs.core.UriBuilder"%>
<%@page import="jakarta.ws.rs.client.ClientBuilder"%>
<%@page import="jakarta.ws.rs.client.Client"%>
<%@page import="org.glassfish.jersey.client.ClientConfig"%>
<%@page import="com.java.rest.service.test.TestClient"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyRestClient</title>
</head>
<body>
	<h3>Testing Restful Service:</h3>
	<%! TestClient client = new TestClient(); %>
	
	Plain Response: <%= client.getPlainResponse() %>
	<br><br>
	HTML Response: <%= client.getHTMLResponse() %>
	<br><br>
	XML Response: <%= client.getXMLResponse() %>
	<br><br>
	JSON Response: <%= client.getJSONResponse() %>
	<br>
	
</body>
</html>