package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFIO("Eugene Podobny");
        student.setGroup("1A");
        student.setEntrance(new Date());
        System.out.println(student.getFIO() + " studies in group " + student.getGroup() + " since " + student.getEntrance());
    }
}
