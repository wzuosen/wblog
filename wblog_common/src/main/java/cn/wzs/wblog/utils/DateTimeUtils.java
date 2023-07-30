package cn.wzs.wblog.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间日期工具类
 */
public class DateTimeUtils {

    public static final String DATE_FORMAT = "yyyy-MM-dd";

    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";


    public static String convert(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.format(date);
        } catch (Exception e) {
            // ignore
        }
        return null;
    }

    public static Date convert(String date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(date);
        } catch (Exception e) {
            // ignore
        }
        return null;
    }

    public static String convertDate(Date date) {
        return convert(date, DATE_FORMAT);
    }

    public static String convertDateTime(Date date) {
        return convert(date, DATE_TIME_FORMAT);
    }

    public static Date convertDate(String date) {
        return convert(date, DATE_FORMAT);
    }

    public static Date convertDateTime(String date) {
        return convert(date, DATE_TIME_FORMAT);
    }

    public static void main(String[] args) {
        System.out.println(convertDate(new Date()));
        System.out.println(convertDateTime(new Date()));
        System.out.println(convertDateTime("2023-07-30 19:14:13"));
        System.out.println(convertDate("2023-07-30 19:14:13"));
    }
}
