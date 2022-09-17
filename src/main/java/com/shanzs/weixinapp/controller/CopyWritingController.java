package com.shanzs.weixinapp.controller;

import com.shanzs.weixinapp.entity.Result;
import com.shanzs.weixinapp.mapper.CopyWritingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取鸡汤
 *
 * @author 蛋炒饭不加蛋
 */
@RestController
@CrossOrigin
@RequestMapping("/cetapp")
public class CopyWritingController {
  @Autowired
  private CopyWritingMapper copyWritingMapper;

  @GetMapping("/getCopyWriting")
  public Result getCopyWriting() {
    return Result.success(200, "请求成功", copyWritingMapper.findCopyWritingByRandomId());
  }
}
