package cn.mikulink.service;

import cn.mikulink.dao.UserDao;
import cn.mikulink.entity.ReString;
import cn.mikulink.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author MikuLink
 * @date 2020/8/1 14:48
 * for the Reisen
 * 用户服务
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 根据用户id
     *
     * @param userId 用户id
     * @return 用户信息
     */
    public UserInfo getUserInfoById(Long userId) {
        return userDao.getEntityById(userId);
    }

    /**
     * 创建新用户
     *
     * @param userInfo 用户信息
     */
    public ReString create(UserInfo userInfo) {
        ReString reString = new ReString(true);
        //基础信息校验

        userDao.create(userInfo);

        return reString;
    }
}
