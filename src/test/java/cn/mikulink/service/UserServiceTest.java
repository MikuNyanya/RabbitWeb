package cn.mikulink.service;

import cn.mikulink.entity.UserInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.DigestUtils;

import java.util.Date;

/**
 * @author MikuLink
 * @date 2020/8/1 14:47
 * for the Reisen
 */
public class UserServiceTest {
    @Test
    public void test() {
        try {
            ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
            UserService service = (UserService) ac.getBean("userService");
//            UserInfo userInfo = service.getUserInfoById(1L);

            UserInfo userInfo = new UserInfo();
            userInfo.setId(1000L);
            userInfo.setName("MikuLink");
            String md5Pwd = DigestUtils.md5DigestAsHex(("pwdtest"+"ex").getBytes());
            userInfo.setPwd(md5Pwd);
            userInfo.setEmail("k19831221@gmail.com");

            service.create(userInfo);

            System.out.println("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
