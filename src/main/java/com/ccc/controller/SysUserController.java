package com.ccc.controller;

import com.ccc.base.controller.BaseController;
import com.ccc.base.entity.ResultInfo;
import com.ccc.entity.SysUser;
import com.ccc.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ccc on 2017/3/19.
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController extends BaseController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public SysUser login(@RequestBody SysUser sysUser) throws Exception {
        SysUser sysUser1 = null;
        try {
            sysUser1 = sysUserService.login(sysUser.getSysUserName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sysUser1;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResultInfo querySysUsers(HttpServletRequest request) throws Exception {
        ResultInfo resultInfo = new ResultInfo();
        /*分页信息*/
        Integer page = pageUtil.getPage(request);
        Integer size = pageUtil.getPageSize(request);
            /*进行无条件分页查询*/
        Page<SysUser> sysUsers = sysUserService.querySysUsers(page, size);
        resultInfo.setTotal(sysUsers.getTotalElements());
        resultInfo.setRows(sysUsers.getContent());

        return resultInfo;
    }

    @RequestMapping(value = "{sysUserId}/info", method = RequestMethod.GET)
    public SysUser querySysUser(
            @PathVariable Integer sysUserId
    ) throws Exception {
        SysUser sysUser = sysUserService.querySysUser(sysUserId);

        return sysUser;
    }

    @RequestMapping(value = "info", method = RequestMethod.PUT)
    public SysUser modifySysUser(
            @RequestBody SysUser sysUser
    ) throws Exception {
        SysUser sysUser1 = sysUserService.modifySysUser(sysUser);

        return sysUser1;
    }


}
