package controller;

import model.student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private static final String StudentInformation = "src/files/students.txt";

    public List<student> getAllStudents(){
        List<student> students = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(StudentInformation))){

            String line;
            while((line = br.readLine()) != null){
                String[] data = line.split(",");
                student s = new student(
                        data[0],
                        data[1],
                        data[2],
                        data[3],
                        data[4],
                        Double.parseDouble(data[5])
                );
                students.add(s);
            }

        }catch (Exception e){
            System.out.println("Failed to read students files" + e);
        }
        return students;
    }

    public void addStudent(student s){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(StudentInformation, true))){
            String data = s.getId() + ","+ s.getName()+ ","+ s.getProgram() + ","+ s.getBatch() + "," +s.getPassword() + "," + s.getCgpa();
            bw.write(data);
            bw.newLine();
            System.out.println("Student added successfully");
        }catch (Exception e){
            System.out.println("Failed to add students");
        }
    }
    public student getStudentsById(String id){

        try(BufferedReader br = new BufferedReader(new FileReader(StudentInformation))){
            String line;

            while((line = br.readLine()) != null){
                String[] data = line.split(",");
                if (data[0].equals(id)){
                    return new student(
                            data[0],
                            data[1],
                            data[2],
                            data[3],
                            data[4],
                            Double.parseDouble(data[5])
                    );
                }
            }


        }catch (Exception e){
            System.out.println("Failed to read students files" + e);
        }
        return null;
    }
}
