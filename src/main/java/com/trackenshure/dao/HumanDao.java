package com.trackenshure.dao;

import com.trackenshure.model.Human;

import java.util.List;

/**
 * @author Sergey Klunniy
 */
public interface HumanDao {
    void add(Human human);
    List<Human> getAll();
}
