package com.itheima.pojo;

public class Peer {
    private String web_id;
    private String peer_id;
    private int status_peer;//peer状态

//    CREATE TABLE peer (
//    id INT AUTO_INCREMENT PRIMARY KEY, -- 自增主键
//    web_id VARCHAR(100),
//    peer_id VARCHAR(100),
//    peer_status INT,
//    UNIQUE KEY (web_id, peer_id) -- 防止重复的 web_id 和 peer_id 组合
//);

    public String getWeb_id() {
        return web_id;
    }

    public void setWeb_id(String web_id) {
        this.web_id = web_id;
    }

    public String getPeer_id() {
        return peer_id;
    }

    public void setPeer_id(String peer_id) {
        this.peer_id = peer_id;
    }

    public int getStatus_peer() {
        return status_peer;
    }

    public void setStatus_peer(int status_peer) {
        this.status_peer = status_peer;
    }

    public Peer(String web_id, String peer_id, int status_peer) {
        this.web_id = web_id;
        this.peer_id = peer_id;
        this.status_peer = status_peer;
    }

    @Override
    public String toString() {
        return "Peer{" +
                "web_id='" + web_id + '\'' +
                ", peer_id='" + peer_id + '\'' +
                ", status_peer=" + status_peer +
                '}';
    }


}
