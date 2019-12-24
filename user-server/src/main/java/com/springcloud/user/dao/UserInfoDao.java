package com.springcloud.user.dao;

import com.springcloud.user.bo.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: ZQ
 * @Description:
 * @Date created in 15:52 2019/12/23
 */
public interface UserInfoDao extends JpaRepository<UserInfo,String> {

    UserInfo findByOpenid(String openid);
}
