package com.oneby.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateConverter
 * @Description Converter<String, Date> 的泛型表示将 String 类型转换为 Date 类型
 * @Author Oneby
 * @Date 2021/3/8 20:54
 * @Version 1.0
 */
public class DateConverter implements Converter<String, Date> {
    public Date convert(String dateStr) {
        // 指定日期的转换格式
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        // 进行转换
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
