package com.shanzs.weixinapp.service;

import com.shanzs.weixinapp.entity.Message;

import java.util.List;

/**
 * @author 蛋炒饭不加蛋
 */
public interface MessageService {
  List<Message> getAllMessage();

  boolean insertFeedMessage(String feedMessage);
}
