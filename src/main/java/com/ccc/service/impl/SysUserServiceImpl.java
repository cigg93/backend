package com.ccc.service.impl;

import com.ccc.dao.jpa.SysUserDao;
import com.ccc.dao.mapper.SysUserMapper;
import com.ccc.entity.SysUser;
import com.ccc.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Created by ccc on 2017/3/19.
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserDao sysUserDao;

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser login(String sysUsername) throws Exception {
        return sysUserDao.findBySysUserName(sysUsername);
    }

    @Override
    public Page<SysUser> querySysUsers(Integer page, Integer size) throws Exception {
        Page<SysUser> userPage = sysUserDao.findAll(new PageRequest(page, size));
        return userPage;
    }

    @Override
    public SysUser querySysUser(Integer sysUserId) {
        return sysUserDao.findOne(sysUserId);
    }

    @Override
    public SysUser modifySysUser(SysUser sysUser) {
        int count = sysUserMapper.modifySysUser(sysUser);
        if (count == 0) {
            return null;
        }
        return sysUserDao.findOne(sysUser.getSysUserId());
    }
}
