package com.java.rest.service;

import java.util.Date;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/*
 *Configure the project with dependencies 1. Jersey Server 2. Jersey Container
 *Create Web Methods in the Web Service class
 *Annotate the Web Service and the Web Methods
 *Configure ServletContainer from the Jersey in the web.xml file
 * 
 */

@Path("/user")
public class UserService {
	
	@GET
	@Path("/text")
	@Produces(MediaType.TEXT_PLAIN)
	public String registerUserWithPlainResponse() {
		String response = "[PLAIN TEXT] User Registered Successfully at " + new  Date();
		
		return response;
	}
	
	@GET
	@Path("/html")
	@Produces(MediaType.TEXT_HTML)
	public String registerUserWithHTMLResponse() {
		String response = "<html><body><h3>[HTML TEXT] User Registered Successfully at " + new  Date() + "</h3></body></html>";
		
		return response;
	}
	
	@GET
	@Path("/xml")
	@Produces(MediaType.TEXT_XML)
	public String registerUserWithXMLResponse() {
		String response = "<?xml version='1.0' encoding='UTF-8'?><response>[XML TEXT] User Registered Successfully at " + new  Date() + "</response>";
		
		return response;
	}
	
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public String registerUserWithJSONResponse() {
		String response = "{'response': '[JSON TEXT] User Registered Successfully at " + new  Date() + "'" + "}";
		
		return response;
	}
	
	
}
