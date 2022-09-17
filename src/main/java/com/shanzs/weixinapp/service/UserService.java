package com.shanzs.weixinapp.service;

import com.shanzs.weixinapp.entity.User;

import java.io.IOException;
import java.util.Map;

/**
 * @author 蛋炒饭不加蛋
 */
public interface UserService {
  boolean authorization(String code, String sessionKey, String avatarUrl, String nickName) throws IOException;

  Map login(String code) throws IOException;

  User getUserInfo(String openid);
}
