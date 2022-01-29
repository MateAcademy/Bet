package com.trackenshure;

import com.trackenshure.model.Car;
import com.trackenshure.model.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sergey Klunniy
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TestBean testBean1 = context.getBean("testBean1", TestBean.class);
        TestBean testBean2 = context.getBean("testBean2", TestBean.class);

        System.out.println(testBean1.getName());
        System.out.println(testBean2.getName());

        Car bmw = context.getBean("bmw", Car.class);
        System.out.println(bmw);

        Car audi = context.getBean("audi", Car.class);
        System.out.println(audi);

        context.close();
    }
}
