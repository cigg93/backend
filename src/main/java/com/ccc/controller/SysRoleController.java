package com.ccc.controller;

import com.ccc.base.controller.BaseController;
import com.ccc.base.entity.ResultInfo;
import com.ccc.entity.SysRole;
import com.ccc.entity.SysUser;
import com.ccc.service.SysRoleService;
import com.ccc.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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


}
