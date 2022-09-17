package com.shanzs.weixinapp.mapper;

import com.shanzs.weixinapp.entity.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {
List<Message> selectMessage();
Integer insertFeedMessage(String feedMessage);
}
