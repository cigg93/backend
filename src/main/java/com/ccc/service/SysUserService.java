package com.ccc.service;

import com.ccc.entity.SysUser;
import org.springframework.data.domain.Page;

/**
 * Created by ccc on 2017/3/19.
 */

public interface SysUserService {

    SysUser login(SysUser sysUser) throws Exception;

    Page<SysUser> querySysUsers(Integer page, Integer size) throws Exception;

    SysUser querySysUser(int sysUserId) throws Exception;

    SysUser querySysUser(String sysUserName) throws Exception;

    SysUser modifySysUser(SysUser sysUser) throws Exception;

    void delSysUser(int sysUserId) throws Exception;

    SysUser addSysUser(SysUser sysUser) throws Exception;
}
