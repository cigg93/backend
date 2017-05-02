package com.ccc.controller;

import com.ccc.base.controller.BaseController;
import com.ccc.base.entity.ResultInfo;
import com.ccc.entity.SysUser;
import com.ccc.entity.Tenant;
import com.ccc.service.SysTenantService;
import com.ccc.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ccc on 2017/3/19.
 */
@RestController
@RequestMapping("sysTenant")
public class SysTenantController extends BaseController {

    @Autowired
    private SysTenantService sysTenantService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResultInfo querySysTenants(HttpServletRequest request) throws Exception {
        ResultInfo resultInfo = new ResultInfo();
        /*分页信息*/
        Integer page = pageUtil.getPage(request);
        Integer size = pageUtil.getPageSize(request);
        Page<Tenant> sysTenants = sysTenantService.querySysTenants(page, size);
        resultInfo.setTotal(sysTenants.getTotalElements());
        resultInfo.setRows(sysTenants.getContent());

        return resultInfo;
    }

    @RequestMapping(value = "{tenantId}/info", method = RequestMethod.GET)
    public Tenant querySysTenant(
            @PathVariable int tenantId
    ) throws Exception {
        return sysTenantService.querySysTenant(tenantId);
    }

    @RequestMapping(value = "info", method = RequestMethod.PUT)
    public Tenant modifySysTenant(
            @RequestBody Tenant tenant
    ) throws Exception {
        return sysTenantService.modifySysTenant(tenant);
    }

    @RequestMapping(value = "tenantId", method = RequestMethod.POST)
    public void delSysTenant(
            @RequestBody Tenant tenant
    ) throws Exception {
        tenant.setTenantStatus("1");
        sysTenantService.delSysTenant(tenant.getTenantId());
    }


}
