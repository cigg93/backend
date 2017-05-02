package com.ccc.controller;

import com.ccc.base.controller.BaseController;
import com.ccc.base.entity.ResultInfo;
import com.ccc.entity.SysRole;
import com.ccc.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ccc on 2017/3/19.
 */
@RestController
@RequestMapping("sysRole")
public class SysRoleController extends BaseController {

    @Autowired
    private SysRoleService sysRoleService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResultInfo queryRoles(HttpServletRequest request) throws Exception {
        ResultInfo resultInfo = new ResultInfo();
        /*分页信息*/
        Integer page = pageUtil.getPage(request);
        Integer size = pageUtil.getPageSize(request);
        /*进行无条件分页查询*/
        Page<SysRole> users = sysRoleService.queryRoles(page, size);
        resultInfo.setTotal(users.getTotalElements());
        resultInfo.setRows(users.getContent());

        return resultInfo;
    }

    @RequestMapping(value = "info", method = RequestMethod.POST)
    public SysRole addSysRole(
            @RequestBody SysRole sysRole
    ) throws Exception {
        if (sysRoleService.querySysRole(sysRole.getRoleName()) != null) {
            throw new Exception("角色已存在");
        }
        return sysRoleService.addSysRole(sysRole);
    }

    @RequestMapping(value = "{sysRoleId}/info", method = RequestMethod.GET)
    public SysRole querySysRole(
            @PathVariable int sysRoleId
    ) throws Exception {
        return sysRoleService.querySysRole(sysRoleId);
    }

    @RequestMapping(value = "info", method = RequestMethod.PUT)
    public SysRole modifySysRole(
            @RequestBody SysRole sysRole
    ) throws Exception {
        return sysRoleService.modifySysRole(sysRole);
    }

    @RequestMapping(value = "roleId", method = RequestMethod.POST)
    public void delSysRole(
            @RequestBody SysRole sysRole
    ) throws Exception {
        sysRoleService.delSysRole(sysRole.getRoleId());
    }


}
