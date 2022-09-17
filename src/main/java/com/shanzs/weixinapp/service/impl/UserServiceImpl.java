package com.shanzs.weixinapp.service.impl;


import com.shanzs.weixinapp.entity.User;
import com.shanzs.weixinapp.mapper.UserMapper;
import com.shanzs.weixinapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * @author 蛋炒饭不加蛋
 */
@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserMapper userMapper;

  @Override
  public boolean authorization(String openid, String sessionKey, String avatarUrl, String nickName) {
    User user = userMapper.selectUserByOpenid(openid);
    if (user != null) {
      return false;
    }
    int insert = userMapper.insertUser(openid, sessionKey, avatarUrl, nickName);
    if (insert <= 0) {
      return false;
    }
    return true;
  }

  @Override
  public Map login(String openid) {
    return null;
  }

  @Override
  public User getUserInfo(String openid) {
    return null;
  }
}

