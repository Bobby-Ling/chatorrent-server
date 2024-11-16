package com.itheima.UserInfo;

import com.itheima.UserInfo.ChatListResponse;
import com.itheima.UserInfo.Device;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;

@Service
public class ChatServiceImpl implements ChatService {
    @Override
    public ChatListResponse getChatList() {
        ChatListResponse response = new ChatListResponse();
        response.setUserName("");

        Device device = new Device();
        device.setPeerId(0);
        device.setDescription("unimplemented");
        device.setOnline(false);
        device.setSessions(Arrays.asList(0, 1, 2));

        response.setDevices(Collections.singletonList(device));
        return response;
    }
}