package com.enigmacamp.erjpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "m_group_project_point")
public class GroupProjectWithPoint {

    public GroupProjectWithPoint(){
        this.id = new GroupProjectKey();

    }

    public void registerProject(GroupProject groupProject,Student student,int point){
        this.setPoint(point);
        this.setGroupProject(groupProject);
        this.setStudent(student);
    }
    @EmbeddedId
    GroupProjectKey id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id")
    Student student;

    @ManyToOne
    @MapsId("projectId")
    @JoinColumn(name = "project_id")
    GroupProject groupProject;

    int point;

    public GroupProjectKey getId() {
        return id;
    }

    public void setId(GroupProjectKey id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public GroupProject getGroupProject() {
        return groupProject;
    }

    public void setGroupProject(GroupProject groupProject) {
        this.groupProject = groupProject;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
