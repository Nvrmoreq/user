package com.springcloud.user.enums;

import lombok.Getter;

/**
 * @Author: ZQ
 * @Description:
 * @Date created in 17:31 2019/11/19
 */
@Getter
public enum ResultEnum {
    LOGIN_FAIL(1,"登录失败"),
    ROLE_ERROR(2,"角色权限有误"),
    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
