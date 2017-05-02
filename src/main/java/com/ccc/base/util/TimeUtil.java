package com.ccc.base.util;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by ccc on 2017/4/30.
 */
@Component
public class TimeUtil {

    public String date2String() {
        return DateFormatUtils.format(new Date(), "yyyy-MM-dd hh:mm:ss");
    }

}
