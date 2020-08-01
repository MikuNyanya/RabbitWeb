package cn.mikulink.dao;

import cn.mikulink.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    /**
     * 创建用户信息
     *
     * @param userInfo 用户信息
     */
    void create(@Param(value = "param") UserInfo userInfo);
    /**
     * 更新用户信息
     *
     * @param userInfo 用户信息
     */
    void update(@Param(value = "param") UserInfo userInfo);
    /**
     * 根据用户id查询用户信息
     */
    UserInfo getEntityById(@Param(value = "userId") Long userId);

    /**
     * 根据用户名称查询用户信息
     */
    UserInfo getEntityByName(@Param(value = "userName") String userName);
}
