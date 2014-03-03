package com.sr.freightops.web.formbeans;

public class UserBean {
	private String id;
    private String password;
    private String username;
	private String name;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setName(String name) {
		this.name = name;
	}
    public String getName() {
		return name;
	}
}
