package az.edu.turing.tasks;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student>students=new ArrayList<>();
    public void addStudent(Student student){
        students.add(student);
        System.out.println(student.getName() + " added successfully!");
    }
    public void removeStudentById(int id){
        boolean removed=students.removeIf(student -> student.getId()==id);
        if(removed){
            System.out.println("Student with Id " + id+ " removed successfully!");
        }else System.out.println("Student with Id " + id + " not found!");
    }
    public void findStudentByName(String name){
        boolean found=false;
        for(Student student:students){
            if(student.getName().equalsIgnoreCase(name)){
                System.out.println("Found: " + student);
                found = true;
            }
        }
        if(!found){
            System.out.println("No student found with name: "+ name);
        }
    }
    public void listStudents(){
        if(students.isEmpty()){
            System.out.println("No students available");
            for(Student student:students){
                System.out.println(student);
            }
        }
    }
}
