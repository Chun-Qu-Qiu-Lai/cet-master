package com.shanzs.weixinapp.controller;


import com.shanzs.weixinapp.entity.Result;
import com.shanzs.weixinapp.entity.SetForm;
import com.shanzs.weixinapp.entity.User;
import com.shanzs.weixinapp.mapper.UserMapper;
import com.shanzs.weixinapp.service.impl.UserServiceImpl;
import com.shanzs.weixinapp.utils.CodeUtil;
import com.shanzs.weixinapp.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author 蛋炒饭不加蛋
 */
@CrossOrigin
@RestController
@RequestMapping("/cetapp")
public class UserController {
  @Autowired
  private UserServiceImpl userService;
  @Autowired
  private UserMapper userMapper;

  /**
   * 授权，注册用户，获取头像，名称
   *
   * @param code      用户
   * @param avatarUrl 头像地址
   * @param nickName  名称
   * @return
   */

  @CrossOrigin
  @PostMapping("/user/authorization")
  private Result authorization(@RequestParam("code") String code,
                               @RequestParam("avatarUrl") String avatarUrl,
                               @RequestParam("nickName") String nickName) {
    if (code == null || "".equals(code)) {
      return Result.success(400, "code参数为空");
    }
    if (avatarUrl == null || "https://mmbiz.qpic.cn/mmbiz/icTdbqWNOwNRna42FI242Lcia07jQodd2FJGIYQfG0LAJGFxM4FbnQP6yfMxBgJ0F3YRqJCJ1aPAK2dQagdusBZg/0".equals(avatarUrl)) {
      return Result.success(400, "头像不为空");
    }
    if (nickName == null) {
      return Result.success(400, "昵称不为空");
    }
    Map resMap = new CodeUtil().getRes(code);
    String openid = (String) resMap.get("openid");
    String sessionKey = (String) resMap.get("session_key");
    System.out.println(sessionKey);
    boolean auth = userService.authorization(openid, sessionKey, avatarUrl, nickName);
    if (!auth) {
      return Result.success(403, "授权失败");
    }
    return Result.success(200, "授权成功");
  }

  /**
   * 返回token
   *
   * @param code
   * @return token
   */
  @PostMapping("/user/login")
  private Result login(@RequestParam("code") String code) {
    if (code == null || "".equals(code)) {
      return Result.success(400, "code参数为空");
    }
    Map resMap = new CodeUtil().getRes(code);
    String openid = (String) resMap.get("openid");
    String token = new JwtUtil().createToken(openid);
    Map<String, Object> R = new HashMap<>();
    R.put("token", token);
    return Result.success(200, "登录成功", R);
  }

