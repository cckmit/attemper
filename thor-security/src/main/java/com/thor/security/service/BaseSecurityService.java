package com.thor.security.service;

import com.thor.sdk.common.result.sys.user.User;
import com.thor.sys.service.BaseServiceAdapter;
import org.apache.shiro.SecurityUtils;

/**
 * security中的基础service
 * @author ldang
 */
public class BaseSecurityService extends BaseServiceAdapter {

    /**
     * 从shiro中获取用户<br>
     * 覆盖从UserHolder获取User
     * @return
     */
    @Override
    public User injectUser(){
        return (User) SecurityUtils.getSubject().getPrincipal();
    }
}