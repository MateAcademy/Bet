package com.trackenshure;

import com.trackenshure.controller.ConsoleHandler;
import com.trackenshure.lib.Injector;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException, ClassNotFoundException {
        //ConsoleHandler consoleHandler = new ConsoleHandler();
        ConsoleHandler consoleHandler = (ConsoleHandler) Injector.getInstanse(ConsoleHandler.class);
        consoleHandler.handle();


        //получаю обьект класса который описывает ConsoleHandler
//        Class<ConsoleHandler> consoleHandlerClass = (Class<ConsoleHandler>) Class.forName("com.trackenshure.controller.ConsoleHandler");
//        System.out.println(consoleHandlerClass.getSimpleName());
    }
}
