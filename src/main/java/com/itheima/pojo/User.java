package com.itheima.pojo;

public class User {
    private String web_id;//用于建立链接的ID
    private String auth_id;//auth_id

//    CREATE TABLE tb_user(
//web_id VARCHAR(100),
//auth_id VARCHAR(100) PRIMARY KEY
//);

    public User(String web_id, String auth_id) {
        this.web_id = web_id;
        this.auth_id = auth_id;
    }

    public String getWeb_id() {
        return web_id;
    }

    public void setWeb_id(String web_id) {
        this.web_id = web_id;
    }

    public String getAuth_id() {
        return auth_id;
    }

    public void setAuth_id(String auth_id) {
        this.auth_id = auth_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "web_id='" + web_id + '\'' +
                ", auth_id='" + auth_id + '\'' +
                '}';
    }

}
