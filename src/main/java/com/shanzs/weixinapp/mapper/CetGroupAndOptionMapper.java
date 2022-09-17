package com.shanzs.weixinapp.mapper;

import com.shanzs.weixinapp.entity.DifferentYear;
import com.shanzs.weixinapp.entity.OptionTest;
import com.shanzs.weixinapp.entity.TestPaper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 获取四级组和选择题
 *
 * @author 蛋炒饭不加蛋
 */
@Mapper
public interface CetGroupAndOptionMapper {
  /**
   *获取四级所有的年份实体目录
   *
   * @return 年份结果集
   */
  List<DifferentYear> selectCetFourYear();
  /**
   *获取六级所有的年份实体目录
   *
   * @return 年份结果集
   */
  List<DifferentYear> selectCetSixYear();
  /**
   * 获取四级当前年份下试卷套类
   *
   * @return 试卷套类别
   */
  List<TestPaper> selectCetFourPaper();
  /**
   * 获取六级当前年份下试卷套类
   *
   * @return 试卷套类别
   */
  List<TestPaper> selectCetSixPaper();
  /**
   * 获取四级指定部分选择题
   *
   * @param map 包括所有哪一年，哪一套，哪一部分
   * @return 选择题集
   */
  List<OptionTest> selectCetFourOption(Map<String, Object> map);
  /**
   * 获取六级指定部分选择题
   *
   * @param map 包括所有哪一年，哪一套，哪一部分
   * @return 选择题集
   */
  List<OptionTest> selectCetSixOption(Map<String, Object> map);


  /**
   * 获取四级整套试卷所有选择题
   *
   * @param map 年份id，哪一套
   * @return 选择题集
   */
  List<OptionTest> selectCetFourAllOption(Map<String, Object> map);
  /**
   * 获取六级整套试卷所有选择题
   *
   * @param map 年份id，哪一套
   * @return 选择题集
   */
  List<OptionTest> selectCetSixAllOption(Map<String, Object> map);

}
