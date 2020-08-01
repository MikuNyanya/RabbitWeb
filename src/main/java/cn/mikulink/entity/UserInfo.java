package cn.mikulink.entity;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * @author MikuLink
 * @date 2020/8/1 12:38
 * for the Reisen
 * 用户信息
 */
@Getter
@Setter
@Alias("userInfo")
public class UserInfo {
    /**
     * 用户id
     */
    private Long id;
    /**
     * 数据创建时间
     */
    private Date createDate = new Date();
    /**
     * 数据最后修改时间
     */
    private Date modifyDate;
    /**
     * 版本，可看作是数据修改次数
     */
    private Integer version;
    /**
     * 用户状态
     */
    private Integer state = 0;
    /**
     * 用户名
     * 创建完成后不可修改
     */
    private String name;
    /**
     * 密码
     * md5落库
     */
    private String pwd;
    /**
     * 邮箱
     */
    private String email;
}

