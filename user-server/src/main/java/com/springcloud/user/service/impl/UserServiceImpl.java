package com.springcloud.user.service.impl;

import com.springcloud.user.bo.UserInfo;
import com.springcloud.user.dao.UserInfoDao;
import com.springcloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: ZQ
 * @Description:
 * @Date created in 15:55 2019/12/23
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByOpenid(String openid) {
        return userInfoDao.findByOpenid(openid);
    }
}
