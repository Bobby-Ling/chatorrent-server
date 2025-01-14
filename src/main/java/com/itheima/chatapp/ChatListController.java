package com.itheima.chatapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/chat_list")
public class ChatListController {

    @Autowired
    private ChatService chatService;

    @GetMapping
    public List<ChatGroup> getChatList() throws IOException {
        return chatService.getChatList();
    }
}
