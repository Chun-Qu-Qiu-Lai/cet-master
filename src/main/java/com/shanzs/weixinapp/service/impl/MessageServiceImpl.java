package com.shanzs.weixinapp.service.impl;

import com.shanzs.weixinapp.entity.Message;
import com.shanzs.weixinapp.mapper.MessageMapper;
import com.shanzs.weixinapp.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 蛋炒饭不加蛋
 */
@Service
public class MessageServiceImpl implements MessageService {
  @Autowired
  private MessageMapper messageMapper;

  @Override
  public List<Message> getAllMessage() {
    return null;
  }

  @Override
  public boolean insertFeedMessage(String feedMessage) {
    if (messageMapper.insertFeedMessage(feedMessage) > 0) {
      return true;
    } else {
      return false;
    }
  }
}
