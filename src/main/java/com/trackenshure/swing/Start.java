package com.trackenshure.swing;

import javax.swing.*;

/**
 * @author Sergey Klunniy
 */
public class Start {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Привет, читатель книги");

        int var1 = 5;
        int var2;

        var1 = 4096;
        System.out.println(var1);
        var2 = var1;
        var1 = 3;

        if (var1 == 7) {
            System.out.println("OK");
        }
        System.out.println(var2);

        int i;
        for (i=0; i<2; i++) {
            System.out.println(i);
        }
    }
}
