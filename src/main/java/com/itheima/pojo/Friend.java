package com.itheima.pojo;

public class Friend {
    private String web_id;
    private String friend_web_id;

    public Friend(String web_id, String friend_web_id) {
        this.web_id = web_id;
        this.friend_web_id = friend_web_id;
    }

    public String getWeb_id() {
        return web_id;
    }

    public void setWeb_id(String web_id) {
        this.web_id = web_id;
    }

    public String getFriend_web_id() {
        return friend_web_id;
    }

    public void setFriend_web_id(String friend_web_id) {
        this.friend_web_id = friend_web_id;
    }

    @Override
    public String toString() {
        return "friend{" +
                "web_id='" + web_id + '\'' +
                ", friend_web_id='" + friend_web_id + '\'' +
                '}';
    }

    //    CREATE TABLE friend (
//    id INT AUTO_INCREMENT PRIMARY KEY, -- 自增主键
//    web_id VARCHAR(100),
//    friend_web_id VARCHAR(100),
//    UNIQUE KEY (web_id, friend_web_id) -- 防止重复的 web_id 和 peer_id 组合
//);
}