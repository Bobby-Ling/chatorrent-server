package com.itheima.UserInfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ChatListResponse {
    @JsonProperty("user_name")
    private String userName;
    private List<Device> devices;

    // Getters and Setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }
}