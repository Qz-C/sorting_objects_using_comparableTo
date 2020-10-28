package application;

import model.entities.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException {

        List<Student> students =  new ArrayList<Student>();

        final String path = "c:\\temp\\in.cvs";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){
                    String[] values = line.split(",");
                    students.add(new Student(values[0], Double.parseDouble(values[1])));
                    line = br.readLine();
                }
            Collections.sort(students);
            for(Student student : students){
                System.out.println(student);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
