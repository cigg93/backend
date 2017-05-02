package com.ccc.dao.mapper;

import com.ccc.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by ccc on 2017/4/29.
 */
@Mapper
public interface SysRoleMapper {
    int modifySysRole(SysRole sysRole);

//    SysRole querySysRole(SysRole sysRole);
}
