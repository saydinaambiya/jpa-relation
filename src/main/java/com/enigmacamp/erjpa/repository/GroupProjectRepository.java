package com.enigmacamp.erjpa.repository;

import com.enigmacamp.erjpa.entity.GroupProject;

public interface GroupProjectRepository {
    void create(GroupProject groupProject);
    GroupProject findOne(long id);
}
