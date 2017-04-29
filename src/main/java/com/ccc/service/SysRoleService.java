package com.ccc.service;

import com.ccc.entity.SysRole;
import org.springframework.data.domain.Page;

/**
 * Created by ccc on 2017/3/19.
 */
public interface SysRoleService {
    Page<SysRole> queryRoles(Integer page, Integer size) throws Exception;
}
