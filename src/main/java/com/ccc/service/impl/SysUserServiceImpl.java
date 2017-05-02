package com.ccc.service.impl;

import com.ccc.base.service.BaseService;
import com.ccc.dao.jpa.SysUserDao;
import com.ccc.dao.mapper.SysUserMapper;
import com.ccc.entity.SysUser;
import com.ccc.service.SysUserService;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by ccc on 2017/3/19.
 */
@Service
public class SysUserServiceImpl extends BaseService implements SysUserService {
    @Autowired
    private SysUserDao sysUserDao;

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser login(SysUser sysUser) throws Exception {
        return sysUserDao.findBySysUserNameAndSysUserPwdAndRoleId(sysUser.getSysUserName(), sysUser.getSysUserPwd(), sysUser.getRoleId());
    }

    @Override
    public Page<SysUser> querySysUsers(Integer page, Integer size) throws Exception {
        Page<SysUser> userPage = sysUserDao.findAll(new PageRequest(page, size));
        return userPage;
    }

    @Override
    public SysUser querySysUser(int sysUserId) throws Exception {
        return sysUserDao.findOne(sysUserId);
    }

    @Override
    public SysUser querySysUser(String sysUserName) throws Exception {
        return sysUserDao.findBySysUserName(sysUserName);
    }

    @Override
    public SysUser modifySysUser(SysUser sysUser) throws Exception {
        sysUser.setSysUserUpdateTime(timeUtil.date2String());
        int count = sysUserMapper.modifySysUser(sysUser);
        if (count == 0) {
            return null;
        }
        return sysUserDao.findOne(sysUser.getSysUserId());
    }

    @Override
    public void delSysUser(int sysUserId) throws Exception {
        SysUser sysUser = sysUserDao.findOne(sysUserId);
        if (sysUser != null) {
            /*sysUser.setSysUserStatus("1");
            modifySysUser(sysUser);*/
            sysUserDao.delete(sysUserId);
        }
    }

    @Override
    public SysUser addSysUser(SysUser sysUser) throws Exception {
        String time = timeUtil.date2String();
        sysUser.setSysUserCreateTime(time);
        sysUser.setSysUserUpdateTime(time);
        return sysUserDao.save(sysUser);
    }
}
