package com.ccc.service;

import com.ccc.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Page;

/**
 * Created by ccc on 2017/3/19.
 */
@Mapper
public interface SysUserService {

    SysUser login(String sysUsername) throws Exception;

    Page<SysUser> querySysUsers(Integer page, Integer size) throws Exception;

    SysUser querySysUser(Integer sysUserId);

    SysUser modifySysUser(SysUser sysUser);
}
