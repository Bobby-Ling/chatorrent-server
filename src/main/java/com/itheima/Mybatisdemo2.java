package com.itheima;

import com.itheima.mapper.FriendMapper;
import com.itheima.mapper.GroupMapper;
import com.itheima.mapper.PeerMapper;
import com.itheima.mapper.UserMapper;
import com.itheima.pojo.Peer;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Mybatisdemo2 {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        PeerMapper peerMapper=sqlSession.getMapper(PeerMapper.class);
        GroupMapper groupMapper=sqlSession.getMapper(GroupMapper.class);
//        FriendMapper friendMapper=sqlSession.getMapper(FriendMapper.class);
        //以下均为测试部分
//        User user1=new User("WYG","250");
//        User user2=new User("CMQ","520");
//        userMapper.addUser(user1);
//        userMapper.addUser(user2);
//        peerMapper.insertPeer("WYG","sj",0);
//        peerMapper.insertPeer("WYG","dn",1);
//        peerMapper.insertPeer("CMQ","dn",0);
//        List<String> stringList=peerMapper.selectPeerIdsByWebId("WYG");
//        groupMapper.insert_Group(1,"CMQ");
//        groupMapper.insert_Group(1,"LCR");
//        groupMapper.insert_Group(2,"CMQ");
//        groupMapper.insert_Group(2,"WYG");
//        List<Integer>integerList=groupMapper.researchById("CMQ");
////        System.out.println(stringList);
//        System.out.println(integerList);
//        List<User> users=userMapper.selectAll();
//        System.out.println(users);
        List<String> stringList=groupMapper.researchByGroupId(1);
        System.out.println(stringList);
        sqlSession.commit();
        sqlSession.close();
    }
}

