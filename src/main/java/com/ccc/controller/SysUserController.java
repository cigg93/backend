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

//        SysUser sysUser1 = sysUserService.login(sysUser);
        return sysUserService.login(sysUser);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResultInfo querySysUsers(HttpServletRequest request) throws Exception {
        ResultInfo resultInfo = new ResultInfo();
        /*分页信息*/
        Integer page = pageUtil.getPage(request);
        Integer size = pageUtil.getPageSize(request);
        Page<SysUser> sysUsers = sysUserService.querySysUsers(page, size);
        resultInfo.setTotal(sysUsers.getTotalElements());
        resultInfo.setRows(sysUsers.getContent());

        return resultInfo;
    }

    @RequestMapping(value = "info", method = RequestMethod.POST)
    public SysUser addSysUser(
            @RequestBody SysUser sysUser
    ) throws Exception {
        if (sysUserService.querySysUser(sysUser.getSysUserName()) != null) {
            throw new Exception("用户已存在");
        }
        sysUser.setSysUserStatus("0");
        return sysUserService.addSysUser(sysUser);
    }

    @RequestMapping(value = "{sysUserId}/info", method = RequestMethod.GET)
    public SysUser querySysUser(
            @PathVariable int sysUserId
    ) throws Exception {
        return sysUserService.querySysUser(sysUserId);
    }

    @RequestMapping(value = "info", method = RequestMethod.PUT)
    public SysUser modifySysUser(
            @RequestBody SysUser sysUser
    ) throws Exception {
        return sysUserService.modifySysUser(sysUser);
    }

    @RequestMapping(value = "sysUserId", method = RequestMethod.POST)
    public void delSysUser(
            @RequestBody SysUser sysUser
    ) throws Exception {
        sysUser.setSysUserStatus("1");
        sysUserService.delSysUser(sysUser.getSysUserId());
    }


}
