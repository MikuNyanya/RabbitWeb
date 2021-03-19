package cn.mikulink.rabbitweb.config;

import cn.mikulink.rabbitweb.controller.IndexController;
import cn.mikulink.rabbitweb.entity.RabbitWebDataInfo;
import cn.mikulink.rabbitweb.filemanager.FileManagerData;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * created by MikuNyanya on 2021/3/19 20:20
 * For the Reisen
 * 定时任务
 */
@Component
@EnableScheduling   // 1.开启定时任务
@EnableAsync        // 2.开启多线程
public class ScheduleTask {

    @Scheduled(cron = "0 * * * * ?")
    private void syncClickCountTask() {
        RabbitWebDataInfo info = new RabbitWebDataInfo();
        info.setClickCount(IndexController.getClickCount());
        try {
            FileManagerData.writeFile(info);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
