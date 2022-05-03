package com.trackenshure.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    private int id;

//    @Basic(optional = false, fetch = FetchType.LAZY)
    @Column(name = "StudentName", nullable = false, unique = true, updatable = true)
    private String name;

    @Type(type = "date")
    private Date data;

    public Student(String name) {
        this.name = name;
    }

}

class M {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        List<Integer> list3 = new ArrayList<>();
        list3.add(90);
        list3.add(91);
        list.addAll(list2);
        list.addAll(list3);

        System.out.println(list);


    }
}
