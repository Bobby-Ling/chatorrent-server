package com.itheima.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

//    //    CREATE TABLE user_group (
////    id INT AUTO_INCREMENT PRIMARY KEY, -- 自增主键
////    group_id INT,
////    web_id VARCHAR(100),
////    UNIQUE KEY (group_id, web_id)
////);
public interface GroupMapper {
    void insert_Group(@Param("groupId") int groupId,@Param("webId")String webId);//插入群组记录
    void delete_Group(@Param("groupId") int groupId,@Param("webId")String webId);//删除群组记录
    List<Integer> researchById(@Param("webId")String webId);//查找群组记录
    void updateGroup(@Param("groupId") int groupId,@Param("webId")String webId);//更新群组记录
    List<String> researchByGroupId(@Param("groupId") int groupId);
    List<Integer> researchAllId();
}
