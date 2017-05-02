package com.ccc.dao.jpa;

import com.ccc.entity.Tenant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ccc on 2017/3/19.
 */
@Repository
public interface SysTenantDao extends CrudRepository<Tenant, Integer> {

    Tenant findByTenantName(String sysTenantName);

    Page<Tenant> findAll(Pageable pageable);

}
