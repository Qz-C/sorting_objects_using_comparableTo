package model.entities;

public class Student implements Comparable<Student> {
    private String name;
    private Double grade;

    public Student(){

    }

    public Student(String name, Double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "Name: " + String.format("%10s", name) + "     Grade: " + grade;
    }

    @Override
    public int compareTo(Student other) {
        return -Double.compare(grade, other.getGrade());
    }
}
