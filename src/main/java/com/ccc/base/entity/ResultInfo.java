package com.ccc.base.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ccc on 2017/3/19.
 */
@Data
public class ResultInfo<T> implements Serializable {

    //总记录数
    private long total;

    //行数据
    private List<T> rows;
}
