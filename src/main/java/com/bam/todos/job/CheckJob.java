package com.bam.todos.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CheckJob {
    /**
     *  定时查看未完成的工作项目，是否延期，是否超时
     */
    @Scheduled(cron = "0 */1 * * * ?")
    public void checkStatus(){
        System.out.println(System.currentTimeMillis());
    }
}
