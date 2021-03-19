package cn.mikulink.rabbitweb;

import cn.mikulink.rabbitweb.filemanager.FileManagerData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitwebApplication.class, args);
        FileManagerData.dataFileInit();
        System.out.println("===============Rabbit ready===============");
    }
}
