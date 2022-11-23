package com.enigmacamp.erjpa.entity;

import com.enigmacamp.erjpa.constants.Gender;
import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "m_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private long studentId;
    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;
    @Column(name = "last_name", length = 50)
    private String lastName;
    @Column(columnDefinition = "varchar(1)")
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "major_id")
    private Major major;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "credential_id")
    private UserCredential userCredential;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date", nullable = false)
    private Date birthDate;

//    @ManyToMany
//    @JoinTable(name = "m_student_project", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
//    private List<GroupProject> groupProjects = new ArrayList<>();

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<GroupProjectWithPoint> projectWithPoints = new ArrayList<>();


    public List<GroupProjectWithPoint> getProjectWithPoints() {
        return projectWithPoints;
    }

    public void setProjectWithPoints(List<GroupProjectWithPoint> projectWithPoints) {
        this.projectWithPoints = projectWithPoints;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public UserCredential getUserCredential() {
        return userCredential;
    }

    public void setUserCredential(UserCredential userCredential) {
        this.userCredential = userCredential;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", gender=" + gender + ", major='" + major + '\'' + ", birthDate=" + birthDate + '}';
    }
}

