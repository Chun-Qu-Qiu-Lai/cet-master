package com.shanzs.weixinapp.mapper;

import com.shanzs.weixinapp.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;


/**
 * @author 山楂树
 */
@Mapper
public interface UserMapper {
  int insertUser(String openid, String sessionKey, String avatarUrl, String nickName);
  User selectUserByOpenid(String openid);
  int updateUserSetInfo(Map<String,Object> map);

}
