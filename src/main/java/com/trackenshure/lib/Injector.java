package com.trackenshure.lib;

import com.trackenshure.controller.ConsoleHandler;
import com.trackenshure.dao.impl.BetDaoImpl;
import com.trackenshure.dao.impl.BetDaoJDBCImpl;

import java.lang.reflect.Field;

public class Injector {
    public static Object getInstanse(Class clazz) throws IllegalAccessException {
        Field[] declaredFields = clazz.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.getAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                field.set(new ConsoleHandler(), new BetDaoImpl());
            }
        }
        return null;
    }
}