  /**
   * 获取用户信息，头像，名称
   *
   * @return
   * @throws IOException
   */
  @GetMapping("/user/getUserInfo")
  private Result getUserInfo(@RequestHeader("Authorization") String authorizationJwt) throws IOException {
    String token = authorizationJwt.substring(6);
    String openid = new JwtUtil().parseToken(token);
    User user = userMapper.selectUserByOpenid(openid);
    if (user == null) {
      return Result.success(403, "用户不存在");
    }
    Map<String, Object> userInfo = new LinkedHashMap<>();
    userInfo.put("nickName", user.getNickName());
    userInfo.put("avatarUrl", user.getAvatarUrl());

    Map<String, Object> setInfo = new LinkedHashMap<>();
    setInfo.put("optionStyle", user.getOptionStyle());
    setInfo.put("deepChecklistTextFontSize", user.getDeepChecklistTextFontSize());
    Map<String, Object> optionBackFormData = new LinkedHashMap<>();
    Map<String, Object> optionCorrectFormData = new LinkedHashMap<>();
    optionBackFormData.put("optionBackColorR", user.getOptionBackColorR());
    optionBackFormData.put("optionBackColorG", user.getOptionBackColorG());
    optionBackFormData.put("optionBackColorB", user.getOptionBackColorB());
    optionBackFormData.put("optionBackColorA", user.getOptionBackColorA());
    optionCorrectFormData.put("optionCorrectBackColorR", user.getOptionCorrectBackColorR());
    optionCorrectFormData.put("optionCorrectBackColorG", user.getOptionCorrectBackColorG());
    optionCorrectFormData.put("optionCorrectBackColorB", user.getOptionCorrectBackColorB());
    optionCorrectFormData.put("optionCorrectBackColorA", user.getOptionCorrectBackColorA());
    setInfo.put("optionBackFormData", optionBackFormData);
    setInfo.put("optionCorrectFormData", optionCorrectFormData);

    String selectedColorP = "rgba(" + user.getOptionBackColorR() + "," + user.getOptionBackColorG() + "," + user.getOptionBackColorB() + "," + user.getOptionBackColorA() + ")";
    String correctionColorP = "rgba(" + user.getOptionCorrectBackColorR() + "," + user.getOptionCorrectBackColorG() + "," + user.getOptionCorrectBackColorB() + "," + user.getOptionCorrectBackColorA() + ")";
    String optionStyle = "option_style_one";
    if (user.getOptionStyle() == 0) {
      optionStyle = "option_style_one";
    } else if (user.getOptionStyle() == 1) {
      optionStyle = "option_style_two";
    }
    Map<String, Object> optionSetInfo = new LinkedHashMap<>();
    optionSetInfo.put("optionStyle", optionStyle);
    optionSetInfo.put("deepChecklistTextFontSize", user.getDeepChecklistTextFontSize());
    optionSetInfo.put("selectedColorP", selectedColorP);
    optionSetInfo.put("correctionColorP", correctionColorP);

    Map<String, Object> R = new LinkedHashMap<>();
    R.put("userInfo", userInfo);
    R.put("optionSetInfo", optionSetInfo);
    R.put("setInfo", setInfo);
    return Result.success(200, "获取用户信息成功", R);
  }

  /**
   * 个性化，修改个人设置信息
   *
   * @param authorizationJwt
   * @param setForm
   * @return
   */
  @PostMapping("/user/changePersonSetInfo")
  private Result changePersonSetInfo(@RequestHeader("Authorization") String authorizationJwt,
                                     @RequestBody SetForm setForm) {
    String token = authorizationJwt.substring(6);
    String openid = new JwtUtil().parseToken(token);
    User user = userMapper.selectUserByOpenid(openid);
    if (user == null) {
      return Result.success(403, "用户不存在");
    }
    String fontSize;
    Map<String, Object> setMap = new HashMap<>();
    setMap.put("openid", openid);
    if (setForm.getDeepChecklistTextFontSize() == 0) {
      fontSize = "0.85rem";
    } else if (setForm.getDeepChecklistTextFontSize() == 1) {
      fontSize = "0.9rem";
    } else if (setForm.getDeepChecklistTextFontSize() == 2) {
      fontSize = "0.95rem";
    } else if (setForm.getDeepChecklistTextFontSize() == 3) {
      fontSize = "1rem";
    } else {
      fontSize = "1.05rem";
    }
    setMap.put("deepChecklistTextFontSize", fontSize);
    setMap.put("optionStyle", setForm.getOptionStyle());
    setMap.put("optionBackColorR", setForm.getOptionBackFormData().getOptionBackColorR());
    setMap.put("optionBackColorG", setForm.getOptionBackFormData().getOptionBackColorG());
    setMap.put("optionBackColorB", setForm.getOptionBackFormData().getOptionBackColorB());
    setMap.put("optionBackColorA", setForm.getOptionBackFormData().getOptionBackColorA());
    setMap.put("optionCorrectBackColorR", setForm.getOptionCorrectFormData().getOptionCorrectBackColorR());
    setMap.put("optionCorrectBackColorG", setForm.getOptionCorrectFormData().getOptionCorrectBackColorG());
    setMap.put("optionCorrectBackColorB", setForm.getOptionCorrectFormData().getOptionCorrectBackColorB());
    setMap.put("optionCorrectBackColorA", setForm.getOptionCorrectFormData().getOptionCorrectBackColorA());
    if (userMapper.updateUserSetInfo(setMap) >= 1) {
      return Result.success(200, "修改用户设置信息成功");
    } else {
      return Result.success(201, "修改用户设置信息失败");
    }
  }
}
