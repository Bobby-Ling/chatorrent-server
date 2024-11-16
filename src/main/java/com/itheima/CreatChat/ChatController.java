package com.itheima.CreatChat;

import com.itheima.CreatChat.GroupResponse;
import com.itheima.CreatChat.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @Autowired
    private ChatService chatService;

    @GetMapping("/chat_list")
    public GroupResponse getChatList() {
        return chatService.getChatList();
    }
}