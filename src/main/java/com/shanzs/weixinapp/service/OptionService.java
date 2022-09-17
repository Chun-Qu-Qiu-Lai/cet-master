package com.shanzs.weixinapp.service;

import com.shanzs.weixinapp.entity.ResultOption;

import java.util.List;

/**
 * @author 蛋炒饭不加蛋
 */
public interface OptionService {
  List<List<ResultOption>> getOption(int cetFourOrSix,int yearId, int belongTo, Integer section);
}
