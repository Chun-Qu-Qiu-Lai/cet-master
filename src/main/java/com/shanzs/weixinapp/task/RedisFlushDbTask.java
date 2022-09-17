package com.shanzs.weixinapp.task;

import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Set;

/**
 * 清除redis数据库（在每天 00:00:00）
 *
 * @author 蛋炒饭不加蛋
 */
public class RedisFlushDbTask extends QuartzJobBean {
  @Autowired
  private RedisTemplate redisTemplate;

  @Override
  protected void executeInternal(JobExecutionContext context) {
    Set keys = redisTemplate.keys("*");
    for (Object key : keys) {
      redisTemplate.delete(key);
    }
  }
}

