package com.trackenshure;

import com.trackenshure.lib.Injector;
import com.trackenshure.model.CinemaHall;
import com.trackenshure.model.Movie;
import com.trackenshure.model.Student;
import com.trackenshure.service.MovieService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class Main {

    public static void main(String[] args) {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try (SessionFactory sessionFactory = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();
//                .addCacheableFile("src/main/resources/entities/Student.hbm.xml")

//             try (SessionFactory sessionFactory = new MetadataSources(registry)
//              .addCacheableFile("src/main/java/entities/Student.hbm.xml")
//                .addAnnotatedClass(Student.class)
//                .buildMetadata()
//                .buildSessionFactory();

             Session session = sessionFactory.openSession()) {

             session.beginTransaction();
//             session.save(new Movie("Ukraine", "War"));
//             session.save(new CinemaHall(100, "description"));
             session.save(new Student("Serhiip 1"));
             session.getTransaction().commit();
        }
//           StandardServiceRegistryBuilder.destroy( registry );
    }

}
