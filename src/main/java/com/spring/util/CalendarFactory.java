package com.spring.util;

import org.springframework.beans.factory.FactoryBean;
import java.util.Calendar;

public class CalendarFactory implements FactoryBean<Calendar> {
    private Calendar calendar=Calendar.getInstance();
    @Override
    public Calendar getObject() throws Exception {
        return calendar;
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }

//    Here we have our static code, which manipulates some things in the calendar object.
    public void addDays(int num){
        calendar.add(Calendar.DAY_OF_YEAR,num);
    }
}
