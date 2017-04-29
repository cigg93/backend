package com.ccc.base.util;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


@Component
public class PageUtil
{
    /**
     * 默认第一页
     */
    public static final Integer DEFAULT_CURRENT_PAGE = 1;

    /**
     * 默认一页数量
     */
    public static final Integer DEFAULT_PAGE_SIZE = 10;

    /**
     * 获取当前分页数
     * @param request 请求
     * @return 当前分页数
     */
    public Integer getPage(HttpServletRequest request)
    {
        Integer currentPage;
        try
        {
            currentPage = Integer.valueOf(request.getParameter("offset"));
        }
        catch (Exception e)
        {
            currentPage = DEFAULT_CURRENT_PAGE;
        }
        return countOffset(getPageSize(request), currentPage);
    }

    /**
     * 获取一页数量
     * @param request 请求
     * @return 一页数量
     */
    public Integer getPageSize(HttpServletRequest request)
    {
        Integer pageSize;
        try
        {
            pageSize = Integer.valueOf(request.getParameter("limit"));
        }
        catch (Exception e)
        {
            pageSize = DEFAULT_PAGE_SIZE;
        }
        return pageSize;
    }

    /**
     * 计算当前页开始记录
     * @param pageSize 每页记录数
     * @param currentPage 当前第几页
     * @return 当前页开始记录号
     */
    public int countOffset(final int pageSize, final int currentPage)
    {
        /*final int offset = pageSize * (currentPage - 1);
        return offset;*/
        final int offset = currentPage / 10;
        return offset;
    }

}
