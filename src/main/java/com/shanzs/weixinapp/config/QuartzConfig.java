package com.shanzs.weixinapp.config;


import com.shanzs.weixinapp.task.RedisFlushDbTask;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 蛋炒饭不加蛋
 * 定时任务配置
 */
@Configuration
public class QuartzConfig {

  @Bean
  public JobDetail redisFlushDbJobDetail() {
    return JobBuilder.newJob(RedisFlushDbTask.class)
            .withIdentity("DateTimeJob")
            .usingJobData("msg", "redis Quartz")
            .storeDurably()
            .build();
  }
  //触发器
  @Bean
  public Trigger printTimeJobTrigger() {
    CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0 23 22 * * ?");
    return TriggerBuilder.newTrigger()
            .forJob(redisFlushDbJobDetail())
            .withIdentity("quartzTaskService")
            .withSchedule(cronScheduleBuilder)
            .build();
  }
}

