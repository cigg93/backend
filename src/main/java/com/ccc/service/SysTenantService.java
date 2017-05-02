package com.ccc.service;

import com.ccc.entity.Tenant;
import org.springframework.data.domain.Page;

/**
 * Created by ccc on 2017/3/19.
 */

public interface SysTenantService {

    Page<Tenant> querySysTenants(Integer page, Integer size) throws Exception;

    Tenant querySysTenant(int tanantId) throws Exception;

    Tenant querySysTenant(String sysTenantName) throws Exception;

    Tenant modifySysTenant(Tenant tenant) throws Exception;

    void delSysTenant(int tanantId) throws Exception;

}
