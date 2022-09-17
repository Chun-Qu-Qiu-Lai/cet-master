package com.shanzs.weixinapp.controller;

import com.shanzs.weixinapp.entity.DifferentYear;
import com.shanzs.weixinapp.entity.Result;
import com.shanzs.weixinapp.entity.TestPaper;
import com.shanzs.weixinapp.mapper.CetGroupAndOptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取试卷年份和套类
 *
 * @author 蛋炒饭不加蛋
 */


@CrossOrigin
@RestController
@RequestMapping("/cetapp")
public class CetGroupController {
  @Autowired
  private CetGroupAndOptionMapper cetGroupAndOptionMapper;

  @GetMapping(value = "/getenggroup")
  private Result getEngYear(@RequestParam("cetFourOrSix") int cetFourOrSix) {
    List<DifferentYear> differentYear = new ArrayList<DifferentYear>();
    if (cetFourOrSix == 4) {
      differentYear = cetGroupAndOptionMapper.selectCetFourYear();
    } else {
      differentYear = cetGroupAndOptionMapper.selectCetSixYear();
    }
    return Result.success(200, "请求成功", differentYear);
  }

  @GetMapping(value = "/getengtest")
  private Result getEngTest(@RequestParam("cetFourOrSix") int cetFourOrSix) {
    List<TestPaper> testPapers = new ArrayList<TestPaper>();
    if (cetFourOrSix == 4) {
      testPapers = cetGroupAndOptionMapper.selectCetFourPaper();
    } else {
      testPapers = cetGroupAndOptionMapper.selectCetSixPaper();
    }
    return Result.success(200, "请求成功", testPapers);
  }
}
