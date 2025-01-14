package com.itheima.Contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatController {

    @Autowired
    private ChatService chatService;

    @GetMapping("/chat_list")
    public List<UserInfo> getChatList() {
        return chatService.getChatList();
    }
}