package com.trackenshure;

import com.trackenshure.controller.ConsoleHandler;
import com.trackenshure.lib.Injector;

public class Main {
    public static void main(String[] args) {
        //ConsoleHandler consoleHandler = new ConsoleHandler();
        ConsoleHandler consoleHandler = (ConsoleHandler) Injector.getInstanse(ConsoleHandler.class);
        System.out.println("Введіть value та risk для вашої ставки:");
        consoleHandler.handle();
    }
}
