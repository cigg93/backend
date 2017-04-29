package com.ccc.service.impl;

import com.ccc.dao.jpa.SysRoleDao;
import com.ccc.dao.jpa.SysUserDao;
import com.ccc.entity.SysRole;
import com.ccc.entity.SysUser;
import com.ccc.service.SysRoleService;
import com.ccc.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Created by ccc on 2017/3/19.
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleDao sysRoleDao;


    @Override
    public Page<SysRole> queryRoles(Integer page, Integer size) throws Exception {
        Page<SysRole> userPage = sysRoleDao.findAll(new PageRequest(page, size));
        return userPage;
    }
}
