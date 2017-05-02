package com.ccc.service.impl;

import com.ccc.base.service.BaseService;
import com.ccc.dao.jpa.SysTenantDao;
import com.ccc.dao.jpa.SysUserDao;
import com.ccc.dao.mapper.SysTenantMapper;
import com.ccc.dao.mapper.SysUserMapper;
import com.ccc.entity.SysUser;
import com.ccc.entity.Tenant;
import com.ccc.service.SysTenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Created by ccc on 2017/3/19.
 */
@Service
public class SysTenantServiceImpl extends BaseService implements SysTenantService {
    @Autowired
    private SysTenantDao sysTenantDao;

    @Autowired
    private SysTenantMapper sysTenantMapper;

    @Override
    public Page<Tenant> querySysTenants(Integer page, Integer size) throws Exception {
        Page<Tenant> userPage = sysTenantDao.findAll(new PageRequest(page, size));
        return userPage;
    }

    @Override
    public Tenant querySysTenant(int tenantId) throws Exception {
        return sysTenantDao.findOne(tenantId);
    }

    @Override
    public Tenant querySysTenant(String sysTenantName) throws Exception {
        return sysTenantDao.findByTenantName(sysTenantName);
    }

    @Override
    public Tenant modifySysTenant(Tenant tenant) throws Exception {
        tenant.setTenantUpdateTime(timeUtil.date2String());
        int count = sysTenantMapper.modifySysTenant(tenant);
        if (count == 0) {
            return null;
        }
        return sysTenantDao.findOne(tenant.getTenantId());
    }

    @Override
    public void delSysTenant(int tenantId) throws Exception {
        Tenant tenant = sysTenantDao.findOne(tenantId);
        if (tenant != null) {
            /*sysUser.setSysUserStatus("1");
            modifySysUser(sysUser);*/
            sysTenantDao.delete(tenantId);
        }
    }
}
