package com.shanzs.weixinapp.mapper;

import com.shanzs.weixinapp.entity.CopyWriting;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 蛋炒饭不加蛋
 */
@Mapper
public interface CopyWritingMapper {
  CopyWriting findCopyWritingByRandomId();

}
