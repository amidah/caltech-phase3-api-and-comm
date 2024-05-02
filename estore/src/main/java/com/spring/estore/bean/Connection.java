package com.spring.estore.bean;

// Bean - Java Object Structure with mandatory Getters and Setters, 
// further they must be public
public class Connection {
	String url;
	String username;
	String password;
	
	public Connection(){
		System.out.println("[Connection] Object Created");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Connection [url=" + url + ", username=" + username + ", password=" + password + "]";
	}
	
	public void myInit() {
		System.out.println("[Connection] myInit Executed for User: " + username);
	}
	
	public void myDestroy() {
		System.out.println("[Connection] myDestroy Executed for User: " + username);
	}
	
}
