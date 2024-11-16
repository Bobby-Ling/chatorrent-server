package com.itheima.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FriendMapper {
    void insertFriend(@Param("webId")String web_id,@Param("friendWebId")String friend_web_id);//插入朋友记录
    void deleteFriend(@Param("webId")String web_id,@Param("friendWebId")String friend_web_id);//删除朋友记录
    void updateFriend(@Param("webId")String web_id,@Param("friendWebId")String friend_web_id);//更新朋友记录
    List<String> selectFriend(@Param("webId")String web_id);//查找某个用户的所有朋友Id

}
//    CREATE TABLE friend (
//    id INT AUTO_INCREMENT PRIMARY KEY, -- 自增主键
//    web_id VARCHAR(100),
//    friend_web_id VARCHAR(100),
//    UNIQUE KEY (web_id, friend_web_id) -- 防止重复的 web_id 和 peer_id 组合
//);