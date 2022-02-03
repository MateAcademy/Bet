package com.trackenshure.lib;

import com.trackenshure.factory.BetDaoFactory;

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
                //в этом месте я должен внедрить класс нужный класс над которым аннотация дао
                field.set(instance, BetDaoFactory.getBetDao());
            }
        }
        return instance;
    }
}
