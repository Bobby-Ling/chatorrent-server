package com.itheima.CreatChat;

import com.itheima.CreatChat.GroupResponse;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {
    @Override
    public com.itheima.CreatChat.GroupResponse getChatList() {
        GroupResponse response = new GroupResponse();
        response.setGroupId(0);
        return response;
    }
}