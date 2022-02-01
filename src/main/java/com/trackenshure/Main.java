package com.trackenshure;

import com.trackenshure.controller.ConsoleHandler;

public class Main {
    public static void main(String[] args) {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        System.out.println("Введіть value та risk для вашої ставки:");
        consoleHandler.handle();
    }
}
