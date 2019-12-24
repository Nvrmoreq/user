package com.springcloud.user.service;

import com.springcloud.user.bo.UserInfo;

/**
 * @Author: ZQ
 * @Description:
 * @Date created in 15:55 2019/12/23
 */
public interface UserService {

    UserInfo findByOpenid(String openid);
}
