package com.java.rest.service.test;

import java.net.URI;

import org.glassfish.jersey.client.ClientConfig;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriBuilder;

public class TestClient {

	WebTarget target;

	public TestClient() {
		ClientConfig clientConfiguration = new ClientConfig();
		Client client = ClientBuilder.newClient(clientConfiguration);
		URI uri = UriBuilder.fromUri("http://localhost:8090/RestWebServiceExample").build();
		target = client.target(uri);
	}

	public String getPlainResponse() {
		String response = target.path("/rest").path("/user").path("/text").request().accept(MediaType.TEXT_PLAIN).get(String.class);
		return response;
	}
	
	public String getHTMLResponse() {
		String response = target.path("/rest").path("/user").path("/html").request().accept(MediaType.TEXT_HTML).get(String.class);
		return response;
	}
	
	public String getXMLResponse() {
		String response = target.path("/rest").path("/user").path("/xml").request().accept(MediaType.TEXT_XML).get(String.class);
		return response;
	}
	
	public String getJSONResponse() {
		String response = target.path("/rest").path("/user").path("/json").request().accept(MediaType.APPLICATION_JSON).get(String.class);
		return response;
	}

}
