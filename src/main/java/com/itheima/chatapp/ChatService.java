package com.itheima.chatapp;

import com.itheima.mapper.GroupMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Service
public class ChatService {

    public List<ChatGroup> getChatList() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        GroupMapper groupMapper=sqlSession.getMapper(GroupMapper.class);

        List<Integer> integers=groupMapper.researchAllId();
        int a=integers.size();
        List<String> stringList=groupMapper.researchByGroupId(1);
        ChatGroup group = new ChatGroup();
        group.setGroupId(0);
        group.setGroupName("");
        group.setType("GROUP_CHAT");


        Member member1 = new Member();
        String s=stringList.get(1);
        member1.setUserId(1);
        member1.setUserName(s);
        member1.setOnline(false);

//        Member member2 = new Member();
//        member2.setUserId(0);
//        member2.setUserName("CMQ");
//        member2.setOnline(false);

        group.setMembers(Arrays.asList(member1));

        return Arrays.asList(group);
    }
}
