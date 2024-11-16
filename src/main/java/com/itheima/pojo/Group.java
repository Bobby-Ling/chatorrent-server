package com.itheima.pojo;

public class Group {
    private int group_id;
    private String web_id;

    public Group(int group_id, String web_id) {
        this.group_id = group_id;
        this.web_id = web_id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getWeb_id() {
        return web_id;
    }

    public void setWeb_id(String web_id) {
        this.web_id = web_id;
    }

    @Override
    public String toString() {
        return "group{" +
                "group_id=" + group_id +
                ", web_id='" + web_id + '\'' +
                '}';
    }


    //    CREATE TABLE user_group (
//    id INT AUTO_INCREMENT PRIMARY KEY, -- 自增主键
//    group_id INT,
//    web_id VARCHAR(100),
//    UNIQUE KEY (group_id, web_id)
//);
}
