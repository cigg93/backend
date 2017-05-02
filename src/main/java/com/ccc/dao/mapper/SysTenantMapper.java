package com.ccc.dao.mapper;

import com.ccc.entity.SysUser;
import com.ccc.entity.Tenant;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by ccc on 2017/4/29.
 */
@Mapper
public interface SysTenantMapper {
    int modifySysTenant(Tenant tenant);

    Tenant querySysTenant(Tenant tenant);
}
