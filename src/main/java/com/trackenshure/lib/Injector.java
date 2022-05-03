package com.trackenshure.lib;

import org.hibernate.sql.ordering.antlr.Factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Injector {

//    public static Object getInstance(Class clazz) throws NoSuchMethodException, IllegalStateException,
//            InstantiationException, IllegalAccessException, InvocationTargetException {
//        Constructor constructor = clazz.getDeclaredConstructor();
//        Object instance = constructor.newInstance();
//
//        Field[] declaredFields = clazz.getDeclaredFields();
//
//        for (Field field : declaredFields) {
//            if (field.getAnnotation(Inject.class) != null) {
//                field.setAccessible(true);
//                field.set(instance, Factory.getBetDao());
//            }
//        }
//        return instance;
//    }
}
