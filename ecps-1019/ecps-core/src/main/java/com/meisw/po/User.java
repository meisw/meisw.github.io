package com.meisw.po;

public class User {
    private Integer id;

    private String username;

    private String corp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorp() {
        return corp;
    }

    public void setCorp(String corp) {
        this.corp = corp;
    }

	@Override
    public String toString() {
	    return "User [id=" + id + ", username=" + username + ", corp=" + corp + "]";
    }
    
}