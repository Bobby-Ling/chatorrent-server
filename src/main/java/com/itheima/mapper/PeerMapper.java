package com.itheima.mapper;

import org.apache.ibatis.annotations.*;
import java.util.List;

public interface PeerMapper {

    // 根据 web_id 查询所有对应的 peer_id

    List<String> selectPeerIdsByWebId(String webId);

    // 根据 web_id 插入 peer_id，若组合唯一则插入成功

    int insertPeer(@Param("webId") String webId, @Param("peerId") String peerId,@Param("peerStatus") int peerStatus);

    // 根据 web_id 和 peer_id 删除记录

    int deletePeer(@Param("webId") String webId, @Param("peerId") String peerId);

    int selectPeerStatus(@Param("webId") String webId,@Param("peerId") String peerId);

    // 根据 peer_id 查询对应的 web_id

    List<String> selectWebIdsByPeerId(String peerId);
}

