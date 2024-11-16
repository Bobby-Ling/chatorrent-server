package com.itheima.CreatChat;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupResponse {
    @JsonProperty("group_id")
    private int groupId;

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}