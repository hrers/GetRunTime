package com.time.pojo;

import java.io.Serializable;

public class User implements Serializable{
    private String id;

    private String sno;

    private String password;

    private String clas;

    private String name;

    private Integer success;

    private String timedesc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno == null ? null : sno.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas == null ? null : clas.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public String getTimedesc() {
        return timedesc;
    }

    public void setTimedesc(String timedesc) {
        this.timedesc = timedesc == null ? null : timedesc.trim();
    }

	public User(String id, String sno, String password, String clas, String name, Integer success, String timedesc) {
		super();
		this.id = id;
		this.sno = sno;
		this.password = password;
		this.clas = clas;
		this.name = name;
		this.success = success;
		this.timedesc = timedesc;
	}
    
}