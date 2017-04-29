package com.ccc.entity;

import com.ccc.base.entity.ResultInfo;

import java.util.List;


/**
 * @author cai
 * Created by cai on 2016/8/8.
 */
public class SysMenu extends ResultInfo
{
    /**
     * 菜单ID
     */
    private int menuId;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 父菜单ID
     */
    private int menuParentId;

    /**
     * 菜单URL
     */
    private String menuUrl;

    /**
     * 菜单排序
     */
    private String menuSort;

    /**
     * 菜单级别
     */
    private String menuLevel;

    /**
     * 菜单是否显示
     */
    private String menuIsShow;

    /**
     * 菜单创建时间
     */
    private String createTime;

    /**
     * 菜单创建者
     */
    private String creator;

    /**
     * 菜单更新时间
     */
    private String updateTime;

    /**
     * 菜单更新者
     */
    private String updateUser;

    /**
     * 父菜单名称
     */
    private String parentName;

    /**
     * 路由名称
     */
    private String routeName;

    /**
     * 路由请求路径
     */
    private String routeUrl;


    /**
     * 路由模板路径
     */
    private String routeTempletUrl;

    /**
     * 路由JS或CSS文件集合
     */
    private String routeJs;

    /**
     * 菜单集合
     */
    private List<SysMenu> childrenList;

    /**
     * 菜单图标
     */
    private String menuIcon;
    /**
     * 角色菜单ID
     */
    private int roleMenuId;

    public int getMenuId()
    {
        return menuId;
    }

    public void setMenuId(int menuId)
    {
        this.menuId = menuId;
    }

    public String getMenuName()
    {
        return menuName;
    }

    public void setMenuName(String menuName)
    {
        this.menuName = menuName;
    }

    public int getMenuParentId()
    {
        return menuParentId;
    }

    public void setMenuParentId(int menuParentId)
    {
        this.menuParentId = menuParentId;
    }

    public String getMenuUrl()
    {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl)
    {
        this.menuUrl = menuUrl;
    }

    public String getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(String menuSort) {
        this.menuSort = menuSort;
    }

    public String getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel;
    }

    public String getMenuIsShow()
    {
        return menuIsShow;
    }

    public void setMenuIsShow(String menuIsShow)
    {
        this.menuIsShow = menuIsShow;
    }

    public String getCreator()
    {
        return creator;
    }

    public void setCreator(String creator)
    {
        this.creator = creator;
    }

    public String getUpdateUser()
    {
        return updateUser;
    }

    public void setUpdateUser(String updateUser)
    {
        this.updateUser = updateUser;
    }

    public int getRoleMenuId()
    {
        return roleMenuId;
    }

    public void setRoleMenuId(int roleMenuId)
    {
        this.roleMenuId = roleMenuId;
    }

    public String getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(String createTime)
    {
        this.createTime = createTime;
    }

    public String getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(String updateTime)
    {
        this.updateTime = updateTime;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getRouteName()
    {
        return routeName;
    }

    public void setRouteName(String routeName)
    {
        this.routeName = routeName;
    }

    public String getRouteUrl()
    {
        return routeUrl;
    }

    public void setRouteUrl(String routeUrl)
    {
        this.routeUrl = routeUrl;
    }

    public String getRouteTempletUrl()
    {
        return routeTempletUrl;
    }

    public void setRouteTempletUrl(String routeTempletUrl)
    {
        this.routeTempletUrl = routeTempletUrl;
    }

    public String getRouteJs()
    {
        return routeJs;
    }

    public void setRouteJs(String routeJs)
    {
        this.routeJs = routeJs;
    }

    public List<SysMenu> getChildrenList()
    {
        return childrenList;
    }

    public void setChildrenList(List<SysMenu> childrenList)
    {
        this.childrenList = childrenList;
    }

    public String getMenuIcon()
    {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon)
    {
        this.menuIcon = menuIcon;
    }
}
