package com.itheima.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    //日期转换为字符串
    public static String date2String(Date date, String patt) {
        SimpleDateFormat sf = new SimpleDateFormat(patt);
        return sf.format(date);
    }

    //字符串转换日期
    public static Date string2Date(String date, String patt) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat(patt);
        return sf.parse(date);
    }
}
