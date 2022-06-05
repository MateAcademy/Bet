package com.trackenshure;

import com.trackenshure.controller.ConsoleHandler;
import com.trackenshure.dao.BetDao;
import com.trackenshure.lib.Inject;
import com.trackenshure.lib.Injector;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationTargetException;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Main {

    @Inject
    private BetDao betDao;

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException, ClassNotFoundException {
        //ConsoleHandler consoleHandler = new ConsoleHandler();
        ConsoleHandler consoleHandler =
                (ConsoleHandler) Injector.getInstance(ConsoleHandler.class);
        consoleHandler.handle();

        //вывожу все ставки сделанные в консоли
        Main main = (Main) Injector.getInstance(Main.class);

        System.out.println("Вывожу список ставок из Базы Данных: \n" + main.betDao.getAll());


        //получаю обьект класса который описывает ConsoleHandler
//        Class<ConsoleHandler> consoleHandlerClass = (Class<ConsoleHandler>) Class.forName("com.trackenshure.controller.ConsoleHandler");
//        System.out.println(consoleHandlerClass.getSimpleName());
    }
}
