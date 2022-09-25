package com.shanzs.weixinapp.controller;

import com.shanzs.weixinapp.entity.Result;
import com.shanzs.weixinapp.entity.ResultOption;
import com.shanzs.weixinapp.service.OptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 获取选择题
 *
 * @author 蛋炒饭不加蛋
 */
@CrossOrigin
@RestController
@RequestMapping("/cetapp")
public class OptionController {
  @Autowired
  private OptionService optionService;

  /**
   * 获取选择题
   *
   * @param cetFourOrSix 四级或六级
   * @param yearId       年份id
   * @param belongTo     第几套
   * @param section      第几部份
   * @return
   */
  @GetMapping("/getoption")
  private Result getOption(@RequestParam("cetfourorsix") int cetFourOrSix,
                           @RequestParam("yearid") int yearId,
                           @RequestParam("belongto") int belongTo,
                           @RequestParam(value = "section", required = false) Integer section) {

     List<List<ResultOption>> options = optionService.getOption(cetFourOrSix,yearId, belongTo, section);
    return Result.success(200, "请求成功", options);
  }
}
