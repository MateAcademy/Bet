package com.trackenshure;

import com.trackenshure.controller.ConsoleHandler;
import com.trackenshure.lib.Injector;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        //ConsoleHandler consoleHandler = new ConsoleHandler();
        ConsoleHandler consoleHandler = (ConsoleHandler) Injector.getInstanse(ConsoleHandler.class);
        consoleHandler.handle();
    }
}
