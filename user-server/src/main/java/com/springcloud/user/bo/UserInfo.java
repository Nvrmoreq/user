package com.springcloud.user.bo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author: ZQ
 * @Description:
 * @Date created in 15:47 2019/12/23
 */
@Data
@Entity
public class UserInfo {

    @Id
    private String Id;

    private String username;

    private String password;

    private String openid;

    private Integer role;
}
