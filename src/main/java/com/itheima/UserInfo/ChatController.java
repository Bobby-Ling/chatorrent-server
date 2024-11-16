package com.itheima.UserInfo;

import com.itheima.Contacts.ChatService;
import com.itheima.Contacts.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatController {

    private final ChatService chatService;

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/chat_list")
    public List<UserInfo> getChatList() {
        return chatService.getChatList();
    }
}