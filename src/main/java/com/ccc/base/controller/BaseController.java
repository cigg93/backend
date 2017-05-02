package com.ccc.base.controller;

import com.ccc.base.util.PageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ccc on 2017/4/27.
 */
@Slf4j
public class BaseController {

    @Autowired
    protected PageUtil pageUtil;

}
