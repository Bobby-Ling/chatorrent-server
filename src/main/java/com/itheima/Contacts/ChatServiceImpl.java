package com.itheima.Contacts;

import com.itheima.Contacts.UserInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {

    @Override
    public List<com.itheima.Contacts.UserInfo> getChatList() {
        List<UserInfo> chatList = new ArrayList<>();

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(0L);
        userInfo.setUserName("");
        userInfo.setOnline(false);
        userInfo.setGroup("unimplemented");

        chatList.add(userInfo);

        return chatList;
    }
}