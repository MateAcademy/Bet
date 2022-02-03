package com.trackenshure.lib;

import com.trackenshure.controller.ConsoleHandler;
import com.trackenshure.dao.impl.BetDaoImpl;
import com.trackenshure.dao.impl.BetDaoJDBCImpl;
import com.trackenshure.factory.Factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Injector {

    public static Object getInstanse(Class clazz) throws IllegalAccessException, NoSuchMethodException,
            InvocationTargetException, InstantiationException {

        Constructor declaredConstructor = clazz.getDeclaredConstructor();
        Object instance = declaredConstructor.newInstance();

        Field[] declaredFields = clazz.getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.getAnnotation(Inject.class) != null) {

                field.setAccessible(true);
                field.set(instance, Factory.getBetDao());
            }
        }
        return instance;
    }
}
