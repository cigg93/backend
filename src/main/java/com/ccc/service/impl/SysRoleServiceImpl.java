package com.ccc.service.impl;

import com.ccc.base.service.BaseService;
import com.ccc.dao.jpa.SysRoleDao;
import com.ccc.dao.mapper.SysRoleMapper;
import com.ccc.dao.mapper.SysUserMapper;
import com.ccc.entity.SysRole;
import com.ccc.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Created by ccc on 2017/3/19.
 */
@Service
public class SysRoleServiceImpl extends BaseService implements SysRoleService {
    @Autowired
    private SysRoleDao sysRoleDao;

    @Autowired
    private SysRoleMapper sysRoleMapper;


    @Override
    public Page<SysRole> queryRoles(Integer page, Integer size) throws Exception {
        Page<SysRole> userPage = sysRoleDao.findAll(new PageRequest(page, size));
        return userPage;
    }

    @Override
    public SysRole querySysRole(int sysRoleId) throws Exception {
        return sysRoleDao.findOne(sysRoleId);
    }

    @Override
    public SysRole querySysRole(String roleName) throws Exception {
        return sysRoleDao.findByRoleName(roleName);
    }

    @Override
    public SysRole modifySysRole(SysRole sysRole) throws Exception {
        sysRole.setRoleUpdateTime(timeUtil.date2String());
        int count = sysRoleMapper.modifySysRole(sysRole);
        if (count == 0) {
            return null;
        }
        return sysRoleDao.findOne(sysRole.getRoleId());
    }

    @Override
    public void delSysRole(int sysRoleId) throws Exception {
        SysRole sysRole = sysRoleDao.findOne(sysRoleId);
        if (sysRole != null) {
            sysRoleDao.delete(sysRoleId);
        }
    }

    @Override
    public SysRole addSysRole(SysRole sysRole) throws Exception {
        String time = timeUtil.date2String();
        sysRole.setRoleCreateTime(time);
        sysRole.setRoleUpdateTime(time);
        return sysRoleDao.save(sysRole);
    }
}
