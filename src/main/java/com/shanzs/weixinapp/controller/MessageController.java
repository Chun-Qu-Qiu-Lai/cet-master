package com.shanzs.weixinapp.controller;

import com.shanzs.weixinapp.entity.Result;
import com.shanzs.weixinapp.mapper.MessageMapper;
import com.shanzs.weixinapp.service.MessageService;
import com.shanzs.weixinapp.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * 系统消息，和反馈消息
 *
 * @author 蛋炒饭不加蛋
 */
@CrossOrigin
@RestController
@RequestMapping("/cetapp/message")
public class MessageController {
  @Autowired
  private MessageService messageService;
  @Autowired
  private RedisTemplate redisTemplate;
  @Autowired
  private MessageMapper messageMapper;

  @GetMapping("/getSysMessages")
  public Result getSysMessages() {
    return Result.success(200, "请求成功", messageMapper.selectMessage());
  }

  /**
   * 系统消息，和反馈消息
   *
   * @param
   * @param feedMessage
   * @return
   */
  @PostMapping("/upload/feedMessage")
  public Result uploadFeedMessage(@RequestHeader("Authorization") String authorizationJwt,
                                  @RequestParam("feedMessage") String feedMessage) {
    if (feedMessage == "" || Objects.equals(feedMessage, " ") || Objects.equals(feedMessage, "") || feedMessage == null) {
      return Result.success(200, "反馈失败，反馈内容为空");
    }
    ValueOperations valueOperations = redisTemplate.opsForValue();
    String token = authorizationJwt.substring(6);
    String openid = new JwtUtil().parseToken(token);
    Object redisOpenIdAcount = valueOperations.get(openid);
    if (redisOpenIdAcount == null) {
      valueOperations.set(openid, 1);
      if (messageService.insertFeedMessage(feedMessage)) {
        return Result.success(200, "反馈成功");
      } else {
        return Result.success(200, "反馈失败");
      }
    }
    int openIdAcount = (int) redisOpenIdAcount;
    if (openIdAcount == 1) {
      valueOperations.set(openid, 2);
    }
    if (openIdAcount == 2) {
      valueOperations.set(openid, 3);
    }
    if (openIdAcount == 3) {
      return Result.success(201, "反馈失败,当日反馈次数达3次");
    }
    if (messageService.insertFeedMessage(feedMessage)) {
      return Result.success(200, "反馈成功");
    } else {
      return Result.success(200, "反馈失败");
    }
  }
}
