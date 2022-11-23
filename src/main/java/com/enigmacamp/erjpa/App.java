package com.enigmacamp.erjpa;

import com.enigmacamp.erjpa.constants.Gender;
import com.enigmacamp.erjpa.entity.*;
import com.enigmacamp.erjpa.repository.*;
import com.enigmacamp.erjpa.utils.JpaUtil;
import jakarta.persistence.EntityManager;


import java.util.Date;

public class App {
    public static void main(String[] args) {
        EntityManager entityManager = JpaUtil.getEntityManager();
        StudentRepository studentRepository = new StudentRepositoryImpl(entityManager);
        MajorRepository majorRepository = new MajorRepositoryImpl(entityManager);
        AuthenticationRepository authenticationRepository = new AuthenticationRepositoryImpl(entityManager);
        GroupProjectRepository groupProjectRepository = new GroupProjectRepositoryImpl(entityManager);

        Student student = new Student();
        Major major = new Major();
        UserCredential userCredential = new UserCredential();
        GroupProjectWithPoint groupProjectWithPoint = new GroupProjectWithPoint();
//        GroupProjectKey groupProjectKey = new GroupProjectKey();
        GroupProject groupProject = new GroupProject();




        //
//        groupProject.setProjectName("React Native");
//        groupProjectRepository.create(groupProject);
//
//
//        major.setMajorName("Computer Network");
//        majorRepository.create(major);
//
//        userCredential.setUserName("joko");
//        userCredential.setPassword("123");
//
//        student.setGender(Gender.M);
//        student.setFirstName("Joko");
//        student.setLastName("Anwar");
//        student.setBirthDate(new Date());
//        student.setMajor(major);
//        student.setUserCredential(userCredential);
//        userCredential.setStudent(student);


//        groupProjectWithPoint.setId(groupProjectKey);
//        groupProjectWithPoint.setGroupProject(groupProject);
//        groupProjectWithPoint.setStudent(student);
//        groupProjectWithPoint.setPoint(0);
//        groupProjectWithPoint.registerProject(groupProject,student,0);
//        student.getProjectWithPoints().add(groupProjectWithPoint);
//        groupProject.getProjectWithPoints().add(groupProjectWithPoint);
//        studentRepository.create(student);
//
//




//        GroupProject otherProject = new GroupProject();
//        otherProject.setProjectName("React Native Framework");
//        groupProjectRepository.create(otherProject);
//        student.getGroupProjects().add(otherProject);
////        otherProject.getStudents().add(student);
//        studentRepository.update(student);


//        Major major1 = majorRepository.findOne(1);
//        System.out.println(major1);
//        major1.setStudentList(major1.getStudentList());

//        major.setMajorName("Informatics");
//        majorRepository.create(major);
////
//        userCredential.setUserName("saydinaambiya");
//        userCredential.setPassword("123");
//        authenticationRepository.create(userCredential);
////
//        student.setFirstName("Saydina");
//        student.setLastName("Ambiya");
//        student.setGender(Gender.M);
//        student.setBirthDate(Date.valueOf("2000-04-16"));
//        student.setMajor(major);
//        student.setUserCredential(userCredential);
//        studentRepository.create(student);


//


//        major.setStudentList();
//        majorRepository.create(major);



//        userCredential.setUserName("sayinaambiya");
//        userCredential.setPassword("123");

//        authenticationRepository.create(userCredential);

//        student.setFirstName("Saydina");
//        student.setLastName("Ambiya");
//        student.setMajor("TI");
//        student.setBirthDate(Date.valueOf("2000-04-16"));
//        student.setGender(Gender.M);
//        student.setUserCredential(userCredential);
//        userCredential.setStudent(student);
//        studentRepository.create(student);



//        studentRepository.delete(1);
//        student.setStudentId(2);
//        student.setFirstName("Saydina");
//        student.setLastName("Ambiya");
//        student.setGender(Gender.M);
//        student.setMajor("Informatics");
//        student.setBirthDate(Date.valueOf("2000-04-16"));
//        studentRepository.create(student);
//        System.out.println(studentRepository.findOne(1));
//        studentRepository.update(student);
//        System.out.println(studentRepository.findAll(1, 1));


        //update nilai point

        Student student1 = studentRepository.findOne(3);
        student1.getProjectWithPoints().get(0).setPoint(100);
        studentRepository.update(student1);



    }
}
