package com.ccc.dao.mapper;

import com.ccc.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by ccc on 2017/4/29.
 */
@Mapper
public interface SysUserMapper {
    int modifySysUser(SysUser sysuser);
}
