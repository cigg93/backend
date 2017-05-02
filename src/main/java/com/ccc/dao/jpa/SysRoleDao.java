package com.ccc.dao.jpa;

import com.ccc.entity.SysRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ccc on 2017/3/19.
 */
@Repository
public interface SysRoleDao extends CrudRepository<SysRole, Integer> {

    Page<SysRole> findAll(Pageable pageable);

    SysRole findByRoleName(String roleName);

}
