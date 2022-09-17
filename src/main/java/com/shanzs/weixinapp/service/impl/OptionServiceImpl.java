package com.shanzs.weixinapp.service.impl;

import com.shanzs.weixinapp.entity.OptionTest;
import com.shanzs.weixinapp.entity.ResultOption;
import com.shanzs.weixinapp.mapper.CetGroupAndOptionMapper;
import com.shanzs.weixinapp.service.OptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 获取选择题
 *
 * @author 蛋炒饭不加蛋
 */
@Service
public class OptionServiceImpl implements OptionService {

  @Autowired
  private CetGroupAndOptionMapper cetGroupAndOptionMapper;

  /**
   * 选择性获取sectionA、sectionB、sectionC
   *
   * @param cetFourOrSix
   * @param yearId
   * @param belongTo
   * @param section
   * @return 选择题集
   */
  @Override
  public List<List<ResultOption>> getOption(int cetFourOrSix, int yearId, int belongTo, Integer section) {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("yearId", yearId);
    map.put("belongTo", belongTo);
    List<OptionTest> options = new ArrayList<OptionTest>();
    if (section == null) {
      if (cetFourOrSix == 4) {
        options = cetGroupAndOptionMapper.selectCetFourAllOption(map);
      } else if (cetFourOrSix == 6) {
        options = cetGroupAndOptionMapper.selectCetSixAllOption(map);
      }
    } else {
      map.put("section", section);
      if (cetFourOrSix == 4) {
        options = cetGroupAndOptionMapper.selectCetFourOption(map);
      } else if (cetFourOrSix == 6) {
        options = cetGroupAndOptionMapper.selectCetSixOption(map);
      }
    }
    List<List<ResultOption>> allos = new ArrayList<List<ResultOption>>();
    for (OptionTest s : options
    ) {
      List<ResultOption> os = new ArrayList<ResultOption>();
      for (int j = 0; j < 4; j++) {
        if (j == 0) {
          os.add(new ResultOption(s.getOption_a(), j, s.getAnswer()));
        } else if (j == 1) {
          os.add(new ResultOption(s.getOption_b(), j, s.getAnswer()));
        } else if (j == 2) {
          os.add(new ResultOption(s.getOption_c(), j, s.getAnswer()));
        } else {
          os.add(new ResultOption(s.getOption_d(), j, s.getAnswer()));
        }
      }
      allos.add(os);
    }
    return allos;
  }
}

