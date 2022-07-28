package com.trackenshure.test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(1);
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
    }
}

class T {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> q = new PriorityQueue<>(4, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });          // 7 9    9, 7, 1, 6

//        Queue<Integer> q = new PriorityQueue<>();     7, 9             1, 6, 7, 9,
        q.offer(7);
        System.out.println(q);
        q.offer(9);
        System.out.println(q);

        q.offer(4);
        System.out.println(q);
        q.offer(6);
        System.out.println(q);
        q.offer(5);
        System.out.println(q);
//        q.offer(8);
//        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);


        System.out.println(q);         //  9, 7, 6, 1             9, 7, 1, 8

        //peek - возвращает но не удаляет главный элемент очереди
        System.out.println(q.poll() + " " + q.poll() + " " + q.poll());
        System.out.println(q);
    }
}

class Test {
    public static void main(String[] args) {
        NavigableSet<Integer> v = new TreeSet<>();
        v.add(4);
        v.add(5);
        v.add(6);

        NavigableSet<Integer> integers = v.headSet(5, true);

        integers.add(4);
        integers.add(-2);
       // integers.add(7);

        System.out.println(integers);



    }
}