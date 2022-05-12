package com.trackenshure.itvdn;

public class Massiv {

//    прочитайте:
//            1) http://developer.alexanderklimov.ru/android/java/array.php,
//            2) https://javarush.ru/groups/posts/massivy-java
//
//    Я буду спрашивать у Вас:
//              0) что такое массив
//              1) как вывести трехмерный массив
//              2) передать в метод массив в качестве пераметра
//              3) что такое блок инициализации в массиве
//              4) создайте массив любой размерности и заполните его рандомно
//              5) рандомно от -10 до 10
//              6) напишите любой масси и выведите его циклом foreach
//              7) какие бывают массивы?
//              8) что делает метод  System.arraycopy() и метод  Arrays.copyOf()

    public static void main(String[] args) {

        int[] arr = new int[]{};
        arr[0] = 5;

        for (int i = 0; i < 20; i++) {
            System.out.print(((int) (Math.random() * 21) - 10) + " ");
        }
    }
}
